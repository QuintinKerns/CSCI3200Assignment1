import java.util.ArrayList;

public class Problem1 {
	
	public static int Problem1(int N) { // N is number of random numbers
		
		int K = N / 2 - 1; // Middle largest number minus one to account for arrays starting at 0

		ArrayList<Integer> nums = new ArrayList<Integer>(N);
		
		// Fill array with N random ints. Multiply by N to make numbers big enough to be ints.
		for (int i = 0; i < N; i++) {
			nums.add(i, (int) ( Math.random() * N ));
		}
		
		System.out.println(N + " (N) Random Numbers: " + nums);
		long startTime =  System.nanoTime() / 1000000000; // Start time in seconds

		// Array to put K largest numbers in.
		int[] largeNums = new int[K];
		
		// Find largest number in nums, add it to largeNums, then remove it from nums ArrayList.
		// Repeat K times until we reach the Kth largest number.
		for (int i = 0; i < K; i++) {
			for (int j = 0; j < N; j++){
				if (largeNums[i] <= nums.get(j)) {
					largeNums[i] = nums.get(j);
					nums.remove(j);
					N = N-1;
				}
			}
		}
        
		
		long endTime = System.nanoTime() / 1000000000 - startTime; // End time in seconds
		System.out.println("Start Time: " + startTime);
		System.out.println("End Time: " + endTime);
		System.out.println("The " + K + "th (Kth) largest number is: " + largeNums[K]);
		// Return Kth largest number
		return largeNums[K];
	}
}
