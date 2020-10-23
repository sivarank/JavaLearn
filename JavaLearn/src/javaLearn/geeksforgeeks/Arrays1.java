package javaLearn.geeksforgeeks;
import java.util.Arrays;
public class Arrays1 {
	public static void main(String args[]) {
		int[] arr = {2,3,4,5,6,1};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 3));
	}
}