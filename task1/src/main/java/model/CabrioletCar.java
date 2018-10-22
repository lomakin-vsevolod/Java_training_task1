package model;

import model.interfaces.ICabrioletCar;

import java.util.Objects;

public class CabrioletCar extends GasolineCar implements ICabrioletCar {

    private boolean isRoofOpen;

    public CabrioletCar() {
        super();
    }

    public CabrioletCar(String brand, String model, int cost, int consumption, int maxSpeed, String fuelType, int fuelConsumption, boolean isRoofOpen) {
        super(brand, model, cost, consumption, maxSpeed, fuelType, fuelConsumption);
        this.isRoofOpen = isRoofOpen;
    }

    @Override
    public void openRoof() {
        isRoofOpen=true;
    }

    @Override
    public void closeRoof() {
        isRoofOpen=false;
    }

    @Override
    public boolean isRoofOpen() {
        return isRoofOpen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CabrioletCar)) return false;
        if (!super.equals(o)) return false;
        CabrioletCar that = (CabrioletCar) o;
        return isRoofOpen() == that.isRoofOpen();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isRoofOpen());
    }

    @Override
    public String toString() {
        return "CabrioletCar{" +
                "isRoofOpen=" + isRoofOpen +
                '}';
    }
}
