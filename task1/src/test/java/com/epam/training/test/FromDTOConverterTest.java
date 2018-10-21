package com.epam.training.test;

import com.epam.training.converter.FromDTOConverter;
import com.epam.training.dto.CarDTO;
import com.epam.training.util.JsonFileConstants;
import model.Car;
import model.ElectricCar;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FromDTOConverterTest extends BasicTest {

    @Test
    public void testConvertToCar() {
        List<CarDTO> carDTOList;
        FromDTOConverter fromDTOConverter = new FromDTOConverter();
        Car car;
        ElectricCar electricCar = new ElectricCar();
        electricCar.setBrand("Skoda");
        electricCar.setModel("Octavia");
        electricCar.setCost(9332);
        electricCar.setConsumption(10);
        electricCar.setMaxSpeed(190);
        electricCar.setBatteryType("lion");
        electricCar.setPowerConsumption(34);
        carDTOList = jsonFileHandler.convertJsonObject(jsonFileHandler.readJsonFile(JsonFileConstants.CONVERT_TO_DTO));

        car = fromDTOConverter.convertToCarFromDTO(carDTOList.get(0));

        Assert.assertEquals(car, electricCar);
    }

    @Test
    public void testNullConvertToCar() {
        List<CarDTO> carDTOList;
        FromDTOConverter fromDTOConverter = new FromDTOConverter();
        Car car;
        ElectricCar electricCar = new ElectricCar();
        electricCar.setBrand("Skoda");
        electricCar.setModel(null);
        electricCar.setCost(9332);
        electricCar.setConsumption(10);
        electricCar.setMaxSpeed(190);
        electricCar.setBatteryType("lion");
        electricCar.setPowerConsumption(34);
        carDTOList = jsonFileHandler.convertJsonObject(jsonFileHandler.readJsonFile(JsonFileConstants.DTO_CONVERTER_NULL));

        car = fromDTOConverter.convertToCarFromDTO(carDTOList.get(0));

        Assert.assertEquals(car, electricCar);
    }

    @Test
    public void testReturnNullConvertToCar() {
        List<CarDTO> carDTOList;
        FromDTOConverter fromDTOConverter = new FromDTOConverter();
        Car car;
        carDTOList = jsonFileHandler.convertJsonObject(jsonFileHandler.readJsonFile(JsonFileConstants.CONVERT_TO_DTO_NULL));

        car = fromDTOConverter.convertToCarFromDTO(carDTOList.get(0));

        Assert.assertNull(car);
    }
}
