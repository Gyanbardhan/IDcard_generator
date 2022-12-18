package Project1;
import java.util.*;
public class Part2 {
	Scanner sc=new Scanner(System.in);
	public String fname,sname,dept,enrollno,valid,bg,add,dob,email;
	public int year;
	public long phone1,phone2;
	public void input()
	{
		System.out.print("Enter First Name=");
		fname=sc.next();
		System.out.print("Enter Second Name=");
		sname=sc.next();
		
		System.out.print("Enter Enrollment No.=");
		enrollno=sc.next();
		enrollno=enrollno.toUpperCase();
		dept=enrollno.substring(4,7);
		year=2000+Integer.parseInt(enrollno.substring(2,4));
		System.out.println("Valid Upto:"+"31/06/"+(year+4));
		valid="31/06/"+(year+4);
		System.out.print("Enter Blood Group=");
		bg=sc.next();
		System.out.print("Enter Address=");
		add=sc.next();
		System.out.print("Enter Phone No.=");
		phone1=sc.nextLong();
		System.out.print("Enter Parent's Phone No.=");
		phone2=sc.nextLong();
		System.out.print("Enter Date of Birth=");
		dob=sc.next();
		email=enrollno.toLowerCase()+"@iiitn.ac.in";
		System.out.println("College Email Id="+email);
	}
	

}
