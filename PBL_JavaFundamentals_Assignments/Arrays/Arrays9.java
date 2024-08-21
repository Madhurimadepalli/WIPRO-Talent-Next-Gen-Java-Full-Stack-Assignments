import java.util.Scanner;
public class Arrays9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] new_arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int k=0;
		for(int j=0;j<n;j++)
		{
			if(arr[j]!=10)
				new_arr[k++]=arr[j];
		}
		/*while(k<n)
		{
			new_arr[k++]=0;
		}*/
		for(int l=0;l<n;l++)
			System.out.println(new_arr[l]);
	}

}
