package com.aceleradora.calculadora.services;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorServiceTest {

    private CalculatorService service;

    @Before
    public void setUp() {
        service = new CalculatorService();
    }

    @Test
    public void sums_two_numbers_correctly() {
        assertThat(service.sum(1, 1), is(2));
    }
}