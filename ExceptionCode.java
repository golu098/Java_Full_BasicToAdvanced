package src;

// Custom exception class
class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

class ExceptionCode {

    // Method that uses throws to declare that it may throw CustomArithmeticException
    public static void validateDivision(int a, int b) throws CustomArithmeticException {
        if (b == 0) {
            // Using throw to throw the custom exception
            throw new CustomArithmeticException("Custom Exception: Division by zero");
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0; // Changed to avoid division by zero error

        try {
            // Calling the method that throws a custom exception
            validateDivision(a, b);
            int c = a / b; // This will throw an ArithmeticException if b is zero

            // multiple try-catch
            try {
                int d = a % b; // This will also throw an ArithmeticException if b is zero
            } catch (ArithmeticException e) {
                System.out.println("Inner try block exception: " + e);
            }

        }
        catch (CustomArithmeticException e) {  // Catching custom exception
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Outer try block exception: " + e);
        } catch (NullPointerException e) {
            System.out.println("Multiple catch block exception: " + e);
        } catch (RuntimeException | IncompatibleClassChangeError e) {
            System.out.println("Nested catch " + e);
        } finally {
            System.out.println("Hello, I am executed, and I am the finally block");
        }
    }
}
