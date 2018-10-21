package com.epam.training.converter;

import com.epam.training.dto.CarDTO;
import model.Car;

public interface IFromDTOConverter {

    Car convertToCarFromDTO(CarDTO carDTO);

}
