package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//18
class student{
	String stu_name;
	int stu_rollnum;
	int stu_age;
	
	student(String n,int r,int a){
		this.stu_name=n;
		this.stu_rollnum=r;
		this.stu_age=a;
	}
	
}
public class exp_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<student> al=new ArrayList<student>();
         al.add(new student("divya",05,18));
         al.add(new student("kala",06,17));
         al.add(new student("siva",07,18));
         al.add(new student("kumar",04,17));
         Comparatordemo c=new Comparatordemo();
         Collections.sort(al,c);
         for( student s:al) {
        	 System.out.println(s.stu_name +" "+s.stu_rollnum+ " "+s.stu_age);
         }
         
	}

}
