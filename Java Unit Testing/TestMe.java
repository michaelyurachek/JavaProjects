public class TestMe {

    // Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts b from a
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplies two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides a by b
    public double divide(double a, double b) {
        return a / b;
    }

    // Checks if number is even
    public boolean isEven(int a) {
        return a % 2 == 0;
    }

    // Checks if substring exists in string
    public boolean containsSubstring(String str, String sub) {
        return str.contains(sub);
    }
}