package com.epam.training.test;

import com.epam.training.cases.JsonFileHandlerCase;
import com.epam.training.dto.CarDTO;
import com.epam.training.util.JsonFileConstants;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class JsonFileHandlerTest extends BasicTest {

    @DataProvider
    public Object[][] dataConvertJsonObject() {
        return new Object[][]{{JsonFileConstants.CONVERT_TO_DTO, JsonFileHandlerCase.getDataConvertJsonObject()}};
    }

    @Test(dataProvider = "dataConvertJsonObject")
    public void testConvertJsonObject(String file, CarDTO expectedResult) {
        List<CarDTO> carDTOList;

        carDTOList = jsonFileHandler.convertJsonObject(jsonFileHandler.readJsonFile(file));

        Assert.assertEquals(carDTOList.get(0), expectedResult);
    }

    @DataProvider
    public Object[][] dataNullConvertJsonObject() {
        return new Object[][]{{JsonFileConstants.CONVERT_TO_DTO, JsonFileHandlerCase.getNullDataConvertJsonObject()}};
    }

    @Test(dataProvider = "dataNullConvertJsonObject")
    public void testNullConvertJsonObject(String file, CarDTO expectedResult) {
        List<CarDTO> carDTOList;

        carDTOList = jsonFileHandler.convertJsonObject(jsonFileHandler.readJsonFile(JsonFileConstants.CONVERT_TO_DTO_NULL));

        Assert.assertEquals(carDTOList.get(0), expectedResult);
    }
}
