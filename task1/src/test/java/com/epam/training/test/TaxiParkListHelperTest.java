package com.epam.training.test;

import com.epam.training.cases.TaxiParkHelperCase;
import com.epam.training.util.JsonFileConstants;
import helper.TaxiParkListHelper;
import model.Car;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class TaxiParkListHelperTest extends BasicTest {


    @DataProvider
    public Object[][] dataFindBySpeed() {
        return new Object[][]{{JsonFileConstants.TAXI_PARK,140,190, TaxiParkHelperCase.getExpectedFindBySpeed()}};
    }

    @Test(dataProvider = "dataFindBySpeed")
    public void testFindBySpeed(String file,int speedMin,int speedMax,List<Car> expectedResult){
        List<Car> carList = readValuesFromFile(file);

        List<Car> searchResult = TaxiParkListHelper.searchCarBySpeed(carList,speedMin,speedMax);

        Assert.assertEquals(expectedResult,searchResult);
    }

    @DataProvider
    public Object[][] dataFindBySpeedNotFound() {
        return new Object[][]{{JsonFileConstants.TAXI_PARK,250,300,0}};
    }

    @Test(dataProvider = "dataFindBySpeedNotFound")
    public void testFindBySpeedNotFound(String file,int speedMin,int speedMax,int expectedResult){
        List<Car> carList = readValuesFromFile(file);

        List<Car> searchResult = TaxiParkListHelper.searchCarBySpeed(carList,speedMin,speedMax);

        Assert.assertEquals(expectedResult,searchResult.size());
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

    @DataProvider
    public Object[][] dataSortByConsumptionEmpty() {
        return new Object[][]{{0}};
    }


    @Test(dataProvider = "dataSortByConsumptionEmpty")
    public void testSortByConsumptionEmpty(int expectedResult){
        List<Car> carList = new ArrayList<Car>();

        List<Car> sortResult=TaxiParkListHelper.sortCarByConsumption(carList);

        Assert.assertEquals(expectedResult,sortResult.size());
    }

    @DataProvider
    public Object[][] dataSortReverseByConsumption() {
        return new Object[][]{{JsonFileConstants.TAXI_PARK, TaxiParkHelperCase.getExpectedSortReverseByConsumption()}};
    }


    @Test(dataProvider = "dataSortReverseByConsumption")
    public void testSortReverseByConsumption(String file,List<Car> expectedResult){
        List<Car> carList = readValuesFromFile(file);

        List<Car> sortResult=TaxiParkListHelper.sortReverseCarByConsumption(carList);

        Assert.assertEquals(expectedResult,sortResult);
    }
}
