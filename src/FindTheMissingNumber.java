import java.util.Random;

public class FindTheMissingNumber {
	
	public static void findTheMissingNum(int sumOfArray) {
		int correctArraySum = 55;
			if(sumOfArray == correctArraySum) {
				System.out.println("no numbers are missing");
			}
			else {
				int missingNum = correctArraySum - sumOfArray ;
				System.out.println("missing number " +missingNum+"!");
			}
	}
	
	/*public static void isItAlreadyInMyArray(int array[], int ranNum) {
		for(int i=0; i< array.length;i++) {
			if(array[i]!=ranNum) {
				
			}
		}
	}
	*/
	
	public static void main(String[] args) {

		//int[] numbers = new int[10];
		int num [] = {1,2,3,4,5,0,7,8,9,10};
		int sum = 0;
		//int[] num2 = new int[10];
		//int sum2 = 0;
		
		for( int i = 0; i<num.length; i++) {
			sum = sum + (num[i]);
			System.out.println(sum);
		}
		
		/*Random random = new Random(); 
		int ranNum = random.nextInt(11);
		int[] randomNumArray = new int[10];
		
		for(int i=0; i<num2.length; i++) {
			randomNumArray[i] = ranNum;
			if(ranNum!=isItAlreadyInMyArray(randomNumArray)) {
				num2[i] = ranNum;
			}
			sum2 = sum2 + num2[i];
			}
		*/
		
		findTheMissingNum(sum);
		
		
		
	}

}
