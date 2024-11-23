package Set;

import java.util.*;
enum years{
   January, February, March, April, May, June, July, August, September, October, November, December;

}
public class EnumSetCode {
    public static void main(String[] args) {
        Set<years> obj=EnumSet.allOf(years.class);
        Set<years> obj1=EnumSet.noneOf(years.class);
        Set<years> obj2=EnumSet.of(years.July);
//        Set<Set.years> obj3=EnumSet.complementOf(Set.years);


        System.out.println("Creates a set that will contain all the elements in the specified type:-"+obj);
        System.out.println("Creates an empty set of numbered constants with the specified element type:-"+obj1);
        System.out.println("Creates a set initially containing the specified elements :-"+obj2);
    }
}
