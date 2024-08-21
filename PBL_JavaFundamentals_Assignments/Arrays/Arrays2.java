import java.util.Scanner;
public class Arrays2 {

	public static void main(String[] args) {
		//we can  use Integer.MAX_VALUE and Integer.MIN_VALUE;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int max=0;
		int min=999;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];}
		System.out.println(min);
		System.out.println(max);

		
	}

}
