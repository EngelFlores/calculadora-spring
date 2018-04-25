package com.aceleradora.calculadora.services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public int soma(int primeiroValor, int segundoValor) {
        return primeiroValor + segundoValor;
    }
}
