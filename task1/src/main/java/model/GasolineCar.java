package model;

public class GasolineCar extends Car {

    private String fuelType;
    private int fuelConsumption;

    public GasolineCar() {
        super();
    }

    public GasolineCar(String brand, String model, int cost, int consumption, int maxSpeed, String fuelType, int fuelConsumption) {
        super(brand, model, cost, consumption, maxSpeed);
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "GasolineCar{" +
                "fuelType='" + fuelType + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GasolineCar)) return false;
        if (!super.equals(o)) return false;

        GasolineCar that = (GasolineCar) o;

        if (getFuelConsumption() != that.getFuelConsumption()) return false;
        return getFuelType() != null ? getFuelType().equals(that.getFuelType()) : that.getFuelType() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getFuelType() != null ? getFuelType().hashCode() : 0);
        result = 31 * result + getFuelConsumption();
        return result;
    }
}
