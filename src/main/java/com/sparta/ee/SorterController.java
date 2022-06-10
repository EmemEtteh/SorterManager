package com.sparta.ee;

import com.sparta.ee.displays.PrintToConsole;
import com.sparta.ee.managers.SelectAlgorithm;
import com.sparta.ee.start.TakeInput;

public class SorterController {

    private PrintToConsole view;
    private SelectAlgorithm model;
    private static TakeInput takeInput;
    private RandomArrayGenerator randomGenerator;

    private int length;
    private int choice;

    private static int[] array;
    private static int[] sortedArray;


//    public SorterController(PrintToConsole view, SelectAlgorithm model, TakeInput takeInput) {
//        this.view = view;
//        this.model = model;
//        this.takeInput = takeInput;
//    }

    public void sortTypeInput() {
        view.printPreRunInfo();
    }

    public void arrayLengthInput() {
        view.askForLength();
    }
//
//    public void outPut() {
//        view.printFinalInfo();
//    }


    public void setModel(SelectAlgorithm model) {
        this.model = model;

    }

//    public int getChoice() {
//        return takeInput.chooseYourAlgorithm();
//    }

    public int collectChoice() {
        this.choice = takeInput.chooseYourAlgorithm();
        return choice;
    }

    public int getLength() {
        this.length = takeInput.chooseArrayLength();

        return length;
    }

    //takes length from user input
//    public void setLength(int choice) {
//
//        this.length = choice;
//        takeInput.chooseArrayLength();
//    }


    public int[] generateUnsortedArray(int length) {
        length = this.length;
        return randomGenerator.createRandArray(length);
    }

//    public int getUnsortedArray() {
//
//        return randomGenerator.createRandArray();
//    }

    public void runMethods() {
        sortTypeInput();
        collectChoice();
        if (collectChoice() == 1) {
            arrayLengthInput();
            model.chooseTheAlgorithm(1, generateUnsortedArray(length));

        } else if (collectChoice() == 2) {
            arrayLengthInput();
            model.chooseTheAlgorithm(2, generateUnsortedArray(length));

        } else {
            System.out.println("In correct option");
        }



    }

//    public void passAndRunSort() {
//        model.chooseTheAlgorithm();
//    }

}
