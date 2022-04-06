package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        int[] cat= new int[] {2, 7, 4, 5, 9, 2 ,1 , 4, 7};
        Sort.mergeSort(cat);

    }
}
