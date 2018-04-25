package com.aceleradora.calculadora.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int sum(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }
}
