package org.example;

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



    /**
     * This function should take the two arrays and merge them into the inputArray.
     * The result should be in order from smallest to largest, with all the numbers from both arrays included.
     * @param inputArray - The original array that will come back changed.
     * @param array1 - A sorted list of numbers that is the size of half the length of the inputArray
     * @param array2 - A sorted list of numbers that is the size of half the length of the inputArray
     */
    public static void merge(int[] inputArray, int[] array1, int [] array2) {
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
            //if LH[i] <RH[j]: LH[i]= BB[k]
            if(array1[i]> array2[j]){
                inputArray[k]= array2[j];
                //RH++, BB++;
                j++;
                k++;
            }}
        //if LH is longer than RH: clean out LH until the last of BB
        while(array1.length>array2.length && k<inputArray.length){
            inputArray[k]= array1[i];
            i++;
            k++;
        }
        //if RH is longer than LH: clean out RH until the last of BB
        while(array2.length>array1.length && k<=inputArray.length){
            inputArray[k]= array2[j];
            j++;
            k++;
        }

    }
}
