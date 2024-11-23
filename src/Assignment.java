import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private double percentage;

    public Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', percentage=" + percentage + '}';
    }
}

public class Assignment {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("shiv kant", 87.2),
                new Student("Golu", 35.90),
                new Student("Radhe", 57.65),
                new Student("sita", 95.20),
                new Student("Bhole", 89.0)
        );

        Map<Boolean, List<Student>> partitionedStudents = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getPercentage() > 60));

        List<Student> above60Percent = partitionedStudents.get(true);


        System.out.println("Students who got above 60%: " + above60Percent);


        List<String> top3Students = students.stream()
                .sorted(Comparator.comparingDouble(Student::getPercentage).reversed())
                .limit(3)
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("Top 3 Performing Students: " + top3Students);
    }
}
