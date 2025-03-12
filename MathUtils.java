public class MathUtils {

    public static int square(int num) {
        return num * num;
    }

    public static int cube(int num) {
        return num * num * num;
    }

    public static double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        int num1 = 4, num2 = 3;
        System.out.println("Square of " + num1 + ": " + square(num1));
        System.out.println("Cube of " + num2 + ": " + cube(num2));
        System.out.println(num1 + " raised to the power of " + num2 + ": " + power(num1, num2));
    }
}
