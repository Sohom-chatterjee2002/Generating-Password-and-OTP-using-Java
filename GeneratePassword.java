import java.util.*;
public class GeneratePassword{
	static char[] generate_password_util(int len){

		String capital_char="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small_char="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String symbols="!@#$%^&*()_/.?<>";

		String values=capital_char + small_char + numbers + symbols;

		//using random method generate password
		Random rand_meth=new Random();
		char[] password=new char[len];

		for(int i=0;i<len;i++){
			password[i]=values.charAt(rand_meth.nextInt(values.length()));
		}
		return password;
	}
	public static void main(String[] args){
		int length=8; //normally minimum password length is 8
		System.out.println("Please Wait...");
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		System.out.println("Generating Password,just a second...");
		System.out.println(generate_password_util(length));
	}
}
