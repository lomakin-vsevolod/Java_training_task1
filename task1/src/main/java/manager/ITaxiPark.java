package manager;

import model.Car;

import java.util.List;

public interface ITaxiPark {

    Car getCar(int i);
    void addCar(Car car);
    void deleteCar(int i);
    int getSize();
    List<Car> getTaxiParkList();
    void setTaxiParkList(List<Car> carList);
    int getSummaryCost();

}
