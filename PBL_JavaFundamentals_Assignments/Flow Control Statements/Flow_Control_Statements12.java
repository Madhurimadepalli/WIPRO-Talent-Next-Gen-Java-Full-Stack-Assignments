import java.util.Scanner;
public class Flow_Control_Statements12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int flag=0;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0) {
				System.out.println("NOt a prime number");
				flag=1;
				break;}
		}
		if(flag==0)
			System.out.println("It is a Prime");
	}

}
