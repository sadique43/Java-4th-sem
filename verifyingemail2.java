import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class verifyingemail2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String mail=sc.nextLine();
		Pattern p=Pattern.compile("[A-Za-z1-9]+"+"[.]*"+"[A-Za-z1-9]+"+"[@]+"+"[A-Za-z0-9]+"+"[.]+"+"[A-Za-z]+");
		Matcher m=p.matcher(mail);
		if(m.find())
		{
			System.out.println(m.group());
		}
		
	}
}
