
public class Main {

	public static void main(String[] args) {
		// Problem 1
		double runtime = Problem1.Problem1(10) + Problem1.Problem1(100) + Problem1.Problem1(1000) + Problem1.Problem1(10000) + Problem1.Problem1(100000) + Problem1.Problem1(1000000) + Problem1.Problem1(10000000);
		System.out.println("Total Runtime: " + runtime);
		
		// Problem 2
		new Problem2().Problem2();
	}

}
