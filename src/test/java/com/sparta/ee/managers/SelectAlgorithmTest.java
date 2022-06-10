package com.sparta.ee.managers;

import com.sparta.ee.exceptions.InvalidInputException;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class SelectAlgorithmTest extends TestCase {

    SelectAlgorithm select = new SelectAlgorithm();
    @Test
    @DisplayName("check that 1 runs bubblesort")
    public void checkThat1RunsBubbleSort() throws InvalidInputException {

        int[] array = {1,2,3,6,8,2,6};
        int[] sortedArray = {1,2,2,3,6,6,8};

        Assertions.assertEquals(sortedArray, select.chooseTheAlgorithm(1, array) );


    }

}