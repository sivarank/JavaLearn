package javaLearn.geeksforgeeks;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapp {
	public static void main(String args[]) {
		ConcurrentHashMap<String,String> countryCapitalMap=new ConcurrentHashMap<String,String>();
		countryCapitalMap.compute("123", (key, val)->{return "123";});
	}
}