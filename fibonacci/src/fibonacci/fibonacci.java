//generate fibonacci sequence to n

package fibonacci;


public class fibonacci {
	
	static long[] fibo = new long[100];
	static int count;
	
	public static long[] run(int input1, int input2, int count) {
		
		
		if(count < 100) {
			count++;
			int output = input1+input2;
			fibo[count-1] = output;
			run(input2, output, count);
		}
		
			
		return fibo;
	}

}
