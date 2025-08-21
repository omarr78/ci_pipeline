package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void greet_returnsHelloName(){
        Assertions.assertEquals("Hello, omar",Main.greeting("omar"));
    }
}
