package Creational;

// Step 1: Define the Creational.OS interface
interface OS1 {
    void spec();
}

// Step 2: Implement concrete Creational.OS classes
class Android1 implements OS1 {
    public void spec() {
        System.out.println("Hi, I am Creational.Android");
    }
}

class iOS1 implements OS1 {
    public void spec() {
        System.out.println("I am Creational.iOS");
    }
}

class Windows1 implements OS1 {
    public void spec() {
        System.out.println("I am Windows");
    }
}

// Step 3: Create an abstract factory class
abstract class OSFactory {
    public abstract OS createOS();
}

// Step 4: Implement concrete factory classes
class AndroidFactory extends OSFactory {
    @Override
    public OS createOS() {
        return new Android();
    }
}

class iOSFactory extends OSFactory {
    @Override
    public OS createOS() {
        return new iOS();
    }
}

class WindowsFactory extends OSFactory {
    @Override
    public OS createOS() {
        return new Window();
    }
}

// Step 5: Client code using the factory pattern
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        // Choose the factory based on input
        OSFactory factory;

        // Example: creating an Creational.iOS instance
        String osType = "Closed";  // You can change this value to "Open" or "Other" for different Creational.OS

        if (osType.equals("Open")) {
            factory = new AndroidFactory();
        } else if (osType.equals("Closed")) {
            factory = new iOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        // Create the Creational.OS using the chosen factory
        OS os = factory.createOS();
        os.spec();
    }
}
