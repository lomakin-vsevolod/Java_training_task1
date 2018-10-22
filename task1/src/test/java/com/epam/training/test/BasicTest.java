package com.epam.training.test;

import com.epam.training.converter.FromDTOConverter;
import com.epam.training.dto.CarDTO;
import com.epam.training.util.JsonFileHandler;
import model.Car;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class BasicTest {

    protected JsonFileHandler jsonFileHandler;
    private FromDTOConverter fromDTOConverter;

    @BeforeMethod
    protected void getFileReader(){
        jsonFileHandler= new JsonFileHandler();
        fromDTOConverter= new FromDTOConverter();
    }

    protected List<Car> readValuesFromFile(String fileName){
        List<CarDTO> carDTOList;
        List<Car> carList = new ArrayList<Car>();
        carDTOList = jsonFileHandler.convertJsonObject(jsonFileHandler.readJsonFile(fileName));

        for (CarDTO carDTO:carDTOList){
            carList.add(fromDTOConverter.convertToCarFromDTO(carDTO));
        }
        return carList;
    }

}
