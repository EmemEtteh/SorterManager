package com.sparta.ee;

import com.sparta.ee.start.TakeInput;

import java.util.Random;

public class RandomArrayGenerator {
//    TakeInput takeInput = new TakeInput();
//
//    int userLengthInput = takeInput.chooseArrayLength();

    public static int[] createRandArray(int length) {


        Random rd = new Random(); // creating Random object
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100); // storing random integers in an array

        }
        return array;
    }
}
