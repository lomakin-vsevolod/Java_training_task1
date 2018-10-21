package com.epam.training.test;

import com.epam.training.cases.TaxiParkHelperCase;
import com.epam.training.util.JsonFileConstants;
import helper.TaxiParkListHelper;
import model.Car;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.security.InvalidParameterException;
import java.util.List;

public class TaxiParkListHelperTest extends BasicTest {


    @DataProvider
    public Object[][] dataFindBySpeed() {
        return new Object[][]{{JsonFileConstants.TAXI_PARK, TaxiParkHelperCase.getExpectedFindBySpeed()}};
    }

    @Test(dataProvider = "dataFindBySpeed")
    public void testFindBySpeed(String file,List<Car> expectedResult){
        List<Car> carList = readValuesFromFile(file);

        List<Car> searchResult = TaxiParkListHelper.searchCarBySpeed(carList,140,190);

        Assert.assertEquals(expectedResult,searchResult);
    }


    @Test(expectedExceptions = InvalidParameterException.class)
    public void testFindBySpeedException(){
        List<Car> carList = readValuesFromFile(JsonFileConstants.TAXI_PARK);

        TaxiParkListHelper.searchCarBySpeed(carList,190,140);
    }

    @DataProvider
    public Object[][] dataSortByConsumption() {
        return new Object[][]{{JsonFileConstants.TAXI_PARK, TaxiParkHelperCase.getExpectedSortByConsumption()}};
    }


    @Test(dataProvider = "dataSortByConsumption")
    public void testSortByConsumption(String file,List<Car> expectedResult){
        List<Car> carList = readValuesFromFile(file);

        List<Car> sortResult=TaxiParkListHelper.sortCarByConsumption(carList);

        Assert.assertEquals(expectedResult,sortResult);
    }
}
