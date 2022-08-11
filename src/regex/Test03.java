package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test03 {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("ID= ");
		String user= sc.next();
		
		
		String regex="^[가-힣0-9]{2,10}$";
		boolean test=Pattern.matches(regex, user);
		System.out.println("테스트="+test);
		sc.close();
	}
}
