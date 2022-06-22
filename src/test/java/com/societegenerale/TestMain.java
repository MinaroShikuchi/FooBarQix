package com.societegenerale;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMain {
    @Test
    void computeStep1() {
        assertEquals("1", Main.compute("1"));
        assertEquals("1", Main.compute("1"));
        assertEquals("2", Main.compute("2"));
        assertEquals("FooFoo", Main.compute("3"));
        assertEquals("4", Main.compute("4"));
        assertEquals("BarBar", Main.compute("5"));
        assertEquals("Foo", Main.compute("6"));
        assertEquals("QixQix", Main.compute("7"));
        assertEquals("8", Main.compute("8"));
        assertEquals("Foo", Main.compute("9"));
        assertEquals("Bar*", Main.compute("10"));
        assertEquals("Foo", Main.compute("13"));
        assertEquals("FooBarBar", Main.compute("15"));
        assertEquals("FooQix", Main.compute("21"));
        assertEquals("FooFooFoo", Main.compute("33"));
        assertEquals("FooBar", Main.compute("51"));
        assertEquals("BarFoo", Main.compute("53"));
    }

    @Test
    void computeStep2() {
        assertEquals("1*1", Main.compute("101"));
        assertEquals("FooFoo*Foo", Main.compute("303"));
        assertEquals("FooBarQix*Bar", Main.compute("105"));
        assertEquals("FooQix**", Main.compute("10101"));

    }
}