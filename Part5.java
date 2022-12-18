package Project1;
import java.util.*;
import Project2.*;
public class Part5 extends Part1 {
	public void IdCard(int c)
	{
		Scanner sc=new Scanner(System.in);
		if(c==1)
			super.iiitn(5);
		System.out.println("		Welcome to Id Card System of IIIT Nagpur");
		System.out.println("			1.Enter Data for New Student.");
		System.out.println("			2.Generate Id Card.");
		System.out.println("			3.Modify Id Card Data of Student.");
		System.out.print("Enter Choice(1-3) : ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:Part3 p3=new Part3();
		p3.input();
		break;
		case 2:File2 f2=new File2();
		String key;
		System.out.print("Enter Enrollment no.=");
		key=sc.next();
		key=key.toUpperCase();
		f2.filepart(key,1);
		break;
		case 3:File3 f3=new File3();
		String key1;
		System.out.print("Enter Enrollment no.=");
		key1=sc.next();
		key1=key1.toUpperCase();
		for(int i=1;i<=1;)
		{
			f3.modify(key1);
			System.out.print("Press 0 to Modify information again or any other key to exit.");
			int x=sc.nextInt();
			if(x!=0)
				i++;
		}
		break;
		default:
			System.out.println("Invalid Chioce!!");
		}
	}

}

