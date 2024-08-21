import java.util.Scanner;
public class Arrays5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++)
			arr[i]=sc.nextInt();
		for(int iter=0;iter<len;iter++)
		{
			for(int j=0;j<(len-1)-iter;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		if(len>=2) {
			System.out.println("Largest 2 numbers: "+arr[len-1]+","+ arr[len-2]);
			System.out.println("smallest 2 numbers: "+arr[0]+","+ arr[1]);
		}
	}

}
