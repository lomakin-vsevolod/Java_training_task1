package com.epam.training.dto;

public class CarDTO {

    private String brand;
    private String model;
    private int cost;
    private int consumption;
    private int maxSpeed;
    private String batteryType;
    private int powerConsumption;
    private String fuelType;
    private int fuelConsumption;
    private String carType;

    public CarDTO() {
        super();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
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

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                ", consumption=" + consumption +
                ", maxSpeed=" + maxSpeed +
                ", batteryType='" + batteryType + '\'' +
                ", powerConsumption=" + powerConsumption +
                ", fuelType='" + fuelType + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", carType='" + carType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarDTO)) return false;

        CarDTO carDTO = (CarDTO) o;

        if (getCost() != carDTO.getCost()) return false;
        if (getConsumption() != carDTO.getConsumption()) return false;
        if (getMaxSpeed() != carDTO.getMaxSpeed()) return false;
        if (getPowerConsumption() != carDTO.getPowerConsumption()) return false;
        if (getFuelConsumption() != carDTO.getFuelConsumption()) return false;
        if (getBrand() != null ? !getBrand().equals(carDTO.getBrand()) : carDTO.getBrand() != null) return false;
        if (getModel() != null ? !getModel().equals(carDTO.getModel()) : carDTO.getModel() != null) return false;
        if (getBatteryType() != null ? !getBatteryType().equals(carDTO.getBatteryType()) : carDTO.getBatteryType() != null)
            return false;
        if (getFuelType() != null ? !getFuelType().equals(carDTO.getFuelType()) : carDTO.getFuelType() != null)
            return false;
        return getCarType() != null ? getCarType().equals(carDTO.getCarType()) : carDTO.getCarType() == null;
    }

    @Override
    public int hashCode() {
        int result = getBrand() != null ? getBrand().hashCode() : 0;
        result = 31 * result + (getModel() != null ? getModel().hashCode() : 0);
        result = 31 * result + getCost();
        result = 31 * result + getConsumption();
        result = 31 * result + getMaxSpeed();
        result = 31 * result + (getBatteryType() != null ? getBatteryType().hashCode() : 0);
        result = 31 * result + getPowerConsumption();
        result = 31 * result + (getFuelType() != null ? getFuelType().hashCode() : 0);
        result = 31 * result + getFuelConsumption();
        result = 31 * result + (getCarType() != null ? getCarType().hashCode() : 0);
        return result;
    }
}
