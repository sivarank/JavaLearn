package javaLearn.arrays;

public class BinarySearchConditionalOperator {

	public static void main(String[] args) {
		int[] arr = new int[] {0,0,0,0,1,1,1};
		int start = 0, end = arr.length;
		while(start < end) {
			int mid = (start + end)/2;
			if(arr[mid] == 0)
				start = mid+1;
			else
				end = mid-1;
		}
		System.out.println((arr[start] == 0)? start+1 : start);
	}

}
