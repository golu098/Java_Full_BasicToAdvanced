package techCheck;
 class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String OS;
    // Constructor is private to enforce the use of the Builder
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        this.OS = builder.OS;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", GPU='" + GPU + '\'' +
                ", OS='" + OS + '\'' +
                '}';
    }
    // Static inner Builder class
    public static class ComputerBuilder {
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;
        private String OS;
        public ComputerBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public ComputerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }
        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public ComputerBuilder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
        public ComputerBuilder setOS(String OS) {
            this.OS = OS;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
public class BuilderSolution1 {
    public static void main(String[] args) {
        // Using Builder pattern to create a Computer object
        Computer computer = new Computer.ComputerBuilder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGPU("NVIDIA GTX 1650")
                .setOS("Windows 10")
                .build();
        // Display the created Computer object
        System.out.println(computer);
    }
}

