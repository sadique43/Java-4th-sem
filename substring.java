import java.util.Scanner;

public class substring {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first string");
	String str1=sc.nextLine();
	System.out.println("enter the next String");
	String str2=sc.nextLine();
	int flag=0;
	for(int i=0;i<str1.length()-1;i++)
		
	{
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		if(ch2[i]==ch1[i])
		{
			flag=1;
		}
		else
			flag=0;
	if(flag==1)
	{
		for(int j=0;j<str2.length();j++)
		{
			if(ch2[j]==ch1[j])
			{
				flag=1;
			}
			
	
	}
	if(flag==1)
	{
		System.out.println("the first string contains the second one");
	}
	else
		System.out.println("the first string doesnot contains the second string");
	}
	}
}
}
