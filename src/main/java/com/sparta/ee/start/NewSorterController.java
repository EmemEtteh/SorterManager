package com.sparta.ee.start;

import com.sparta.ee.utils.RandomArrayGenerator;

import com.sparta.ee.displays.PrintToConsole;
import com.sparta.ee.managers.SelectAlgorithm;

public class NewSorterController {

    SelectAlgorithm controller = new SelectAlgorithm();
    private static int arrayLength;
    private static int choice;
    private static long duration;

    private static int[] array = new int[getArrayLength()];
    private static int[] sortedArray = new int[getArrayLength()];



    public void runStuff() {
        PrintToConsole.printPreRunInfo();
        choice = InputController.chooseYourAlgorithm();

        PrintToConsole.askForLength();

        arrayLength = InputController.chooseArrayLength();


        array = RandomArrayGenerator.createRandArray(getArrayLength()) ;
        PrintToConsole.printStartInfo(array);

        setChoice(choice);
        long startTime = System.nanoTime();
        sortedArray = controller.chooseTheAlgorithm(getChoice(), array);
        long endTime = System.nanoTime();

        long duration = (endTime-startTime);
        setDuration(duration);

        String algoChoice = "Not chosen";
        if(getChoice() == 1) {
            algoChoice = "BubbleSort";
        } else if (getChoice() == 2) {
            algoChoice = "InsertionSort";
        } else {
            algoChoice = "Not chosen";
        }

//        setGeneratedArray(array);
//        setSortedArray(sortedArray);



        PrintToConsole.printFinalInfo(sortedArray, getChoice(), algoChoice, getDuration());



        //SelectAlgorithm selectSorter = new SelectAlgorithm();

        //selectSorter.chooseTheAlgorithm(choice);

    }

    public static int getArrayLength() {
        return arrayLength;
    }

//    public static int[] getGeneratedArray() {
//        return array;
//    }
//
//    public void setGeneratedArray(int[] theGeneratedArray) {
//        array = theGeneratedArray;
//    }

//    public static int[] getSortedArray() {
//        return sortedArray;
//    }
//
//    public void setSortedArray(int[] theSortedArray) {
//        sortedArray = theSortedArray;
//    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int chosenChoice) {
        choice = chosenChoice;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long sortDuration) {
        duration = sortDuration;
    }



}
