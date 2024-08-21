import java.util.Scanner;
public class Flow_Control_Statements7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c>=65 && c<=90) 
			System.out.println(c+"->"+(char)(int)c+32);
		else
			System.out.print(c+"->"+(char)((int)c-32));
	}

}
