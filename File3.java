package Project2;
import java.util.*;
import java.io.*;
public class File3 {
	public void modify(String key)
	{
		Scanner sc=new Scanner(System.in);
		File2 f2=new File2();
		f2.filepart(key,-1);
		System.out.println("What you want to modify?");
		System.out.println("	1.First Name");
		System.out.println("	2.Second Name");
		System.out.println("	3.Blood Group");
		System.out.println("	4.Address");
		System.out.println("	5.Phone No.");
		System.out.println("	6.Parent's Phone No.");
		System.out.println("	7.Date of Birth");
		System.out.print("Enter your choice : ");
		int choice=sc.nextInt();
		int c=0;
		switch(choice)
		{
		case 1:String nfname;
		System.out.print("Enter correct First Name=");
		nfname=sc.next();
		f2.fname=nfname;
		break;
		case 2:String nsname;
		System.out.print("Enter correct Second Name=");
		nsname=sc.next();
		f2.sname=nsname;
		break;
		case 3:String nbg;
		System.out.print("Enter correct Blood Group=");
		nbg=sc.next();
		f2.bg=nbg;
		break;
		case 4:String nadd;
		System.out.print("Enter correct Address=");
		nadd=sc.next();
		f2.add=nadd;
		break;
		case 5:long nphone1;
		System.out.print("Enter correct Phone No.=");
		nphone1=sc.nextLong();
		f2.phone1=nphone1;
		break;
		case 6:long nphone2;
		System.out.print("Enter correct Parents Phone No.=");
		nphone2=sc.nextLong();
		f2.phone2=nphone2;
		break;
		case 7:String ndob;
		System.out.print("Enter correct Date of Birth=");
		ndob=sc.next();
		f2.dob=ndob;
		break;
		default:c=-1;
			System.out.println("Invalid Chioce!!");
		}
		if(c!=-1)
		{
			int year=2000+Integer.parseInt(f2.enrollno.substring(2,4));
			File1 fw=new File1();
			fw.write(year,f2.fname,f2.sname,f2.dept,f2.enrollno,f2.valid,f2.bg,f2.add,f2.dob,f2.email,f2.phone1,f2.phone2);
			System.out.println("Modified!!");
		}
	}

}
