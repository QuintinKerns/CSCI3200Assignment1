import java.util.ArrayList;
import java.util.Collections;

public class Problem1 {
	
	public static double Problem1(int N) { // N is number of random numbers
		
		// Attempt 2:
		int K = N / 2;
		ArrayList<Integer> randomNums = new ArrayList<Integer>(N);
		
		// Fill array with N random ints. Multiply by N to make numbers big enough to be ints.
		for (int i = 0; i < N; i++) {
			randomNums.add(i, (int) ( Math.random() * N ));
		}
		
		//System.out.println(N + " (N) Random Numbers: " + randomNums);
		long start = System.nanoTime(); // Start time in seconds
		
		/* Timed Algorithm */
		
		// Sort Array in ascending order
		Collections.sort(randomNums);
		
		// Take Kth number from Array
		int kthNumber = randomNums.get(K - 1); // Minus 1 to account for arrays starting at 0
		
		/* End Timed Algorithm */
		long end = System.nanoTime(); // End time in seconds
		
		//long runtime = Long.parseLong(String.format( "%12.6f",((end-start)/Math.pow(10,9))));
		double runtime = (end-start)/Math.pow(10,9);
		System.out.println("Runtime: " + runtime + "	N: " + N);
		//System.out.println("Random Nums: " + randomNums);
		System.out.println(K + "th (Kth) Number: " + kthNumber);
		System.out.println("------------------------------");
		return runtime;
		
		// Attempt 1: 
		/*
		int K = N / 2; // Middle largest number

		ArrayList<Integer> nums = new ArrayList<Integer>(N);
		
		// Fill array with N random ints. Multiply by N to make numbers big enough to be ints.
		for (int i = 0; i < N; i++) {
			nums.add(i, (int) ( Math.random() * N ));
		}
		
		// Array to put the K largest numbers in.
		int[] largeNums = new int[K];
		
		System.out.println(N + " (N) Random Numbers: " + nums);
		long start = System.nanoTime(); // Start time in seconds

		// Find largest number in nums, add it to largeNums, then remove it from nums ArrayList.
		// Repeat K times until we reach the Kth largest number.
		for (int kCounter = 0; kCounter < K; kCounter++) {
			for (int nCounter = 0; nCounter < N; nCounter++){
				
				if (largeNums[kCounter] < nums.get(nCounter)) {
					largeNums[kCounter] = nums.get(nCounter);
					nums.remove(nCounter);
					N--;
					// Loop through nums to remove duplicate values in array, reducing N accordingly
					for (int dupCounter = 0; dupCounter < N; dupCounter++){
						if (nums.get(dupCounter) == largeNums[kCounter]){
							nums.remove(dupCounter);
							N--;
						}
					}
					
				}
			}
		}
        
		long end = System.nanoTime(); // End time in seconds
		System.out.println("Start time:" + String.format( "%12.6f",((end-start)/Math.pow(10,9))));
		System.out.println("End time:" + String.format( "%12.6f",((end-start)/Math.pow(10,9))));
		System.out.println("The " + K + "th (Kth) largest number is: " + largeNums[K-1]);
		
		String lrgNumsStr = "K Largest Numbers: ";
		for (int i = 0; i < K; i++){
			lrgNumsStr += largeNums[i] + ", ";
		}
		
		//Print largeNums DEBUG
		System.out.println(lrgNumsStr);
		
		System.out.println("-----------------------------");
		// Return Kth largest number
		return largeNums[K-1];
		*/
	}
}
