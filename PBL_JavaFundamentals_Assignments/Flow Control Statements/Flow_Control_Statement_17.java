import java.util.Scanner;
public class Flow_Control_Statement_17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			sum=rem+sum*10;
			num=num/10;
		}
		if(sum==n)
			System.out.println(n+" is a palindrome");
		else
			System.out.println(n+" is not a palindrome");
	}
}