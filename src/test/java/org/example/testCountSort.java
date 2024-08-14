package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class testCountSort {

    @Test
    public void testCountSort() {
        String sorted = "geeksforgeeks";
        assertEquals("eeeefggkkorss",Main.countSort(sorted));
    }
}
