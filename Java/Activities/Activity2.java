package activities;

public class Activity2 {
	public static void main(String[] args) {
		Activity2 actObj = new Activity2();
		// create integer array

		int[] nums = { 10, 77, 10, 54, -11, 10 };

		// Set the number to search for
		int searchNum = 10;
		int fixedSum = 30;

		// call the result function and print out the result
		System.out.println("Result: " + actObj.result(nums, searchNum, fixedSum));

	}

	public boolean result(int[] nums, int searchNum, int fixedSum) {

// temp variable to hold the calculated sum
		int tempSum = 0;

// Loop through the array to calculate sum
		for (int number : nums) {
			// Check if the value is the searchNum
			if (number == searchNum) {
				// Add the value
				tempSum += searchNum;
			}

// check if tempSum is greater than fixedSUm
			if (tempSum > fixedSum) {
				// condition fails, break loop
				break;
			}

		}
		return fixedSum == tempSum;
	}
}
