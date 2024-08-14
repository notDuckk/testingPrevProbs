package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testQuickSort {

    @Test
    public void testQuickSort() {

        int[] arr1 = {4,5,6,1,7};
        int[] arr =  {1,4,5,6,7};

        assertArrayEquals(Main.quickSort(arr1,0,arr1.length-1),arr);
    }
}
