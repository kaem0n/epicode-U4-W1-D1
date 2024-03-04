public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("1) metodo rectanglePerimeter(3.2, 8): " + rectanglePerimeter(3.2, 8));
        System.out.println("2a) metodo evenOrOdd(4): " + evenOrOdd(4));
        System.out.println("2b) metodo evenOrOdd(5): " + evenOrOdd(5));
        System.out.println("3a) metodo triangleArea(2, 3, 4): " + triangleArea(2, 3, 4));
        System.out.println("3b) metodo triangleArea(5, 6, 7): " + triangleArea(5, 6, 7));
    }

    public static double rectanglePerimeter(double width, double height) {
        return (width + height) * 2;
    }

    public static int evenOrOdd(int num) {
        return num % 2 == 0 ? 0 : 1;
    }

    public static double triangleArea(double side1, double side2, double side3) {
        double semiperimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
    }
}
