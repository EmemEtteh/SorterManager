package com.sparta.ee.managers;

import com.sparta.ee.exceptions.InvalidInputException;
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

    private static Logger logger = Logger.getLogger("Algorithm Selection Logger");

    private static void createLog() {
        try {
            Handler fileHandler = new FileHandler(
                    "src/main/java/com/sparta/ee/loggers/selectionLog.log", true);

            logger.addHandler(fileHandler);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public int[] chooseTheAlgorithm(int choice, int[] array) throws InvalidInputException {

        switch (choice) {
            case 0:

                System.exit(0);



            case 1:
                // run algorithm1 bubble
                logger.log(Level.INFO, "checking the choice selected is 1", choice);
                return bubble.sortTheArray(array) ;

            case 2:
                // run algorithm2 insertion
                logger.log(Level.INFO, "checking the choice selected is 2", choice);
                return insertion.sortTheArray(array) ;

            case 3:
                // run algorithm3 binary tree
                break;


        }

        return null;
    }

}
