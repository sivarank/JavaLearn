package javaLearn.geeksforgeeks;

//http://www.geeksforgeeks.org/compare-two-arrays-java/
import java.lang.reflect.Array;
import java.util.Arrays;

class CompareArrays{
	public static void main(String args[]){
		int arr1[] ={1,2,3};
		int arr2[] = {1,2,3};
		if(arr1 == arr2)
			System.out.println("Same");
		else
			System.out.println("Not Same");
		
		if(Arrays.equals(arr1, arr2))
			System.out.println("Same");
		else
			System.out.println("Not Same");		
			
	}
}