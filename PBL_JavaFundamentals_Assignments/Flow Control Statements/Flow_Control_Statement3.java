import java.util.*;
public class Flow_Control_Statement3 {

	public static void main(String[] args) {
		if(args.length==0)
			System.out.println("no Values");
		else
			for(int i=0;i<args.length;i++)
			{
				if(i==args.length-1)
					System.out.println(args[i]);
				else
				System.out.print(args[i]+",");
			}
	}

}
