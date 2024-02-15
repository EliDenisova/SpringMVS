package ru.gb.mvcHW.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gb.mvcHW.models.Car;
import ru.gb.mvcHW.services.CarService;

@Controller
@AllArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping("/cars")
    public String getCars(Model model){
        model.addAttribute("cars", carService.getAllCars());
        return "cars";
    }

    @PostMapping("/cars")
    public String addCar(Car c, Model model) {
        carService.addCar(c);
        model.addAttribute("cars", carService.getAllCars());
        return "cars";
    }

}
