package javaLearn.geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorEnumeration {
	public static void main(String args[]) {

        // Create a vector and print its contents
        Vector v = new Vector();
        for (int i = 0; i < 10; i++)
            v.addElement(i);
        Enumeration e = v.elements();
        while(e.hasMoreElements()){
        	System.out.println(e.nextElement());
        }
        
        //v.iter
        ArrayList al = new ArrayList();
        al.add(new Integer(1));
        
        Iterator it = al.iterator();
        
		System.out.println("Garbage collection started");
	}
}