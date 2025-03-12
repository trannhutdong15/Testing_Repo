public class MathUtils {

    public static int square(int num) {
        return num * num;
    }

    public static int cube(int num) {
        return num * num * num;
    }

    public static void main(String[] args) {
        System.out.println("Square of 4: " + square(4));
        System.out.println("Cube of 3: " + cube(3));
    }
}
