package proj;

import java.util.ArrayList;

public class Subject extends Student {
	private String Subjectname,Subjectcode;
	String fullmark;
	String errors="";
	private boolean flag=false;
	public ArrayList<Student> students = new ArrayList<Student>();
	 public Subject() {
		 students = new ArrayList<Student>();
	 	}
	 public ArrayList<Student> getdata(){
	  		return students;
	  	}
	 public String getsubjectName() {
			return Subjectname;
		}
	 public String getsubjectcode() {
			return Subjectcode;
		}
	 public void setFullmark(String mark) {
		if(!mark.equals("100")) {
			errors+="The full mark should be 100!!";
		flag=true;	
		}
		else fullmark=mark;
	 }
		public void setSubjectName(final String name) {
			if(name.charAt(0)==' '||!(name.matches("^[a-zA-Z ]*$"))) {
				errors+="Invalid Subject Name";
				flag=true;	
			}
			this.Subjectname = name;
		}
	 
	   
		public void setcode(final String name) {
			
			if(name.length()<6||name.length()>7){
            	errors="Invalid Subject Code";
            	flag=true;
            }
			else {
				for (int i = 0; i < name.length(); i++)
		        {
		            char c = name.charAt(i);
		            if ((i<3)&&!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
		            	errors="Invalid Subject Code";
		            	flag=true;
		            }
		            if ((i>3&&(i!=6))&&!(c >= '0' && c <= '9')){
		            	errors="Invalid Subject Code";
		            	flag=true;
		            }
		            if(i==6&&c!='s'){
		            	errors="Invalid Subject Code";
		            	flag=true;
		            }
		        }
				if(!flag)
				this.Subjectcode = name;
			}
			
		}
	  	public void setdata(ArrayList<Student> students) {
	  		this.students = students;
	  	}
	  	public void AddStudent(Student f) {
	  		this.students.add(f);
	  	}
	  	@Override
	 	public String toString() {
	  		if(flag) return errors;
	 		return "Subject Name: "+Subjectname+"\t Full Mark:"+fullmark;
	 	}
	  	public String pStudents() {
	  		String s="";
	  		for(int i=0; i< students.size() ; i++) {
	  			
	  			s+=students.get(i).toString();
	  			s+="\n";
	  		}
	  		return s;
	  	}
	  	
	  	
}
