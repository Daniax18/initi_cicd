package com.example.hellofx2.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculTest {

    @Test
    void calculate() throws Exception{
        MyCalcul calcul = new MyCalcul("5", "4");
        assertEquals(9, calcul.calculate("+"));
        assertEquals(1, calcul.calculate("1"));
    }
}