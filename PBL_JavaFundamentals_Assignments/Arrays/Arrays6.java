import java.util.Scanner;
public class Arrays6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++)
			arr[i]=sc.nextInt();
		for(int iter=0;iter<len;iter++)
		{
			for(int j=iter+1;j<len;j++)
			{
				if(arr[iter]>arr[j])
				{
					int temp=arr[iter];
					arr[iter]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0;k<len;k++)
			System.out.println(arr[k]);
	}

}


