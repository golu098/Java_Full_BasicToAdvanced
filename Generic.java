package src;
class Generic<I, S> {
    I age;
    S name;

    // Constructor to initialize generic fields
    public  Generic(I age, S name) {
        this.age = age;
        this.name = name;
    }

    // Method to return age
    public I f(I age) {
        return age;
    }

    public static void main(String[] args) {
        // Create an object of the generic class with specified types
        Generic<Integer, String> obj = new Generic<>(10, "Shiv");

        // Use the object to call the f() method
        System.out.println("Age: " + obj.f(obj.age));
        System.out.println("Name: " + obj.name);
    }
}
