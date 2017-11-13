package fibonacci;

public class fibonacciRunner {

	public static void main(String[] args) {
		long[] fibArray = new long[100];
		
		fibArray = fibonacci.run(1,1,2);
		
		int count;
		for (count = 0; count <100; count++) {
			System.out.println(fibArray[count]);
		}
	}

}
