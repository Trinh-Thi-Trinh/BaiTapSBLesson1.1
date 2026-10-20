package com.Cybersoft.BaiTapSBLesson11.Service;

import org.springframework.stereotype.Service;

@Service
public class Bai3CalculatorService {
    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        return x / y;
    }
}
