package com.epam.training.test;

import com.epam.training.cases.FromDTOConverterCase;
import com.epam.training.converter.FromDTOConverter;
import com.epam.training.dto.CarDTO;
import com.epam.training.util.JsonFileConstants;
import model.Car;
import model.ElectricCar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class FromDTOConverterTest extends BasicTest {

    @DataProvider
    public Object[][] dataConvertToCar() {
        return new Object[][]{{JsonFileConstants.CONVERT_TO_DTO, FromDTOConverterCase.getDataConvertToCar()}};
    }

    @Test(dataProvider = "dataConvertToCar")
    public void testConvertToCar(String file, ElectricCar expectedResult) {
        List<CarDTO> carDTOList;
        FromDTOConverter fromDTOConverter = new FromDTOConverter();
        Car car;

        carDTOList = jsonFileHandler.convertJsonObject(jsonFileHandler.readJsonFile(file));

        car = fromDTOConverter.convertToCarFromDTO(carDTOList.get(0));

        Assert.assertEquals(car, expectedResult);
    }

    @DataProvider
    public Object[][] dataNullConvertToCar() {
        return new Object[][]{{JsonFileConstants.DTO_CONVERTER_NULL, FromDTOConverterCase.getDataNullConvertToCar()}};
    }

    @Test(dataProvider = "dataNullConvertToCar")
    public void testNullConvertToCar(String file, ElectricCar expectedResult) {
        List<CarDTO> carDTOList;
        FromDTOConverter fromDTOConverter = new FromDTOConverter();
        Car car;
        carDTOList = jsonFileHandler.convertJsonObject(jsonFileHandler.readJsonFile(file));

        car = fromDTOConverter.convertToCarFromDTO(carDTOList.get(0));

        Assert.assertEquals(car, expectedResult);
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
