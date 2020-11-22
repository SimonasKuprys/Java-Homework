package edu.protectedkeywordAndEnum;

public class Car {
    private final String brand;
    private final String model;
    private final FuealType fuealType;

    public Car(String brand, String model, FuealType fuealType) {
        this.brand = brand;
        this.model = model;
        this.fuealType = fuealType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public FuealType getFuealType() {
        return fuealType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuealType=" + fuealType.getDescription() +
                '}';
    }
}
