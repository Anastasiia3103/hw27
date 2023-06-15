package builder;

class Car {
    private String make;
    private String model;
    private int year;

    public Car (String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public int getYear () {
        return year;
    }

    public String getMake () {
        return make;
    }

    public String getModel () {
        return model;
    }

    public static class CarBuilder {

        public builder.CarBuilder setMake (String mazda) {
            return null;
        }
    }
}

