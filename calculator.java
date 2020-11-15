import java.util.Scanner;

public class calculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	int n1;
	System.out.println("enter the number of terms you want to calculate");
	n1=sc.nextInt();
	
		System.out.println("enter the number");
		int n2=sc.nextInt();
		System.out.println("enter the argument 1-> '+'  2-> '-'  3-> '*'  4-> '/'");
		int n3=sc.nextInt();
		System.out.println("enter the number");
		int n4=sc.nextInt();
		double cal=1;
		if(n3==1)
		
			cal=(n2+n4);
			
		
		else if(n3==2)
		
			cal=n2-n4;
			
		
		else if(n3==3)
		
			cal=n2*n4;
			
		
		else if(n3==4)
		
			cal=n2/n4;
			System.out.println(cal);
		
		while((n1-2)>0)
		{
			
			System.out.println("enter the argument 1-> '+'  2-> '-'  3-> '*'  4-> '/'");
			 n3=sc.nextInt();
			System.out.println("enter the number");
			 n4=sc.nextInt();
			 
			if(n3==1)
			{
				cal=(cal+n4);
				System.out.println(cal);
			}
			else if(n3==2)
			{
				cal=cal
						
						-n4;
				System.out.println(cal);
			}
			else if(n3==3)
			{
				cal=cal*n4;
				System.out.println(cal);
			}
			else if(n3==4)
			{
				cal=cal/n4;
				System.out.println(cal);
			}
			n1--;
			
		}
		
	
	
}
}
