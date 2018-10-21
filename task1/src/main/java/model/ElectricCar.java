package model;

public class ElectricCar extends Car {

    private String batteryType;
    private int powerConsumption;

    public ElectricCar() {
        super();
    }

    public ElectricCar(String brand, String model, int cost, int consumption, int maxSpeed, String batteryType, int powerConsumption) {
        super(brand, model, cost, consumption, maxSpeed);
        this.batteryType = batteryType;
        this.powerConsumption = powerConsumption;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryType='" + batteryType + '\'' +
                ", powerConsumption=" + powerConsumption +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ElectricCar)) return false;
        if (!super.equals(o)) return false;

        ElectricCar that = (ElectricCar) o;

        if (getPowerConsumption() != that.getPowerConsumption()) return false;
        return getBatteryType() != null ? getBatteryType().equals(that.getBatteryType()) : that.getBatteryType() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getBatteryType() != null ? getBatteryType().hashCode() : 0);
        result = 31 * result + getPowerConsumption();
        return result;
    }
}
