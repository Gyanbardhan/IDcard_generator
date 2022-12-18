package Project2;
import java.util.*;//for scanner class
import java.io.*;//for input output operations
public class File1
//This class will write in file
{
	public void write(int year,String fname,String sname,String dept,String enrollno,String valid,String bg,String add,String dob,String email,long phone1,long phone2)
	//Function for writing in file
	{
		String st="C:\\Users\\Gyanbardhan\\eclipse-workspace\\GYANBARDHAN\\BT"+(year-2000)+"\\"+enrollno+".txt";
		//st contains the location of file
		File fwrite=new File(st);
		//Exception Handling using try catch if file not found
		try {
			FileWriter fw=new FileWriter(st);
			PrintWriter pw=new PrintWriter(fw);
//			        PrintWriter gives you some handy methods for 
//			        formatting like println and printf . 
//			        So if you need to write printed text - 
//			        you can use it. FileWriter is more like "low-level"
//			        writer that gives you ability to write 
//			        only strings and char arrays.
			pw.println(fname);
			pw.println(sname);
			pw.println(dept);
			pw.println(enrollno);
			pw.println(valid);
			pw.println(bg);
			pw.println(add);
			pw.println(phone1);
			pw.println(phone2);
			pw.println(dob);
			pw.println(email);
			pw.close();
			fw.close();
            } catch (IOException e) {
            	System.out.println("Not Found");
		}
		
}

}
