class Calculator {

    // Addition
    static int add(int a, int b) { return a + b; }
    static double add(double a, double b) { return a + b; }

    // Subtraction
    static int subtract(int a, int b) { return a - b; }
    static double subtract(double a, double b) { return a - b; }

    // Multiplication
    static int multiply(int a, int b) { return a * b; }
    static double multiply(double a, double b) { return a * b; }

    // Division with zero-check
    static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero for integers!");
            return 0;
        }
        return a / b;
    }

    static double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Error: Division by zero for doubles!");
            return 0.0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        // Integer operations
        System.out.println("Integer Addition: " + add(10, 5));
        System.out.println("Integer Subtraction: " + subtract(10, 5));
        System.out.println("Integer Multiplication: " + multiply(10, 5));
        System.out.println("Integer Division: " + divide(10, 5));

        // Double operations
        System.out.println("Double Addition: " + add(10.5, 5.2));
        System.out.println("Double Subtraction: " + subtract(10.5, 5.2));
        System.out.println("Double Multiplication: " + multiply(10.5, 5.2));
        System.out.println("Double Division: " + divide(10.5, 5.2));
    }
}