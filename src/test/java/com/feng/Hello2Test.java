package com.feng;

import org.junit.Test;

import static org.junit.Assert.*;

public class Hello2Test {

    @Test
    public void sayPapa() {

        Hello2 hello2 = new Hello2();

        assertEquals(hello2.sayPapa("feng"), "feng");
    }

    @Test
    public void sayPapa_failed() {

        Hello2 hello2 = new Hello2();

        assertEquals(hello2.sayPapa(null), "mama");
    }
}