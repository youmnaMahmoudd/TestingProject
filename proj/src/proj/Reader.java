package project;

import java.util.Scanner;
import java.io.*;


public class Reader extends Subject {
	   public static void main(String[] args)
	   {
		   
	      String str;
	      int wordsLen, i;
	      
	      Subject subj=new Subject();
	   

          try {
		         BufferedReader br = null;
		         FileReader fr = null;
		         fr = new FileReader("test1.txt");
		         br = new BufferedReader(fr);
		         String sCurrentLine = "";
		         int line=1;
		         while ((sCurrentLine = br.readLine()) != null) {
		        	  str = sCurrentLine;
		    	      String words[] = str.split(",");
		    	      wordsLen = words.length;
		    	      if(line==1) {
		    	    	 subj.setSubjectName(words[0]); 
		    	    	 subj.setcode(words[1]);
		    	    	 subj.setFullmark(words[2]);
		    	    	 line++;
		    	    //	 System.out.println(subj.toString());
		    	    	// System.out.println();
		    	    	
		    	    	 
		    	      }else {
		    	    	  Student temp = new Student();
		    	    	  temp.setName(words[0]);
		    	    	  temp.setnumber(words[1]);
		    	    	  temp.setStudentActivitiesmark(Integer.parseInt(words[2]));
		    	    	  temp.setOralmark(Integer.parseInt(words[3]));
		    	    	  temp.setMidtermmark(Integer.parseInt(words[4]));
		    	    	  temp.setFinalmark(Integer.parseInt(words[5]));
		    	    	  subj.AddStudent(temp);
		    	    	 // System.out.println(temp.toString());
		    	      }
		    	   
		          }
		       } 
          catch (Exception e) {
		          e.printStackTrace();
		       }
          PrintWriter writer;
          try {
       writer = new PrintWriter("test2.txt", "UTF-8");
             writer.println(subj.toString());
             writer.println(subj.pStudents());
             writer.close();
             System.out.println("finished");
           } catch (Exception e) {
             e.printStackTrace();
           }
			    
	   }
	
}