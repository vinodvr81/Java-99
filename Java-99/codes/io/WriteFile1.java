package co.edureka.java.io;

import java.io.FileWriter;

public class WriteFile1 {

	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("src/co/edureka/java/io/edureka1.txt");
		//FileWriter fw = new FileWriter("src/co/edureka/java/io/edureka1.txt", true); //true - appending mode
		
		String str = "Edureka's online training helps you land the job of your dreams. Enroll now in edureka.co.\n";
		
		fw.write(str);
		
		System.out.println("file saved!!!");
		
		fw.close();

	}

}
