package src;

public class StringCode {
    public static void main(String[] args) {
        String firstName="Shiv";
        String lastName="Shiv";
        String firstName2="Golu";
        String lastName2="Sharma";
        System.out.println("String Builder and Buffer Concept starts:-");
        StringBuilder obj=new StringBuilder(firstName2);

        StringBuffer obj2=new StringBuffer(lastName2);
        System.out.println("By the help of StringBuffer "+ obj2);
        System.out.println("By the help ofStringBuilder:- "+obj);
        System.out.println(firstName.hashCode()==lastName.hashCode());
//        String fullName=firstName+" "+lastName;//  overloaded operators
        String fullName=firstName.concat(lastName);// Method concat()
        System.out.println("Concatenation of two string concat():" +fullName);
        System.out.println("charAt (Fetching Specific Index Element):" +fullName.charAt(3));
        System.out.println("Finding substring with only one index:" +fullName.substring(4));
        System.out.println("Finding substring with start and end index:" +fullName.substring(0,4));
        System.out.println("finding character index:" +fullName.indexOf('a'));
        System.out.println("finding character index from last :" +fullName.lastIndexOf('a'));
        System.out.println("finding character index:" +fullName.indexOf("Shiv",0));
        System.out.println("Replace char" +fullName.replace('a','b'));
        System.out.println("Replace String:" +fullName.replace("Kant","Kumar"));
        System.out.println("Convert String to Lowercase:" +fullName.toLowerCase());
        System.out.println("Convert String to Uppercase:" +fullName.toUpperCase());
//    System.exit(0);

    }
}
