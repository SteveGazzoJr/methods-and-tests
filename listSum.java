//listSum.class
//Write three functions that compute the sum of the numbers in a given list using a for-loop, a while-loop, and recursion.

public class listSum{
	
		
	public static int forSum(int[] input){
		int count;
		int sum = 0;
		
		for(count = 0; count <input.length; count++){
			sum+=input[count];
		}
		return sum;
	}
	
	public static int whileSum(int[] input){
	
		int count = 0;
		int sum = 0;
		
		while(count < input.length){
		
			sum+=input[count];
			count++;
		}
		
		return sum;
	}
	
	public static int recurSum(int[] input, int count, int sum){ //initial call assumes sum=0&&count=0
		int rsum = 9999;
		
		sum+=input[count];
		count++;	
		
		if (count<=input.length){																	 
			recurSum(input, count, sum);			
		}
		else
		{
			sum = rsum;
		}
		return sum;

	}
	
}