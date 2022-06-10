package com.sparta.ee.sortalgorithms;

import com.sparta.ee.loggers.LogsConfig;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BubbleSort implements AlgorithmicFactory {

    LogsConfig logger = new LogsConfig();


    @Override
    public int[] sortTheArray(int[] list) {
        //int[] list = {12, 1, 342, 8, 28, 1, 79};

        for (int i = 0; i < list.length-1; i++) {
            for (int j = 0; j < list.length-1; j++) {
                if (list[j] > list[j+1]) {
                    int temp;
                    temp = list[j];

                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        return list;
    }


//    public static void main( String[] args ) {
//
//        int[] list = {12, 1, 342, 8, 28, 1, 79};
//        System.out.println(Arrays.toString(sortThisArray(list)));
//    }


}
