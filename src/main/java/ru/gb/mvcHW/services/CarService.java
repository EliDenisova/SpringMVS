package ru.gb.mvcHW.services;

import org.springframework.stereotype.Service;
import ru.gb.mvcHW.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getAllCars() {
        return cars;
    }
}
