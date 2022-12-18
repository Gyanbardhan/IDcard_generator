package Project1;
import java.util.*;
public class Final {
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	Part5 p5=new Part5();
	int c=0;
	for(int i=1;i<=1;)
	{
		c++;
		if(c==1)
		    p5.IdCard(1);
		else
			p5.IdCard(0);
		System.out.print("Press 0 to go back to Main Menu or any other key to exit.");
		int x=sc.nextInt();
		if(x!=0)
			i++;
	}
}
}
