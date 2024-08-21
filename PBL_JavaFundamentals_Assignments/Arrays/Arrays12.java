import java.util.Scanner;
import java.util.ArrayList;
public class Arrays12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[3];
		int[] b=new int[3];
		ArrayList<Integer> arlst=new ArrayList<Integer>();
		System.out.println("Enter array a elements");
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
			
			}
		System.out.println("Enter array b elements");
		for(int j=0;j<3;j++) {
			b[j]=sc.nextInt();
			}
		arlst.add(a[1]);
		arlst.add(b[1]);
		System.out.println(arlst);
		
	}

}
