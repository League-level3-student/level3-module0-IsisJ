package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	

	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	

	public static String printAll(String[] names) {
		String listNames = "";
		for(int i=0; i < names.length; i ++) {
			if( i == names.length-1) {
				listNames = listNames+ "" + names[i];
			}else {
				listNames = listNames+ "" + names[i]+ ",";
			}
		}
		return listNames;
	}	
	
	
	public static String printEven (String[] fruit) {
		String evenFruits = "";
		for (int i = 1; i < fruit.length; i = i+2) {
			if(i > fruit.length) {
				evenFruits = evenFruits + " " + fruit[i];
			}else {
				evenFruits = evenFruits + " " + fruit[i]+",";
			}
		}
		return evenFruits;
		
	}

	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	
}
