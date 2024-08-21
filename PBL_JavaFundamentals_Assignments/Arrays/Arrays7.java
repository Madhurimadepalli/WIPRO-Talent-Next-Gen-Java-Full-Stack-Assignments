import java.util.Scanner;
import java.util.LinkedHashSet;
public class Arrays7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int j=0;j<n;j++)
			set.add(arr[j]);
		System.out.println(set);
	}

}
