package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testHiFriend {


    @Test
    void testHiFriend() {
        assertEquals("Hi Larry Sprinkle", HiFriend.hiFriend("Larry Sprinkle"));
    }
}
