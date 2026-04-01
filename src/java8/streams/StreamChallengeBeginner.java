package java8.streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamChallengeBeginner {
    static List<EmployeeRecord> employees = EmployeeRecord.getEmplyeeRecordList();
    static void main() {
        empOverSal80k();
        System.out.println("#############################################");
        uniqueDeptsWay1();
        System.out.println("=======================================");
        uniqueDeptsWay2();
        System.out.println("#############################################");
        totalEmpInEngineering();
        System.out.println("#############################################");
        totalCTC();
        System.out.println("=======================================");
        totalCTC1();
        empNameSorted();
        System.out.println("#############################################");
        highestSalaryWithReduce();
    }
    
    static void empOverSal80k(){
        Predicate<EmployeeRecord> sal80k = e -> e.salary() > 80000;
        List<EmployeeRecord> empSalGT80k = employees.stream()
                                                .filter(sal80k)
                                                .collect(Collectors.toList());
        empSalGT80k.forEach(System.out::println);
    }
    
    static void uniqueDeptsWay1(){
        List<String> uniDepts = employees.stream()
                                     .collect(Collectors.groupingBy(EmployeeRecord::dept))
                                     .entrySet()
                                     .stream()
                                     .map(Map.Entry::getKey)
                                     .toList();
        uniDepts.forEach(System.out::println);
    }
    static void uniqueDeptsWay2(){
        List<String> uniDepts = employees.stream()
                                         .map(EmployeeRecord::dept)
                                         .distinct()
                                         .toList();
        uniDepts.forEach(System.out::println);
    }
    
    static void totalCTC(){
        long CTC = employees.stream()
                            .mapToLong(EmployeeRecord::salary)
                            .sum();
        System.out.println("Total cost to company : "+CTC);
    }
    
    static void totalCTC1(){
        Long totCTC = employees.stream()
                               .map(EmployeeRecord::salary)
                               .reduce(0L, Long::sum);
        System.out.println("Total cost to company : "+totCTC);
    }
    
    static void totalEmpInEngineering(){}
    
    static void totalEmpInEachDept(){}
    
    static void empNameSorted(){}
    
    static void highestSalaryWithReduce(){
        Optional<Long> highstSal = employees.stream()
                                         .map(EmployeeRecord::salary)
                                         .reduce((a, b) -> a > b ? a : b);
        System.out.println("Highest Salary Using Reduce stream-op : "+highstSal.orElse(0L));
        
    }
}
/*
// Highest salary using reduce
Optional<Long> maxSalary = EmployeeRecord.getEmployeeRecordList()
                                         .stream()
                                         .map(EmployeeRecord::salary)
                                         .reduce((a, b) -> a > b ? a : b);

maxSalary.ifPresent(System.out::println); // 120,000*/
