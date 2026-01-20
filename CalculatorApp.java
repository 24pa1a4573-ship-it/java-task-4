// CalculatorApp.java
public class CalculatorApp {

    /* ===============================
       1. Calculator operations
       Each operation is a separate method
       =============================== */

    public static int add(int a, int b) {
        return a + b; // 4. return value used
    }

    public static double add(double a, double b) {  
        // 2. Method overloading (different parameter types)
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        // 6. Exception handling for divide-by-zero
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    // ✅ Modulo operator method added
    public static int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot perform modulo by zero");
        }
        return a % b;
    }

    /* ===============================
       3. Reusable utility method
       =============================== */

    public static void printResult(String operation, double result) {
        System.out.println(operation + " result: " + result);
    }

    /* ===============================
       5. Pass-by-value demonstration
       =============================== */

    public static void changeValue(int x) {
        x = 100; // This change will NOT affect original variable
        System.out.println("Inside changeValue(): x = " + x);
    }

    /* ===============================
       8. Testing each method independently
       =============================== */

    public static void main(String[] args) {

        // Testing add (int)
        int sumInt = add(10, 20);
        printResult("Addition (int)", sumInt);

        // Testing add (double) - method overloading
        double sumDouble = add(5.5, 2.5);
        printResult("Addition (double)", sumDouble);

        // Testing subtraction
        int diff = subtract(20, 5);
        printResult("Subtraction", diff);

        // Testing multiplication
        int product = multiply(4, 5);
        printResult("Multiplication", product);

        // Testing division with exception handling
        try {
            double quotient = divide(10, 2);
            printResult("Division", quotient);

            // Testing modulo
            int modResult = modulo(10, 3);
            printResult("Modulo", modResult);

            // This will cause divide-by-zero exception
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Testing pass-by-value
        int number = 50;
        System.out.println("Before changeValue(): number = " + number);
        changeValue(number);
        System.out.println("After changeValue(): number = " + number);

        // 7. Code is structured to reduce redundancy
        // (Reusable printResult method avoids repeated System.out.println calls)
    }
}