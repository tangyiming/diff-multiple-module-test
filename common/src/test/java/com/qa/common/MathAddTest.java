package com.qa.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathAddTest {

    @Test
    void add() {
        MathAdd math = new MathAdd();
        assertEquals(2, math.add(1, 1));
    }
    @Test
    void add2() {
        MathAdd math = new MathAdd();
        assertEquals(3, math.add(1, 1, 1));
    }
}