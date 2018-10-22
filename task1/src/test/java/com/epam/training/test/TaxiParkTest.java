package com.epam.training.test;

import com.epam.training.cases.TaxiParkCase;
import com.epam.training.util.JsonFileConstants;
import manager.TaxiPark;
import model.Car;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class TaxiParkTest extends BasicTest {


    @DataProvider
    public Object[][] dataCreateTaxiPark() {
        return new Object[][]{{JsonFileConstants.TAXI_PARK, 24999}};
    }

    @Test(dataProvider = "dataCreateTaxiPark")
    public void testCreateTaxiPark(String file, int expectedResult) {
        List<Car> carList = readValuesFromFile(file);

        TaxiPark taxiPark = new TaxiPark(carList);

        Assert.assertEquals(expectedResult, taxiPark.getSummaryCost());
    }

    @DataProvider
    public Object[][] dataAddCar() {
        return new Object[][]{{JsonFileConstants.TAXI_PARK, TaxiParkCase.getDataToAddSingleCar(), 29999}, {JsonFileConstants.TAXI_TEST1, TaxiParkCase.getDataToAddMultipleCar(), 28099}};
    }

    @Test(dataProvider = "dataAddCar")
    public void testAddCar(String file, List<Car> addCarList, int expectedResult) {
        List<Car> carList = readValuesFromFile(file);
        TaxiPark taxiPark = new TaxiPark(carList);
        TaxiParkCase taxiParkCase = new TaxiParkCase();

        taxiParkCase.addCar(taxiPark, addCarList);

        Assert.assertEquals(expectedResult, taxiPark.getSummaryCost());
    }

    @DataProvider
    public Object[][] dataDeleteCar() {
        return new Object[][]{{JsonFileConstants.TAXI_TEST1, TaxiParkCase.getDataToDeleteSingleCar(), 9332}, {JsonFileConstants.TAXI_PARK, TaxiParkCase.getDataToDeleteMultipleCar(), 9332}};
    }

    @Test(dataProvider = "dataDeleteCar")
    public void testDeleteCar(String file, List<Integer> indexList, int expectedResult) {
        List<Car> carList = readValuesFromFile(file);
        TaxiPark taxiPark = new TaxiPark(carList);
        TaxiParkCase taxiParkCase = new TaxiParkCase();

        taxiParkCase.deleteCar(taxiPark, indexList);

        Assert.assertEquals(expectedResult, taxiPark.getSummaryCost());
    }

    @DataProvider
    public Object[][] dataSetCarList() {
        return new Object[][]{{JsonFileConstants.TAXI_PARK, 24999}};
    }

    @Test(dataProvider = "dataSetCarList")
    public void testSetCarList(String file, int expectedResult) {
        List<Car> carList = readValuesFromFile(file);
        TaxiPark taxiPark = new TaxiPark();

        taxiPark.setTaxiParkList(carList);

        Assert.assertEquals(expectedResult, taxiPark.getSummaryCost());
    }


}
