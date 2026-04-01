package java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *  Your goal:
 *  Map<String, List<Employee>> result = ???
 *  - grouped by department
 *  - only employees with salary > 80000
 *  - max 3 per department, sorted highest salary first
 */
public class StreamExample1EmpSalMaxDept {

//    record Employee(String name, String department, int salary) {}

    static List<EmployeeRecord> employees = EmployeeRecord.getEmplyeeRecordList();

    static void main() {
        Map<String, List<EmployeeRecord>> departEmpMap = employees.stream().collect(Collectors.groupingBy(EmployeeRecord::dept));
        List<EmployeeRecord> _80kGTSalEmpList = employees.stream().filter(emp -> emp.salary() > 80000).toList();
//        employees.stream().collect(Collectors.groupingBy(Employee::department)).entrySet().stream().map(Map.Entry::getValue).

        /*employees.stream().filter(emp -> emp.salary() > 80000)
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.<Employee>toList(),
                        list -> list.stream().sorted(Comparator.comparingInt(Employee::salary)
                                .reversed())
                                .limit(3)
                                .toList())
                ));*/


        Map<String, Optional<EmployeeRecord>> maxSalariedEmpPerDept = employees.stream()
                .filter(emp -> emp.salary() > 80000)
                .collect(Collectors.groupingBy(
                        EmployeeRecord::dept,
                        Collectors.maxBy(Comparator.comparingInt(EmployeeRecord::age))
                ));

//        System.out.println(maxSalariedEmpPerDept.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : " + Optional.ofNullable(e.getValue()).ifPresentOrElse("DUMMY"))));


        Map<String, List<EmployeeRecord>> result = employees.stream()
                .filter(e -> e.salary() > 80_000)
                .collect(Collectors.groupingBy(
                        EmployeeRecord::dept,
                        Collectors.toUnmodifiableList()
                ))
                .entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,      // Key-Mapper
                        e -> e.getValue().stream()                  // value-mapper
                                .sorted(Comparator.comparingInt(EmployeeRecord::age).reversed())
                                .limit(1)
                                .toList()
                ));

/*
    Map<String, List<Employee>> result = employees.stream()
.filter(e -> e.salary() > 80_000)               // 1. filter BEFORE grouping
.collect(Collectors.groupingBy(
    Employee::department,                        // 2. classify into buckets
    Collectors.collectingAndThen(                // 3. downstream: process each bucket
        Collectors.toList(),                     //    a. collect bucket into list
        list -> list.stream()
            .sorted(Comparator
                .comparingInt(Employee::salary)
                .reversed())                     //    b. sort highest first
            .limit(3)                            //    c. take top 3
            .toList()
    )
));
```

Expected output:
```
Engineering=[Alice(120000), Charlie(95000), Diana(88000)]
Marketing=[Eve(92000), Grace(85000)]
HR=[]  // Hank is 78000 — filtered out before grouping

         */
    }


}
