import java.util.Scanner;
public class Arrays11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] only14=new int[n];
		int flag=0;
		for(int i=0;i<n;i++) {
			only14[i]=sc.nextInt();
			if(only14[i]==1 || only14[i]==4)
				continue;
			else {
				System.out.println("False");
				flag=1;}
		}
		if(flag==0)
			System.out.println("true");
	}

}
