package com.sparta.ee.managers;

import com.sparta.ee.SorterController;
import com.sparta.ee.sortalgorithms.BubbleSort;
import com.sparta.ee.sortalgorithms.InsertionSort;

public class SelectAlgorithm {

    //TakeInput takeInput = new TakeInput();
    BubbleSort bubble = new BubbleSort();
    InsertionSort insertion = new InsertionSort();
    //RandomArrayGenerator generateArray = new RandomArrayGenerator();

    SorterController controller = new SorterController();

    //PrintToConsole displayResults = new PrintToConsole();

    //int userInput = takeInput.chooseYourAlgorithm();


    //private int sortChoice;

    public int[] chooseTheAlgorithm(int choice, int[] array) {

        switch (choice) {
            case 1:
                // run algorithm1 bubble

                return bubble.sortTheArray(array) ;

            case 2:
                // run algorithm2 insertion

                return insertion.sortTheArray(array) ;

            case 3:
                // run algorithm3 binary tree
                break;

        }

        return null;
    }

}
