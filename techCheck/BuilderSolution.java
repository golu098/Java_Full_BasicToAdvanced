package techCheck;

class BuilderSolution {

    // Fields are final to ensure immutability
    private final int a;
    private final int b;
    private final String c;

    // Private constructor to enforce use of Builder
    private BuilderSolution(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
    }

    @Override
    public String toString() {
        return "This is value of a: " + a + " and value of b: " + b + " and value of c: " + c;
    }

    // Nested static Builder class
    public static class Builder {
        private int a;
        private int b;
        private String c;

        // Methods to set individual values
        public Builder setA(int a) {
            this.a = a;
            return this;
        }

        public Builder setB(int b) {
            this.b = b;
            return this;
        }

        public Builder setC(String c) {
            this.c = c;
            return this;
        }

        // Build method to construct the final object
        public BuilderSolution build() {
            return new BuilderSolution(this);
        }
    }

    public static void main(String[] args) {
        // Using the builder pattern to create an object
        BuilderSolution obj = new BuilderSolution.Builder()
                .setA(1)
                .setB(2)
                .setC("Example")
                .build();

        System.out.println(obj);
    }
}
