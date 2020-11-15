import java.util.Scanner;
import java.util.regex.Pattern;

public class verifyingemail {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String mail=sc.nextLine();
	Pattern p=Pattern.compile("^[A-Za-z1-9]+"+"[.]*"+"[A-Za-z1-9]+"+"[@]*"+"[A-Za-z0-9]+"+"[.]*"+"[A-Za-z]+&");
	System.out.println(p.matcher(mail).matches());
	
}
}
