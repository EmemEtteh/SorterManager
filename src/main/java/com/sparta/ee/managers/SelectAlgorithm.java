package com.sparta.ee.managers;

import com.sparta.ee.exceptions.InvalidInputException;
import com.sparta.ee.sortalgorithms.BinaryTree;
import com.sparta.ee.sortalgorithms.BubbleSort;
import com.sparta.ee.sortalgorithms.InsertionSort;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SelectAlgorithm {

    BubbleSort bubble = new BubbleSort();
    InsertionSort insertion = new InsertionSort();

    BinaryTree tree = new BinaryTree(5);


    public int[] chooseTheAlgorithm(int choice, int[] array) throws InvalidInputException {

        switch (choice) {
            case 0:

                System.exit(0);



            case 1:
                // run algorithm1 bubble

                return bubble.sortTheArray(array) ;

            case 2:
                // run algorithm2 insertion

                return insertion.sortTheArray(array) ;

            case 3:
                // run algorithm3 binary tree

                return tree.getSortedTreeAsc();


        }

        return null;
    }

}
