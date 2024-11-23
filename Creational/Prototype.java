package Creational;

import java.util.ArrayList;
import java.util.List;

public class Prototype implements Cloneable {
    private int sid;
    private String saloonName; // Follow Java naming conventions (lowercase for variable names)

    // Getter for sid
    public int getSid() {
        return sid;
    }

    // Setter for sid
    public void setSid(int sid) {
        this.sid = sid;
    }

    // Getter for saloonName
    public String getSaloonName() {
        return saloonName;
    }

    // Setter for saloonName
    public void setSaloonName(String saloonName) {
        this.saloonName = saloonName; // Corrected variable name
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "sid=" + sid +
                ", saloonName='" + saloonName + '\'' + // Corrected variable name
                '}';
    }

    // Implement the clone method
    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public static void main(String[] args) {
        try {
            // Create an original Prototype object
            Prototype original = new Prototype();
            original.setSid(1);
            original.setSaloonName("Original Saloon");

            // Clone the original object
            Prototype cloned = original.clone();

            // Modify the cloned object
            cloned.setSid(2);
            cloned.setSaloonName("Cloned Saloon");

            // Print the original and cloned objects
            System.out.println("Original Object: " + original);
            System.out.println("Cloned Object: " + cloned);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
