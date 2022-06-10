package com.sparta.ee.start;

import com.sparta.ee.exceptions.InvalidInputException;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.Scanner;

public class InputControllerTest {


    //Scanner input = new Scanner();
    NewSorterController controller = new NewSorterController();
    @Test
    @DisplayName("Check that the input is returned as an int")
    public void checkYouCanTypeAnInput() throws InvalidInputException {
        Assertions.assertEquals(2, InputController.chooseYourAlgorithm());
    }

}