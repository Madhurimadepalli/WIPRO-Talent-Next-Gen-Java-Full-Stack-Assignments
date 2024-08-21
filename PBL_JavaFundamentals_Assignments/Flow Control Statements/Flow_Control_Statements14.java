import java.util.Scanner;
public class Flow_Control_Statements14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int num=n;num>0;)
		{
		sum+=num%10;
		num=num/10;
		}
		System.out.println(sum);
	}

}
