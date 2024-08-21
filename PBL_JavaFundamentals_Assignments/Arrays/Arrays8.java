import java.util.Scanner;
public class Arrays8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int sum=0;
		for(int j=0;j<n;j++)
		{
			if(arr[j]==6)
			{
				while(arr[j]!=7 && j<n)
				{
					j++;
					continue;
				}
				j++;
			}
			if(j<n)
				sum+=arr[j];
		}
		System.out.println(sum);
	}

}
