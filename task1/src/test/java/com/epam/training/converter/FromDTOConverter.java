package com.epam.training.converter;

import com.epam.training.dto.CarDTO;
import model.Car;
import model.CarType;
import model.ElectricCar;
import model.GasolineCar;
import org.apache.log4j.Logger;

public class FromDTOConverter implements IFromDTOConverter {

    private final static Logger logger = Logger.getLogger(FromDTOConverter.class);

    public Car convertToCarFromDTO(CarDTO carDTO) {
        if (carDTO.getCarType() != null) {
            if (carDTO.getCarType().equals(CarType.electric.toString())) {
                ElectricCar car = new ElectricCar();
                car.setBrand(carDTO.getBrand());
                car.setModel(carDTO.getModel());
                car.setCost(carDTO.getCost());
                car.setConsumption(carDTO.getConsumption());
                car.setMaxSpeed(carDTO.getMaxSpeed());
                car.setBatteryType(carDTO.getBatteryType());
                car.setPowerConsumption(carDTO.getPowerConsumption());
                logger.debug("Returned electric car: " + car.toString());
                return car;
            } else if (carDTO.getCarType().equals(CarType.gasoline.toString())) {
                GasolineCar car = new GasolineCar();
                car.setBrand(carDTO.getBrand());
                car.setModel(carDTO.getModel());
                car.setCost(carDTO.getCost());
                car.setConsumption(carDTO.getConsumption());
                car.setMaxSpeed(carDTO.getMaxSpeed());
                car.setFuelType(carDTO.getFuelType());
                car.setFuelConsumption(carDTO.getFuelConsumption());
                logger.debug("Returned gasoline car: " + car.toString());
                return car;
            }
        }
        logger.info("Returned null!");
        return null;
    }
}
