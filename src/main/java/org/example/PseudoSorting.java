package org.example;

import java.util.Random;

public class PseudoSorting {

    private static PseudoSorting INSTANCE;
    private PseudoSorting(){ }

    public static PseudoSorting getInstance(){
        if (INSTANCE == null){
            INSTANCE = new PseudoSorting();
        }
        return INSTANCE;
    }

    public void runTheSort(){
        int[] sourceArr = getSourceArr();
        printTheSortedArr(sourceArr);
        System.out.println("**** **** **** **** ****");
        int[] sortedArr = sortTheArr(sourceArr);
        printTheSortedArr(sortedArr);
    }


    private int[] getSourceArr() {
        int arrayDimension = 10;
        int[] inputContext = new int[arrayDimension];
        Random random = new Random();
        for (int i = 0; i < inputContext.length; i++) {
            inputContext[i] = random.nextInt((int)Byte.MAX_VALUE);
        }
        return inputContext;
    }

    private int[] sortTheArr(int[] unsortedArr){
        for (int i = 0; i<unsortedArr.length - 1; i++) {
            for (int j=0; j<unsortedArr.length -1; j++){
                if (i == j) { continue; }
                if (unsortedArr[j] > unsortedArr[i]){
                    int temp = unsortedArr[i];
                    unsortedArr[i] = unsortedArr[j];
                    unsortedArr[j] = temp;
                }
            }
        }

        return unsortedArr;
    }

    private void printTheSortedArr(int[] sortedArr){
        System.out.println("toString() " + sortedArr.toString());
        for (int i= 0; i<sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}
