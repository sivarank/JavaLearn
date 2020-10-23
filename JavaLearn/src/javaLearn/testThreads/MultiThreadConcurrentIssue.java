package javaLearn.testThreads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

import org.apache.commons.codec.binary.Hex;

class ConcurrentIssue implements Runnable{
		static String str = "";
	@Override
	public void run() {

		try{
			MessageDigest digestAlg = MessageDigest.getInstance("SHA-256");
			Thread.sleep(3);
			byte[] passwordHash = digestAlg.digest(new String("SIVATHEBest").getBytes(StandardCharsets.UTF_8));
			str = Hex.encodeHexString(passwordHash);
			System.out.println(str);
		}catch(Exception ex){
			System.out.println("Failed to print debug statements");
		}
	}
}

public class MultiThreadConcurrentIssue {
	
	public static void main(java.lang.String args[]) {
		{
			int i =0;
			ConcurrentIssue co = new ConcurrentIssue();
			while(i < 10000) {
				Thread thread = new Thread(co);
				thread.start();		
				i++;
			}
		}
	}
}
