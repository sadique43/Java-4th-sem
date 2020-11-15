import java.util.Scanner;

public class replaceAll {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	
	System.out.println("enter the character to be replaced");
	String str2=sc.nextLine();
	
	System.out.println("enter the character to  be replaced with");
	String str3=sc.nextLine();
	
	System.out.println(str.replace(str2, str3));
}
}
