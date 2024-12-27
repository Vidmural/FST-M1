package activities;

import java.util.Arrays;

public class Activity4 {
	public static void main(String args[]) {
		Activity4 actObj = new Activity4();

		// create the unsorted array
		int[] nums = { 55, 10, 5, 47, 424, 210, 8, 21, 1 };

		// call the function to sort the array
		actObj.insertionSort(nums);
		System.out.println("Sorted Array : " + Arrays.toString(nums));

	}

	public void insertionSort(int[] nums) {
// set the size of the array

		int size = nums.length;

		// loop through the array starting from second value

		for (int i = 1; i < size; i++) {
			int key = nums[i];
			int j = i - 1;

			while (j >= 0 && key < nums[j]) {
				nums[j + 1] = nums[j];
				--j;
			}
			nums[j + 1] = key;
		}
	}

}
