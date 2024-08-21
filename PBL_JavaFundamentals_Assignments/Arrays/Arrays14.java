
public class Arrays14 {

	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		int k=0;
		int max=0;
		if(args.length!=9)
			System.out.println("Please enter 9 digit numbers");
		else {
		System.out.println("The given array is: ");
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++) {
				arr[row][col]=Integer.parseInt(args[k++]);
				System.out.print(arr[row][col]);
				if(arr[row][col]>max)
					max=arr[row][col];
			}	
			System.out.println();
		}
		System.out.println("The biggest number is the given array is "+max );}
		
	}

} 
