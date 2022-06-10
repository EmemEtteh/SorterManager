package com.sparta.ee.start;

import com.sparta.ee.exceptions.InputIsTooLargeException;
import com.sparta.ee.exceptions.InvalidInputException;
import com.sparta.ee.exceptions.ZeroLengthInputException;

import java.util.Scanner;

public class InputController {

    private int arrayLength;

    public static int chooseYourAlgorithm() throws InvalidInputException {

        Scanner choiceInput = new Scanner(System.in);

        int choice = choiceInput.nextInt();
        return choice;

    }

    public static int chooseArrayLength() throws InputIsTooLargeException, ZeroLengthInputException {
        Scanner arrLengthInput = new Scanner(System.in);

        int lengthChoice = arrLengthInput.nextInt();


        return lengthChoice;




    }



}
