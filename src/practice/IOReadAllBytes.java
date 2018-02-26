package practice;

import java.io.IOException;

public class IOReadAllBytes {
	
	public static void main(String[] args) throws IOException {
		
		byte [] input = System.in.readAllBytes();
		
		System.out.print(input);
	}

}
