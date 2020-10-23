package javaLearn.geeksforgeeks;

//http://www.geeksforgeeks.org/compare-two-arrays-java/
import java.lang.reflect.Array;
import java.util.Arrays;

class FinalArray{
	public static void main(String args[]){
		final int arr1[] ={1,2,3};
		int arr2[] = {1,2,3};
		int arr3[] ={45};
		
		//arr1= arr3; // error
		arr2 = arr3; // no error arr2 can be modified
			
	}
}