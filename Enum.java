package src;

import java.util.Arrays;

interface  A{
    void m();
}
public class Enum {
    public enum Months implements  A {
        January(31), February(28), March(31), April(30), May(31), June(30),
        July(31), August(31), September(30), October(31), November(30), December(31);

        private int days; // these are enum constants
        // public, static and final
        // since its final you cannot create child enums
        // type is months
        // enum can implements as many as interface you want
//        enum months(int days) {
//            this.days = days;
//        }

        Months(int days) { // Constructor for the enum
            this.days = days;
        }

        public int getDays() {
            return days;
        }

        public void m() {
            System.out.println("Hi, I am from the interface");
        }
    }
    // this is not public or protected, only private or default
    // why? we dont want to create new objects
    // this is not the enum concept, thats why

    // internally: public static final months March = new months();
//    can not extends anything in enum and enum can not be superclass either
    public static void main(String[] args) {
        Months month = Months.March;
        System.out.println(month);
        System.out.println("Ordinal method is called:- " + month.ordinal());
        System.out.println("valueOf method is called:- " + Months.valueOf("April"));
        System.out.println("value method is called:- " + Arrays.toString(Months.values()));
        System.out.println("current constant exactly declared in the enum is:- " + month.name());
        System.out.println("hashcode method is called:- " + month.hashCode());
        System.out.println("Days in " + month + ": " + month.getDays());
        month.m();

    }
}
