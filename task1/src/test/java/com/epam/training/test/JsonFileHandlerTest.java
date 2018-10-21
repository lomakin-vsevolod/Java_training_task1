package com.epam.training.test;

import com.epam.training.dto.CarDTO;
import com.epam.training.util.JsonFileConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class JsonFileHandlerTest extends BasicTest {

    @Test
    public void testConvertJsonObject(){
        List<CarDTO> carDTOList;
        carDTOList = jsonFileHandler.convertJsonObject(jsonFileHandler.readJsonFile(JsonFileConstants.CONVERT_TO_DTO));
        CarDTO expectedResult = new CarDTO();
        expectedResult.setCarType("electric");
        expectedResult.setBrand("Skoda");
        expectedResult.setModel("Octavia");
        expectedResult.setCost(9332);
        expectedResult.setConsumption(10);
        expectedResult.setMaxSpeed(190);
        expectedResult.setBatteryType("lion");
        expectedResult.setPowerConsumption(34);

        Assert.assertEquals(carDTOList.get(0),expectedResult);
    }

    @Test
    public void testNullConvertJsonObject(){
        List<CarDTO> carDTOList;
        carDTOList = jsonFileHandler.convertJsonObject(jsonFileHandler.readJsonFile(JsonFileConstants.CONVERT_TO_DTO_NULL));
        CarDTO expectedResult = new CarDTO();
        expectedResult.setCarType(null);
        expectedResult.setBrand("Skoda");
        expectedResult.setModel(null);
        expectedResult.setCost(9332);
        expectedResult.setConsumption(10);
        expectedResult.setMaxSpeed(190);
        expectedResult.setBatteryType(null);
        expectedResult.setPowerConsumption(0);

        Assert.assertEquals(carDTOList.get(0),expectedResult);
    }
}
