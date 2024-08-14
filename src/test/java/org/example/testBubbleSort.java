package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class testBubbleSort {

    @Test
    public void testBubbleSort() {
        int[] arr = { 5, 4, 3, 2, 1 };
        int[] arr2 = { 1, 2, 3, 4, 5 };

        assertArrayEquals(Main.bubblesort(arr), arr2);


    }
}
