import java.util.Scanner;
public class Flow_Control_Statement5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		char c=sc.next().charAt(0);
		//System.out.println(c);
		if((c>=65 && c<=90) || (c>=97 && c<=122))
			System.out.println("Alphabet");
		else if((c>=48 && c<=57) )
			System.out.println("Digit");
		else
			System.out.println("special character");
			
		
		
	}

}
