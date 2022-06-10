package com.sparta.ee.displays;

import com.sparta.ee.managers.SelectAlgorithm;
import com.sparta.ee.start.TakeInput;

import java.util.Arrays;

public class PrintToConsole {

    SelectAlgorithm getOutput = new SelectAlgorithm();

    int chosenAlgorithmNumber = 0;

    public static void printPreRunInfo() {


        System.out.println("Choose your algorithm.");
        System.out.println("Enter 1 for BubbleSort.");
        System.out.println("Enter 2 for InsertionSort.");
        System.out.println("Enter 3 for Binary Tree.");
        System.out.println("Anything else will produce an error!!");

    }

    public static void askForLength() {
        System.out.println("What length array would you like?");

    }

    public static void printFinalInfo(int[] array, int[] sortedArray, int choice, String algorithmChoice) {
        System.out.println("Unsorted array: " + Arrays.toString(array));
        System.out.println("Chosen algorithm and choice number: " + choice + ". " + algorithmChoice  );
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
        System.out.println("Time taken: ");
    }
}
