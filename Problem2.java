import java.util.Scanner;

public class Problem2 {
	public int Problem2(){
		int N = 0, C = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		N = scan.nextInt();
		C = isOdd(N, C);
		System.out.println("C: " + C);
		scan.close();
		return C;
	}
	public int isOdd(int N, int C){
		if (N % 2 == 1){
			C++;
		}
		if (N == 0){
			return C;
		}
		System.out.println("N: " + N + ", C: " + C);
		C = isOdd(N / 2, C);
		return C;
	}
}
