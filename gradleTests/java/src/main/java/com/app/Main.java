package java.com.app;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//System.out.println(Arrays.toString(args));
		Connector c = new Connector();
		c.capture(args);
	}
}


