import java.util.Scanner;
import java.util.StringTokenizer;

public class tokenizer {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	StringTokenizer str1=new StringTokenizer(str);
	int i=0;
	while(str1.hasMoreTokens())
	{
		
		i++;
		System.out.println(i+"\t"+str1.nextToken());
		
	}
}
}
