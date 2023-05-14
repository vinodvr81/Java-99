package co.edureka.java.except;

import java.io.IOException;
import java.sql.SQLException;

class UserService{
	public String findUserNameById(int id) throws SQLException, IOException {
		//logic to find user name from data store
		if(id == 101) {
			return "Rajesh";
		}else {
			return "Guest";
		}
	}
}
public class ThrowsTest {

	public static void main(String[] args) throws InterruptedException {
		UserService uService = new UserService();
		String name;
		
		try {
			name = uService.findUserNameById(101);
			System.out.println("Hello " + name);
		} catch (Exception e) {		
			e.printStackTrace();
		} 
		
		
		System.out.println();
		System.out.println("please wait for 5 seconds.....");
		Thread.sleep(5000); //500ms
		System.out.println("thanks for waiting");
	}

}
