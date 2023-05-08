package project;

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
        
        public boolean checkErrorName(final String name){
            if(name.charAt(0)==' '||!(name.matches("^[a-zA-Z ]*$"))){
                return true;
            }
            else{
                return false;
            }
        }
	
        public void setName(final String name) {
		if(checkErrorName(name)) {
			error+="Invalid Student Name ";
			flag=true;
		} 
		this.Studentname = name;
	}

	public String getnumber() {
		return Studentnumber;
	}
	
        public boolean checkErrorNumber(final String Studentnumber){
            if(Studentnumber.length()!= 8){
                return true;
            }
            else{
                for(int i = 0; i < Studentnumber.length(); i++){
                    char c = Studentnumber.charAt(i);
                    if (((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z'))&&i!=7){
                        return true;
                    }
                }
                return false;
            }
        }
        
	public void setnumber(final String Studentnumber) {
            if(checkErrorNumber(Studentnumber)){
                error += "Invalid Student Number ";
                flag = true;
            }
            else{
                this.Studentnumber = Studentnumber;
            }	
        }
        
            
//		if(Studentnumber.length()!=8) {
//			error+="Invalid Student Number ";
//			flag=true;
//		}
//		else {
//                    for (int i = 0; i < Studentnumber.length(); i++)
//                    {
//                        char c = Studentnumber.charAt(i);
//                        if (((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z'))&&i!=7) {
//                            error+="Invalid Student Number ";
//                            flag=true;
//	            	}
//	            
//                    }

        public boolean checkErrorOralmark(final int mark){
            if(mark<0||mark>10){
                return true;
            }
            else{
                return false;
            }
        }
	public void setOralmark(final int mark) {
		if(checkErrorOralmark(mark)) {
			
			error+="Invalid Oral mark ";
			flag=true;
		} 
		else this.Oralmark = mark;
	}
        public boolean checkErrorMidtermmark(final int mark){
            if(mark<0||mark>20){
                return true;
            }
            else{
                return false;
            }
        }
	public void setMidtermmark(final int mark) {
		if(checkErrorMidtermmark(mark)) {
			error+="Invalid Midterm mark ";
			flag=true;
		} 
		else
		this.Midtermmark = mark;
	}
        public boolean checkErrorFinalMark(final int mark){
            if(mark < 0 || mark > 60){
                return true;
            }
            else{
                return false;
            }
        }
	public void setFinalmark(final int mark) {
		if(checkErrorFinalMark(mark)) {
			error+="Invalid Final mark";
			flag=true;
		} 
		else
		this.Finalmark = mark;
	}
        public boolean checkErrorStudentActiv(final int mark){
            if(mark < 0 || mark > 10){
                return true;
            }
            else{
                return false;
            }
        }
	public void setStudentActivitiesmark(final int mark) {
		if(checkErrorStudentActiv(mark)) {
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

// BLACK BOX TESTING - WE HAVE USED BVA -> DONE

// WHITE BOX TESTING - BRANCH TESTING -> HUSSEINY, MO3TAZ

// INTEGRATION -> YOUMNA

// CONTROL FLOW -> HANAN, YOUMNA - OTHERS

// DATA FLOW -> ..
