package Project1;
import java.util.Scanner;
import Project2.*;
public class Part3 {
	Scanner sc=new Scanner(System.in);
	void input()
	{
		
		Part2 p2=new Part2();
		File1 fw=new File1();
		int a;
		do
		{
			p2.input();
			fw.write(p2.year,p2.fname,p2.sname,p2.dept,p2.enrollno,p2.valid,p2.bg,p2.add,p2.dob,p2.email,p2.phone1,p2.phone2);
			System.out.print("Enter 0 to input again else Press any key.");
			a=sc.nextInt();
			if(a==0)
				System.out.println("Enter Details for next student.");
		}while(a==0);
	}

}
