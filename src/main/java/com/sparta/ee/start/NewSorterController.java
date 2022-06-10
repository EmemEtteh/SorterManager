package com.sparta.ee.start;

import com.sparta.ee.RandomArrayGenerator;

import com.sparta.ee.displays.PrintToConsole;
import com.sparta.ee.managers.SelectAlgorithm;


import java.util.Arrays;

public class NewSorterController {

    SelectAlgorithm controller = new SelectAlgorithm();
    private static int arrayLength;
    private static int choice;

    private static int[] array = new int[getArrayLength()];
    private static int[] sortedArray = new int[getArrayLength()];



    public void runStuff() {
        PrintToConsole.printPreRunInfo();
        choice = TakeInput.chooseYourAlgorithm();

        PrintToConsole.askForLength();

        arrayLength = TakeInput.chooseArrayLength();

        RandomArrayGenerator.createRandArray(getArrayLength()) ;

        setChoice(choice);
        controller.chooseTheAlgorithm(getChoice(), getGeneratedArray());

        String algoChoice = "Not chosen";
        if(getChoice() == 1) {
            algoChoice = "BubbleSort";
        } else if (getChoice() == 2) {
            algoChoice = "InsertionSort";
        } else {
            algoChoice = "Not chosen";
        }

        setGeneratedArray(array);
        setSortedArray(sortedArray);



        //PrintToConsole.printFinalInfo(getGeneratedArray(), getSortedArray(), getChoice(), algoChoice);



        //SelectAlgorithm selectSorter = new SelectAlgorithm();

        //selectSorter.chooseTheAlgorithm(choice);

    }

    public static int getArrayLength() {
        return arrayLength;
    }

    public static int[] getGeneratedArray() {
        return array;
    }

    public void setGeneratedArray(int[] theGeneratedArray) {
        array = theGeneratedArray;
    }

    public static int[] getSortedArray() {
        return sortedArray;
    }

    public void setSortedArray(int[] theSortedArray) {
        sortedArray = theSortedArray;
    }

    public static int getChoice() {
        return choice;
    }

    public void setChoice(int chosenChoice) {
        choice = chosenChoice;
    }


}
