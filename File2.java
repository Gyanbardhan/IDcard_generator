package Project2;
import Project1.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.*;
import java.io.*;
public class File2 {
	public static void filepart(String fname,String sname,String dept,String enrollno,String valid,String bg,String add,String dob,String email,long phone1,long phone2)
	{
		if(dept.equals("CSE"))
			dept="Computer Science & Engg.";
		else if(dept.equals("ECE"))
			dept="Electronics & Communication Engg.";
		System.out.println("		भारतीय सूचना प्रौद्योगिकी संस्थान, नागपुर		");
		System.out.println("	Indian Institute of Information Technology, Nagpur	");
		System.out.println("An Institution of National Importance By An Act of Parliament");
		System.out.println("			छात्र/Student");
		System.out.println(fname+" "+sname);
		System.out.println("-------------------");
		System.out.println("विभाग/Department : "+dept);
		System.out.println("पदवी/Degree : B.Tech");
		System.out.println("आदेश क्रमांक/Enrollment No.:"+enrollno);
		System.out.println("वैध/Valid Upto :"+valid);
		System.out.println();
		System.out.println("		भारतीय सूचना प्रौद्योगिकी संस्थान, नागपुर		");
		System.out.println("	Indian Institute of Information Technology, Nagpur	");
		System.out.println("An Institution of National Importance By An Act of Parliament");
		System.out.println("			छात्र/Student");
		System.out.print("रक्तगट/Blood Group : "+bg);
		System.out.println("		स्थायी पता/Permanent Address :"+add);
		System.out.print("गृह/Res.: "+phone1);
		System.out.println("		ई-मेल/Email :"+email);
		System.out.print("जन्म तिथि/DOB :"+dob);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println("		जारी करने की तिथि/Issue On:"+dtf.format(now));
	}
	public String fname,sname,dept,enrollno,valid,bg,add,dob,email;
	public long phone1,phone2;
public void filepart(String key,int c)
{
	int year=2000+Integer.parseInt(key.substring(2,4));
	String st="C:\\Users\\Gyanbardhan\\eclipse-workspace\\GYANBARDHAN\\BT"+(year-2000)+"\\"+key+".txt";
	File fread=new File(st);
	try {
		Scanner sc=new Scanner(fread);
		while(sc.hasNext())
		{
			fname=sc.next();
			sname=sc.next();
			dept=sc.next();
			enrollno=sc.next();
			valid=sc.next();
			bg=sc.next();
			add=sc.next();
			phone1=sc.nextLong();
			phone2=sc.nextLong();
			dob=sc.next();
			email=sc.next();
			if(c!=-1)
				filepart(fname,sname,dept,enrollno,valid,bg,add,dob,email,phone1,phone2);
		}
		} catch (FileNotFoundException e) {
			//System.out.println(e);
			System.out.println("File Not Found");
	}
}
}
