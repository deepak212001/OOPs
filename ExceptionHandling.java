
public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result); // This line won't execute if an exception occurs
        } catch (ArithmeticException e) {
            // Handling specific exception
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } finally {
            // Code that will execute regardless of whether an exception occurred or not
            System.out.println("Finally block executed");
        }

        // Other code continues here
    }

    // Method that throws an exception
    public static int divide(int a, int b) {
        return a / b;
    }
}
