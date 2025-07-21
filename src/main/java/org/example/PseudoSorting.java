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
        int[] sortedArr = sortTheArr(sourceArr);
        printTheSortedArr(sortedArr);
    }


    private int[] getSourceArr() {
        int[] inputContext = new int[10000];
        Random random = new Random();
        for (int i = 0; i < inputContext.length; i++) {
            inputContext[i] = random.nextInt((int)Byte.MAX_VALUE);
        }
        return inputContext;
    }

    private int[] sortTheArr(int[] unsortedArr){
        int[] sortedArr = new int[unsortedArr.length];
        int sortArrLastIndex = 0;

        int smallestValueOfSortedArr;
        for (int i = 0; i<unsortedArr.length - 1; i++) {
            smallestValueOfSortedArr = sortedArr[sortArrLastIndex];
            // sorted son eleman,
            // sorted dizideki en küçük elemanın değeri
            // unsorted iteration'daki eleman

            // sorted dizideki en küçük elemanla VS. unsorted listedeki iteration
            // eğer unsorted küçükse

            if (unsortedArr[i] <= smallestValueOfSortedArr){
                continue;
            }
            else if (unsortedArr[i] > unsortedArr[i+1])
        }

        return sortedArr;
    }

    private void printTheSortedArr(int[] sortedArr){
        System.out.println("toString() " + sortedArr.toString());
        for (int i= 0; i<sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}
