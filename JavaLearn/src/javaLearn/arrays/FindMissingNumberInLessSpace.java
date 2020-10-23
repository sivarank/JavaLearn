package javaLearn.arrays;

/**
 * Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.

Sample Input:

[3 4 1 4 1]
Sample Output:

1
If there are multiple possible answers ( like in the sample case above ), output any one.

If there is no duplicate, output -1
 * @author SIVAR1
 *
 */
public class FindMissingNumberInLessSpace {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5,6,3};
		int n = arr.length-1;
		//Find sqrt n 
		int sqrtN= (int)Math.ceil( Math.sqrt(n));
		int bucketSize = n%sqrtN == 0? (n/sqrtN) :(n/sqrtN+1); 
		int buckets[] = new int[bucketSize];
		// each bucket cell can have max sqrtN elements. except last bucket
		for(int i=0; i< n+1; i++) {
			if(arr[i] %sqrtN == 0) {
				buckets[arr[i]/sqrtN -1] += 1; 
			}else {
				buckets[arr[i]/sqrtN] += 1;
			}
		}
		
		//scan each bucket
		int duplicateBucketNo = -1;
		for(int i=0; i<buckets.length; i++) {
			if(buckets[i] > sqrtN) {
				duplicateBucketNo = i;
				break;
			}else if(n % sqrtN != 0 && i+1 ==buckets.length ) {
				int partialSize = n % sqrtN;
				if(partialSize < buckets[i]) {
					duplicateBucketNo = i;
					break;
				}
			}
		}
		if(duplicateBucketNo == -1) {
			System.out.println("there is no repeated number");
		}else {
			int count[] = new int[sqrtN];
			for(int i=0; i<n+1; i++) {
				if((arr[i] > (duplicateBucketNo*sqrtN)) && (arr[i] <= (duplicateBucketNo+1)*sqrtN)){
					int index = (arr[i]-1) % sqrtN ;
					if(count[index] == 1) {
						System.out.println("duplicate element is : "+arr[i]);
						break;
					}else {
						count[index] = 1;
					}
				}
			}
		}
		
	}

}
