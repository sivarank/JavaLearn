package javaLearn.geeksforgeeks;

//http://www.geeksforgeeks.org/compare-two-arrays-java/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex{
	public static void main(String args[]){
		Pattern p = Pattern.compile("g+");
		Matcher m = p.matcher("geeksforgeeks");
		while(m.find())
			System.out.println("Pattern found from : "+m.start()+"  end : "+(m.end()-1));
		
		String[] strs = p.split("geeksforgeeks");
		for(String s : strs){
			System.out.println(s);
		}
	}
}