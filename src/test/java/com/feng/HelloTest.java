package com.feng;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void sayHi() {
        Hello hello = new Hello();

        assertEquals(hello.sayHi("feng"), "hello feng");
        assertEquals(hello.sayHi(null), "hello world");

    }
}