package com.qa.web;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathSquareTest {

    @Test
    void square() {
        MathSquare math = new MathSquare();
        assertEquals(4, math.square(2));
    }

    @Test
    void squareRoot() {
        MathSquare math = new MathSquare();
        assertEquals(2, math.squareRoot(4));
    }
}