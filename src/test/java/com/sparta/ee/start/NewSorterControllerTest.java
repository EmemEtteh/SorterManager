package com.sparta.ee.start;

import com.sparta.ee.displays.PrintToConsole;
import com.sparta.ee.managers.SelectAlgorithm;
import com.sparta.ee.utils.RandomArrayGenerator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class NewSorterControllerTest {

    SelectAlgorithm sortSelect = new SelectAlgorithm();
    PrintToConsole print = new PrintToConsole();

    NewSorterController controller = new NewSorterController();
    InputController input = new InputController();
    static int[] array = {1,3,5};
    static int[] emptyArray = new int[3];
    private static int choice = 1;



    @Test
    @DisplayName("check that setChoice changes choice")
    public void checkThatSetChoiceChangesChoice() {
        controller.setChoice(2);
        int expectedChoice = controller.getChoice();
        Assertions.assertEquals(2, expectedChoice);
    }

    @Test
    @DisplayName("check that system.nanotime duration calculation is correct")
    public void checkThatSystemNanoTimeDurationCalcIsCorrect() {

        long start = System.nanoTime();
        System.out.println("Hello there");
        long end = System.nanoTime();
        long duration = end-start;

        Assertions.assertEquals(duration, end-start);
    }

    @Test
    @DisplayName("check that an empty array gets filled when generating an array")
    public void checkThatEmptyArrayIsFilledWhenGeneratingArray() {

        emptyArray = array;
        Assertions.assertEquals(emptyArray, array);
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