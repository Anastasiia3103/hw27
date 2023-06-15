package design;

class TriangleAreaCalculator implements ShapeAreaCalculator {
    @Override
    public double calculateArea(double... dimensions) {
        double base = dimensions[0];
        double height = dimensions[1];
        return 0.5 * base * height;
    }
}
