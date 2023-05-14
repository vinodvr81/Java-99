package co.edureka.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("src/co/edureka/java/io/java.txt");
		
		/*
		System.out.println("no of characters to be read = " + fin.available());
		System.out.println(fin.read());
		System.out.println(fin.read());
		System.out.println("no of characters to be read = " + fin.available());
		*/
		
		/*
		//--read file contents character-by-character
		int n = fin.read();
		while(n != -1) {
			System.out.print((char)n);
			n = fin.read();
			Thread.sleep(100);
		}
		*/
		
		/*
		//--read file contents as a whole
		byte[] b = new byte[fin.available()];
		fin.read(b);
		String str = new String(b);
		System.out.println(str);
		*/
		
		//--read file contents line-by-line
		Reader fileSource = new InputStreamReader(fin);
		BufferedReader br = new BufferedReader(fileSource);
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
			Thread.sleep(2000);
		}
		
		fin.close();
		br.close();
	}
}