import java.util.Scanner;
public class Flow_Control_Statements15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		if(num.isEmpty())
			System.out.println("Please ennter an integer ");
		for(int i=0;i<Integer.valueOf(num);i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print(" *");
			System.out.println();
		}
	}

}
