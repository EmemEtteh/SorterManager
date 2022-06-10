package com.sparta.ee.sortalgorithms;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;



public class BubbleSortTest {

    BubbleSort bubble = new BubbleSort();

    @Test
    @DisplayName("check that negative values still sort")
    public void checkNegativeValuesSort() {
        int[] expectedArray = new int[] {-3, -2, -1, 2, 5};
        int[] testArray = new int[] {-2, -3, 5, 2,-1};

        Assertions.assertArrayEquals(expectedArray, bubble.sortTheArray(testArray));
    }


    @Test
    @DisplayName("check that a sorted array is still sorted")
    public void checkSortedArrayStaysSorted() {
        int[] expectedArray = new int[] {1, 2, 3, 4, 5};
        int[] testArray = new int[] {1, 2, 3, 4, 5};

        Assertions.assertArrayEquals(expectedArray, bubble.sortTheArray(testArray));
    }

    @Test
    @DisplayName("check that an array with one character still displays that character")
    public void checkArrayLengthOneSorts() {
        int[] expectedArray = new int[] {1};
        int[] testArray = new int[] {1};

        Assertions.assertArrayEquals(expectedArray, bubble.sortTheArray(testArray));
    }


    @Test
    @DisplayName("check that empty arrays return blank array")
    public void checkEmptyArrayReturnsBlankArray() {
        int[] expectedArray = new int[] {};
        int[] testArray = new int[] {};

        Assertions.assertArrayEquals(expectedArray, bubble.sortTheArray(testArray));
    }

}