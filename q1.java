import java.util.Scanner;

public class q1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your choice 1) number and 2) string");
	int ch1=sc.nextInt();
	if(ch1==1)
	{
		System.out.println("enter the number you wnat to check");
		int n=sc.nextInt();
		//finding reverse
		int rev=0,div;
		int n1=n;
		while(n>0)
		{
			div=n%10;
			rev=div+rev*10;
			n=n/10;
		}
		if(rev==n1)
		{
			System.out.println("the given number is a palindrome");
		}
		else
			System.out.println("the given number is not a palindrome");
	}
	else if(ch1==2)
	{
	
		System.out.println("enter the word you want to check");
		
	
	String str=sc.next();
	
	char ch[]=str.toCharArray();
	int i,j,flag=0;
	
	for(i=0,j=str.length()-1;i<j;i++,j--)
	{
		if(ch[i]==ch[j])
		{
			flag=1;
		}
		else
			flag=0;
	}
	if(flag==1)
	{
		System.out.println("the given string is a palindrome");
	}
	else
		System.out.println("the given string is not a palindrome");
	}
}
}
