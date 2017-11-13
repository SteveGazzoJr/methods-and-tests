//listSumRunner.java

public class listSumRunner{

	public static void main(String[] args){
	
		int[] test = new int[5];
		test[0] = 0;
		test[1] = 1;
		test[2] = 2;
		test[3] = 3;
		test[4] = 4;
		int output;
		output = listSum.forSum(test);
		System.out.println(output);
		
		output = 0;
		
		output = listSum.whileSum(test);
		System.out.println(output);
		
		output = 0;
		
		System.out.println(listSum.recurSum(test,0,0));
		
		
	}
}