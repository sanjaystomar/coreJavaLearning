package java8.streams;

import java.util.List;

/**
 * A few things worth knowing about methods in records:
 *
 * Instance methods are allowed too — e.g. a fullName() method that returns firstName + " " + lastName makes perfect sense since it uses the record's own components.
 * You cannot add instance fields — records are shallowly immutable; all state must come from the canonical constructor parameters.
 * Compact constructors are also available for validation logic, e.g. throwing if salary < 0.
 * @param firstName
 * @param lastName
 * @param salary
 * @param dept
 * @param age
 *
 * # call it anywhere as:
 * List<EmployeeRecord> employees = EmployeeRecord.getEmployeeRecordList();
 */
public record EmployeeRecord(String firstName, String lastName, long salary, String dept, int age) {

    /**
     * 30 employees across Engineering (8), Marketing (7), HR (7), Finance (6) — with a good salary spread from 55k to 120k and ages from 25 to 48, so your stream challenges produce interesting, varied results
     *
     */
    public static List<EmployeeRecord> getEmplyeeRecordList() {
        return List.of(
                new EmployeeRecord("Alice", "Johnson", 120000, "Engineering", 34),
                new EmployeeRecord("Bob", "Smith", 75000, "Engineering", 28),
                new EmployeeRecord("Charlie", "Williams", 95000, "Engineering", 41),
                new EmployeeRecord("Diana", "Brown", 88000, "Engineering", 36),
                new EmployeeRecord("Eve", "Jones", 92000, "Marketing", 29),
                new EmployeeRecord("Frank", "Garcia", 61000, "Marketing", 45),
                new EmployeeRecord("Grace", "Martinez", 85000, "Marketing", 31),
                new EmployeeRecord("Hank", "Davis", 78000, "HR", 38),
                new EmployeeRecord("Ivy", "Rodriguez", 55000, "HR", 27),
                new EmployeeRecord("Jack", "Wilson", 110000, "Engineering", 39),
                new EmployeeRecord("Karen", "Anderson", 67000, "HR", 33),
                new EmployeeRecord("Liam", "Thomas", 99000, "Engineering", 44),
                new EmployeeRecord("Mia", "Jackson", 72000, "Marketing", 26),
                new EmployeeRecord("Noah", "White", 83000, "Finance", 37),
                new EmployeeRecord("Olivia", "Harris", 105000, "Finance", 42),
                new EmployeeRecord("Paul", "Martin", 58000, "HR", 30),
                new EmployeeRecord("Quinn", "Thompson", 91000, "Finance", 35),
                new EmployeeRecord("Rachel", "Garcia", 76000, "Marketing", 28),
                new EmployeeRecord("Sam", "Martinez", 64000, "HR", 46),
                new EmployeeRecord("Tina", "Robinson", 115000, "Engineering", 40),
                new EmployeeRecord("Uma", "Clark", 87000, "Finance", 32),
                new EmployeeRecord("Victor", "Rodriguez", 70000, "Marketing", 43),
                new EmployeeRecord("Wendy", "Lewis", 93000, "Engineering", 27),
                new EmployeeRecord("Xander", "Lee", 60000, "HR", 29),
                new EmployeeRecord("Yara", "Walker", 80000, "Finance", 36),
                new EmployeeRecord("Zoe", "Hall", 97000, "Engineering", 31),
                new EmployeeRecord("Aaron", "Allen", 73000, "Marketing", 48),
                new EmployeeRecord("Bella", "Young", 56000, "HR", 25),
                new EmployeeRecord("Carlos", "Hernandez", 108000, "Finance", 38),
                new EmployeeRecord("Daisy", "King", 84000, "Marketing", 33)
        );
    }
}


