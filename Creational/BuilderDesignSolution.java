package Creational;

class Laptop1 {
    private String os;
    private String processor;
    private double screensize;
    private int battery;
    private int camera;

    public Laptop1 setOs(String os) {
        this.os = os;
        return this;
    }

    public Laptop1 setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    @Override
    public String toString() {
        return "Creational.Laptop1{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", screensize=" + screensize +
                ", battery=" + battery +
                ", camera=" + camera +
                '}';
    }
}

public class BuilderDesignSolution {
    public static void main(String[] args) {
        Laptop1 obj = new Laptop1();
        obj.setOs("Windows 10");
        obj.setProcessor("Intel");
        System.out.println(obj);
    }
}
