import java.util.Scanner;
public class Arrays4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
			System.out.println((char)arr[i]);
			}
		
	}

}
