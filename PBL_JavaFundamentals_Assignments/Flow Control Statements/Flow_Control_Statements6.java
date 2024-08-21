import java.util.Scanner;
public class Flow_Control_Statements6 {

	public static void main(String[] args) {
		String s=args[0];
		int i=Integer.parseInt(args[1]);
		if(s.equals("Female")&& i>=1 && i<=58)
			System.out.println("The percentage of Intrest is 8.2%");
		else if(s.equals("Female")&& i>=59 && i<=100)
			System.out.println("The percentage of Intrest is 9.2%");
		else if(s.equals("Male")&& i>=1 && i<=58)
			System.out.println("The percentage of Intrest is 8.4%");
		else if(s.equals("Male")&& i>=59 && i<=100)
			System.out.println("The percentage of Intrest is 10.5%");
	}

}
