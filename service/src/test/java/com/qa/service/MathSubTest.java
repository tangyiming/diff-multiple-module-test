package com.qa.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathSubTest {

    @Test
    void sub() {
        MathSub math = new MathSub();
        assertEquals(0, math.sub(1, 1));
    }
}