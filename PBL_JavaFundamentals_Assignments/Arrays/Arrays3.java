import java.util.Scanner;
public class Arrays3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int flag=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		for(int j=0;j<n;j++)
		{
			if(arr[j]==key) {
				System.out.println(j);
				flag=1;
				break;}
		}
		if(flag==0)
		{
			System.out.println(-1);
		}
	}

}
