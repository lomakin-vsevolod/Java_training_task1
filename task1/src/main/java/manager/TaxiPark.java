package manager;

import manager.interfaces.ITaxiPark;
import model.Car;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class TaxiPark implements ITaxiPark {

    private final static Logger logger = Logger.getLogger(TaxiPark.class);

    private List<Car> taxiPark;
    private int summaryCost;

    public TaxiPark(List<Car> taxiPark) {
        this.taxiPark = taxiPark;
        calculateSummaryCost();
        logger.debug("TaxiPark created from list, summaryCost="+getSummaryCost());
    }

    public TaxiPark() {
        super();
        taxiPark = new ArrayList<Car>();
        summaryCost = 0;
        logger.debug("TaxiPark created");
    }

    public Car getCar(int i) {
        return taxiPark.get(i);
    }

    public void addCar(Car car) {
        summaryCost += car.getCost();
        taxiPark.add(car);
        logger.debug("Added car, summaryCost="+getSummaryCost());
    }

    public void deleteCar(int i) {
        summaryCost -= getCar(i).getCost();
        taxiPark.remove(i);
        logger.debug("Deleted car, summaryCost="+getSummaryCost());
    }

    public int getSize() {
        return taxiPark.size();
    }

    public List<Car> getTaxiParkList() {
        return taxiPark;
    }

    public void setTaxiParkList(List<Car> carList) {
        this.taxiPark = carList;
        calculateSummaryCost();
        logger.debug("Setted list, summaryCost="+getSummaryCost());
    }

    public int getSummaryCost() {
        return summaryCost;
    }

    private void calculateSummaryCost() {
        summaryCost = 0;
        for (Car car : this.taxiPark) {
            summaryCost += car.getCost();
        }
    }
}
