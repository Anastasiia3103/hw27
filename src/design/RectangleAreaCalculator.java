package design;

class RectangleAreaCalculator implements ShapeAreaCalculator {
    @Override
    public double calculateArea(double... dimensions) {
        double length = dimensions[0];
        double width = dimensions[1];
        return length * width;
    }
}
