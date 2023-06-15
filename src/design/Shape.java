package design;

class Shape {
    private ShapeAreaCalculator areaCalculator;

    public void setAreaCalculator(ShapeAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public double calculateArea(double... dimensions) {
        if (areaCalculator == null) {
            throw new IllegalStateException("Area calculator is not set.");
        }
        return areaCalculator.calculateArea(dimensions);
    }
}
