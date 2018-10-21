package model;

public abstract class Car {

    private String brand;
    private String model;
    private int cost;
    private int consumption;
    private int maxSpeed;

    public Car() {
        super();
    }

    public Car(String brand, String model, int cost, int consumption, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.cost = cost;
        this.consumption = consumption;
        this.maxSpeed = maxSpeed;
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

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                ", consumption=" + consumption +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (getCost() != car.getCost()) return false;
        if (getConsumption() != car.getConsumption()) return false;
        if (getMaxSpeed() != car.getMaxSpeed()) return false;
        if (getBrand() != null ? !getBrand().equals(car.getBrand()) : car.getBrand() != null) return false;
        return getModel() != null ? getModel().equals(car.getModel()) : car.getModel() == null;
    }

    @Override
    public int hashCode() {
        int result = getBrand() != null ? getBrand().hashCode() : 0;
        result = 31 * result + (getModel() != null ? getModel().hashCode() : 0);
        result = 31 * result + getCost();
        result = 31 * result + getConsumption();
        result = 31 * result + getMaxSpeed();
        return result;
    }
}
