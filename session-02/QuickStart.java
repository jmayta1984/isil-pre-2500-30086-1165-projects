public class QuickStart {

    public static void greeting() {
        System.out.println("Hello, ISIL");
    }

    public static void greeting(String name) {
        System.out.println("Hello, " + name);
    }

    public static void arithmeticOperations(int a, int b) {

        System.out.println("Arithmetic operations");

        // addition operation
        System.out.println("a + b = " + (a + b));

        // substraction operation
        System.out.println("a - b = " + (a - b));
    }

    private static int area(int width, int height) {
        return width * height;
    }

    public static void showArea(int width, int height) {
        System.out.println ("Area: " + area(width, height));
    }

    private static int perimeter(int width, int height){
        return 2 * (width + height);
    }

    public static void showPerimeter(int width, int height) {
        System.out.println ("Perimeter: " + perimeter(width, height));
    }

}