package proj;

import java.util.*;


public class Student {

	private String Studentname, Studentnumber;
	private int StudentActivitiesmark, Oralmark, Midtermmark, Finalmark;
	int id;
	static int counter;
	String error="";
   private boolean flag=false;
	static {
		counter = 1;
	}
	public Student() {
		this.id = counter;
		counter++;
	}
	public String getName() {
		return Studentname;
	}

	public void setName(final String name) {
		if(name.charAt(0)==' '||!(name.matches("^[a-zA-Z ]*$"))) {
			error+="Invalid Student Name ";
			flag=true;
		} 
		this.Studentname = name;
	}

	public String getnumber() {
		return Studentnumber;
	}
	

	public void setnumber(final String Studentnumber) {
		if(Studentnumber.length()!=8) {
			error+="Invalid Student Number ";
			flag=true;
		}
		else {
			for (int i = 0; i < Studentnumber.length(); i++)
	        {
	            char c = Studentnumber.charAt(i);
	            if (((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z'))&&i!=7) {
	            	
	            	error+="Invalid Student Number ";
	    			flag=true;
	            	
	            }
	            
	        }
			
			
			this.Studentnumber = Studentnumber;
		}
		
	}

	public void setOralmark(final int mark) {
		if(mark<0||mark>10) {
			
			error+="Invalid Oral mark ";
			flag=true;
		} 
		else this.Oralmark = mark;
	}
	public void setMidtermmark(final int mark) {
		if(mark<0||mark>20) {
			error+="Invalid Midterm mark ";
			flag=true;
		} 
		else
		this.Midtermmark = mark;
	}
	public void setFinalmark(final int mark) {
		if(mark<0||mark>60) {
			error+="Invalid Final mark";
			flag=true;
		} 
		else
		this.Finalmark = mark;
	}
	public void setStudentActivitiesmark(final int mark) {
		if(mark<0||mark>10) {
			error+= "Invalid Student Activities mark";
			flag=true;
		}
		else
		this.StudentActivitiesmark = mark;
	}
	int avg;
	public String getGrade() {
		avg=StudentActivitiesmark+Finalmark+Midtermmark+Oralmark;
		  if(avg>= 97 && avg<=100)
	         return "A+";
		  else if(avg>= 93 && avg<97)
		         return "A";
		  else if(avg>=89 && avg<93)
		        return "A-";
		  else if(avg>=84 && avg<89)
		      return "B+";
		  else if(avg>=80 && avg<84)
			  return "B";
		  else if(avg>=76 && avg<80)
			  return "B-";
		  else if(avg>=73 && avg<76)
			    return "C+";
		  else if(avg>=70 && avg<73)
		         return "C";
		  else if(avg>=67 && avg<70)
		         return "C-";
		  else if(avg>=64 && avg<67)
		         return "D+";
		  else if(avg>=60 && avg<64)
		         return "D";
		  else
		         return "F";
	}
	public double getGPA() {
		avg=StudentActivitiesmark+Finalmark+Midtermmark+Oralmark;
		  if(avg>= 97 && avg<=100)
	         return 4;
		  else if(avg>= 93 && avg<97)
		         return 4;
		  else if(avg>=89 && avg<93)
		        return 3.7;
		  else if(avg>=84 && avg<89)
		      return 3.3;
		  else if(avg>=80 && avg<84)
			  return 3;
		  else if(avg>=76 && avg<80)
			  return 2.7;
		  else if(avg>=73 && avg<76)
			    return 2.3;
		  else if(avg>=70 && avg<73)
		         return 2;
		  else if(avg>=67 && avg<70)
		         return 1.7;
		  else if(avg>=64 && avg<67)
		         return 1.3;
		  else if(avg>=60 && avg<64)
		         return 1;
		  else
		         return 0;
	}

	

	@Override
 	public String toString() {
		if(flag)return error;
 		return Studentname+"\t"+Studentnumber+"\t"+this.getGPA()+"\t"+this.getGrade();
 	}
  	


}
