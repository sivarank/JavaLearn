package javaLearn.AbstractAndInterface;

/*
 * It is an empty interface (no field or methods). 
 * Examples of marker interface are Serializable, Clonnable and Remote interface. 
 * 
 */

interface myOwnMarker {

}

class ImplMyOwnMarker implements myOwnMarker {
	public boolean markerTest() {
		return this instanceof myOwnMarker;
	}
}

public class MarkerInterface {
	public static void main(String args[]) {
		System.out.println(new ImplMyOwnMarker().markerTest());
	}
}
