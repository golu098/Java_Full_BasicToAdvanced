//package Others;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ComparableCode implements Comparable<ComparableCode> {
//    private String name;
//    private int age;
//
//    public ComparableCode(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    // int
//
//    @Override
//    public int compareTo(ComparableCode other) {
//        return Integer.compare(this.age, other.age);
//    }
//
//    @Override
//    public String toString() {
//        return name + ": " + age;
//    }
//
//    public static void main(String[] args) {
//        List<ComparableCode> people = new ArrayList<>();
//        people.add(new ComparableCode("John", 25));
//        people.add(new ComparableCode("Alice", 30));
//        people.sort(null); // sorting using natural order defined in compareTo
//        if()
//        System.out.println(people);
//    }
//}