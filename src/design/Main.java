package design;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Shape();
        rectangle.setAreaCalculator(new RectangleAreaCalculator());
        double rectangleArea = rectangle.calculateArea(5, 10);
        System.out.println("Rectangle area: " + rectangleArea);

        Shape triangle = new Shape();
        triangle.setAreaCalculator(new TriangleAreaCalculator());
        double triangleArea = triangle.calculateArea(4, 6);
        System.out.println("Triangle area: " + triangleArea);
    }
}