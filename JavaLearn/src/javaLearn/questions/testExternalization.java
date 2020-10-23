package javaLearn.questions;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

//Learn : serialization handled by JVM.
// If we want to handle serializationa and deserialization ourself, use Externalizable
public class testExternalization implements Externalizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

	}

}
