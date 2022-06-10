package com.sparta.ee.start;

import java.util.Scanner;

public class InputController {

    private int arrayLength;

    public static int chooseYourAlgorithm() {

        Scanner choiceInput = new Scanner(System.in);

        int choice = choiceInput.nextInt();
        return choice;

    }

    public static int chooseArrayLength() {
        Scanner arrLengthInput = new Scanner(System.in);


        int lengthChoice = arrLengthInput.nextInt();

        return lengthChoice;
    }



}
