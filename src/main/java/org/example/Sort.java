package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Sort {



    /**
     * Should take in an array of two ints and changes it
     * to arrray with the numbers from smallest to largest.
     * @param nums
     */
    public static void sortTwo(int[] nums) {

            if(nums[0]> nums[1]){
                int hold= nums[0];
                nums[0]= nums[1];
                nums[1]= hold;
            }
        }

    public static void mergeSort(int[] inputArray){
        System.out.println(Arrays.toString(inputArray) + " starting mergeSort");
        int inputLength= inputArray.length;
        int midpoint= inputLength/2;
        int[] leftHalf= new int[midpoint];
        int[] rightHalf= new int[inputLength-midpoint];

        if(inputLength<2){
            System.out.println("We have hit the bottom of recursion within mergeSort.");
            return;
        }

        for(int p=0; p<midpoint; p++){

            leftHalf[p]= inputArray[p];
        }

        for(int x=midpoint; x<inputLength; x++){
            rightHalf[x-midpoint]= inputArray[x];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        System.out.println(Arrays.toString(leftHalf) + "left half" + Arrays.toString(rightHalf) + "right half");

        merge(inputArray, leftHalf, rightHalf);

        System.out.println(Arrays.toString(inputArray) + "post merge");



    }





    /**
     * This function should take the two arrays and merge them into the inputArray.
     * The result should be in order from smallest to largest, with all the numbers from both arrays included.
     * @param inputArray - The original array that will come back changed.
     * @param array1 - A sorted list of numbers that is the size of half the length of the inputArray
     * @param array2 - A sorted list of numbers that is the size of half the length of the inputArray
     */
    public static void merge(int[] inputArray, int[] array1, int [] array2) {
        System.out.println(Arrays.toString(inputArray));
        //int i, j, k =0;
        //LH= left hand
        //RH= right hand
        //BB= big boy list
        int i=0;
        int j=0;
        int k=0;
        //while there is still room in the LH and RH list
        while(i<array1.length && j<array2.length){
            //if LH[i] >RH[j]: LH[i]= BB[k]
            if(array1[i]< array2[j]){
                inputArray[k]= array1[i];
                //LH++, BB++;
                i++;
                k++;
            }
            //if LH[i] <RH[j]: RH[j]= BB[k]
            else if(array1[i]> array2[j]){
                inputArray[k]= array2[j];
                //RH++, BB++;
                j++;
                k++;
            }}
        //if LH is longer than RH: clean out LH until the last of BB
        while(i<array1.length){
            inputArray[k]= array1[i];
            i++;
            k++;
        }
        //if RH is longer than LH: clean out RH until the last of BB
        while(j<array2.length){
            inputArray[k]= array2[j];
            j++;
            k++;
        }
        //System.out.println(Arrays.toString(inputArray)+ "oo");

    }
}
