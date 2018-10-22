package helper;

import model.Car;
import model.ElectricCar;
import org.apache.log4j.Logger;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaxiParkListHelper {

    private final static Logger logger = Logger.getLogger(TaxiParkListHelper.class);

    public static List<Car> searchCarBySpeed(List<Car> carList, int speedMin, int speedMax) {
        List<Car> result = new ArrayList<Car>();

        if (speedMax < speedMin) {
            logger.error("InvalidParameterException: speedMax<speedMIn");
            throw new InvalidParameterException();
        }

        for (Car car : carList) {
            if (car.getMaxSpeed() >= speedMin && car.getMaxSpeed() <= speedMax) {
                result.add(car);
            }
        }
        logger.debug("result=" + result.toString());
        return result;
    }

    public static List<Car> sortCarByConsumption(List<Car> carList) {
        List<Car> sortedList = new ArrayList<Car>(carList);

        sortedList.sort(new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.getConsumption(), o2.getConsumption());
            }
        });

        logger.debug("sort result=" + sortedList.toString());
        return sortedList;
    }

    public static List<Car> sortReverseCarByConsumption(List<Car> carList){
        List<Car> reverseList = sortCarByConsumption(carList);

        Collections.reverse(reverseList);

        logger.debug("reverse sort result="+reverseList.toString());
        return reverseList;

    }

}
