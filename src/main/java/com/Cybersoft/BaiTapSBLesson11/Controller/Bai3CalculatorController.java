package com.Cybersoft.BaiTapSBLesson11.Controller;

import com.Cybersoft.BaiTapSBLesson11.Service.Bai3CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cacl")
public class Bai3CalculatorController {
    private final Bai3CalculatorService calculatorService;

    public Bai3CalculatorController(Bai3CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public double add(
            @RequestParam double x,
            @RequestParam double y) {
        return calculatorService.add(x, y);
    }

    @GetMapping("/subtract")
    public double subtract(
            @RequestParam double x,
            @RequestParam double y) {
        return calculatorService.subtract(x, y);
    }

    @GetMapping("/multiply")
    public double multiply(
            @RequestParam double x,
            @RequestParam double y) {
        return calculatorService.multiply(x, y);
    }

    @GetMapping("/divide")
    public double divide(
            @RequestParam double x,
            @RequestParam double y) {
        return calculatorService.divide(x, y);
    }
}
