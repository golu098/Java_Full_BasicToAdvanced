package Map;

import java.util.EnumMap;

enum years1{
    January, February, March, April, May, June, July, August, September, October, November, December;

}
public class EnumMapCode {
    public static void main(String[] args) {
        EnumMap<years1,String> map = new EnumMap<years1,String>(years1.class);
        map.put(years1.January, "Republic Day");
        map.put(years1.February, "Sarswati Puja");
        map.put(years1.March, "Holi");
        map.put(years1.April, "Fool Day");
//        map.put(Map.years1.April, "Fool Day");
        map.put(years1.May, "summer Vacation");
        map.put(years1.June, "Holiday Assignment");
        map.put(years1.July, "Picnic Day");
        map.put(years1.August, "Independence Day");
        map.put(years1.September, "My Birthday");
        map.put(years1.October, "Durga Puja");
        map.put(years1.November, "Diwali");
        map.put(years1.December, "Winter Break");
        System.out.println(map.get(years1.January));
        System.out.println(map.get(years1.September));
    }
}
