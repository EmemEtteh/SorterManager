package com.sparta.ee.sortalgorithms;

public class InsertionSort implements AlgorithmicFactory {

    @Override
    public int[] sortTheArray (int[] list) {

        for (int i = 1; i < list.length; i++) {
            int currentValue = list[i];
            int j = i-1;

            while (j >=0 && list[j] > currentValue) {
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = currentValue;
        }
        return list;
    }



//    public static void main( String[] args ) {
//
//        int[] list = {-2, -3, 5, 2,-1};
//        System.out.println(Arrays.toString(sortTheArray(list)));
//    }


}
