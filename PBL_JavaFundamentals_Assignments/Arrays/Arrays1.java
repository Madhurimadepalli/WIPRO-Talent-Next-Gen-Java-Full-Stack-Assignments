
public class Arrays1 {

	public static void main(String[] args) {
		
		int[] arr=new int[10];
		int sum=0;
		for(int i=0;i<10;i++) {
			arr[i]=i;
			sum+=arr[i];}
		System.out.println(sum);
		System.out.println(sum/10);
	}

}
