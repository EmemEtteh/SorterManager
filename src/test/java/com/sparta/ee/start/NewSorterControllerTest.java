package com.sparta.ee.start;

import com.sparta.ee.displays.PrintToConsole;
import com.sparta.ee.managers.SelectAlgorithm;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class NewSorterControllerTest {

    SelectAlgorithm sortSelect = new SelectAlgorithm();
    PrintToConsole print = new PrintToConsole();
    NewSorterController controller = new NewSorterController();
    InputController input = new InputController();
    static int[] array = {1,3,5};

    @Test
    @DisplayName("check that when insertion sort runs properly")
    public void checkInsertionSortRunsProperly() {
        Assertions.assertEquals(controller.getChoice(), sortSelect.chooseTheAlgorithm(2, array));
    }

    @Test
    public void testGetArrayLength() {
    }

    @Test
    public void testGetGeneratedArray() {
    }

    @Test
    public void testSetGeneratedArray() {
    }

    @Test
    public void testGetSortedArray() {
    }

    @Test
    public void testSetSortedArray() {
    }

    @Test
    public void testGetChoice() {
    }

    @Test
    public void testSetChoice() {
    }
}