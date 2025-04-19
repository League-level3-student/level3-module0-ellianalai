package _00_Intro_To_Arrays;

import java.util.Arrays;
import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String string [] = new String[5];
        // 2. print the third element in the array
    	System.out.println(string[2]);
        // 3. set the third element to a different value
    	string[2] = "hi";
        // 4. print the third element again
    	System.out.println(string[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for(int i = 0; i<string.length; i++) {
    		string[i] = "wow";
    	}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for(int i = 0; i<string.length; i++) {
    		System.out.println(string[i]);
    	}
        // 7. make an array of 50 integers
    	int integer [] = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	Random rand = new Random();
    	for(int i = 0; i<integer.length; i++) {
    		integer[i] = rand.nextInt(1000);
    	}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	Arrays.sort(integer);
    	System.out.println(integer[0]);
        // 10 print the entire array to see if step 8 was correct
    	for(int i = 0; i<integer.length; i++) {
    		System.out.println(integer[i]);
    	}
        // 11. print the largest number in the array.
    	System.out.println(integer[49]);
        // 12. print only the last element in the array
    	System.out.println(integer[49]);

    }
}
