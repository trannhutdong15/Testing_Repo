public class MathOperations {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + add(5, 3));
        System.out.println("Difference: " + subtract(5, 3));
        System.out.println("Product: " + multiply(5, 3));
        System.out.println("Quotient: " + divide(5, 3));
    }
}
