package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		
		String[] fiveStrings = new String[5];
		
		//2. print the third element in the array
		
		System.out.println(fiveStrings[2]);
		//3. set the third element to a dif
		ferent value
		
		fiveStrings[2] = " 3rd string";
		
		//4. print the third element again
		
		System.out.println(fiveStrings[2]);
		
		//5. use a for loop to set all the elements in the array to a string of your choice
		
		for( int i=0; i< fiveStrings.length; i++){
			fiveStrings[i] = "the same thing";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		for(int i=0; i < fiveStrings.length;i++){
			System.out.println(fiveStrings[i]);
		}
		//7. make an array of 50 integers
		
		int[] numbers = new int[50];
		
		//8. use a for loop to make every value of the integer array a random number
		
		Random numGen = new Random();
		for(int i=0; i< numbers.length; i++){
			numbers[i] = numGen.nextInt(201);
		}
		//9. without printing the entire array, print only the smallest number on the array
		
		int smallestInt = Integer.MAX_VALUE;
		for(int i=0; i< numbers.length; i++){
			if(numbers[i] < smallestInt){
				smallestInt = numbers[i];
			}
		}
		System.out.println(smallestInt);
		
		//10 print the entire array to see if step 8 was correct
		
		for(int i=0; i < numbers.length;i++){
			System.out.println(numbers[i]);
		}
		//11. print the largest number in the array.
		
		int largestInt = Integer.MIN_VALUE;
		for(int i=0; i< numbers.length; i++){
			if(numbers[i] > largestInt){
				largestInt = numbers[i];
			}
		}
		System.out.println("Largest int: "+largestInt);
		
		//12. print only the last element in the array
		
		System.out.println("Last number: "+numbers[49]);
		
	}
}
