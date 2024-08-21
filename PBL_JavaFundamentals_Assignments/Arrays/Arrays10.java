import java.util.Scanner;
public class Arrays10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] evenOdd=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int ind=0;
		int ind1=n-1;
		for(int j=0;j<n;j++)
		{
			if(arr[j]%2==0)
				evenOdd[ind++]=arr[j];
			else
				evenOdd[ind1--]=arr[j];
		}
		for(int k=0;k<n;k++)
			System.out.print(evenOdd[k]);
	}

}
