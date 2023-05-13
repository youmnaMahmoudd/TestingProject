package project;
public class Calculator {
    String grade="";
    double GPA=0;
    public Calculator() {
        this.grade = "";
        this.GPA = 0;
    }
    public String getGrade() {
        return grade;
    }
    public double getGPA() {
        return GPA;
    }
    public void setGrade(int avg) {

        if(avg>= 97 && avg<=100)
            this.grade= "A+";
        else if(avg>= 93 && avg<97)
            this.grade= "A";
        else if(avg>=89 && avg<93)
            this.grade= "A-";
        else if(avg>=84 && avg<89)
            this.grade= "B+";
        else if(avg>=80 && avg<84)
            this.grade= "B";
        else if(avg>=76 && avg<80)
            this.grade= "B-";
        else if(avg>=73 && avg<76)
            this.grade= "C+";
        else if(avg>=70 && avg<73)
            this.grade= "C";
        else if(avg>=67 && avg<70)
            this.grade= "C-";
        else if(avg>=64 && avg<67)
            this.grade= "D+";
        else if(avg>=60 && avg<64)
            this.grade= "D";
        else
            this.grade= "F";
    }

    public void setGPA(int avg) {

        if(avg>= 97 && avg<=100)
            this.GPA= 4;
        else if(avg>= 93 && avg<97)
            this.GPA= 4;
        else if(avg>=89 && avg<93)
            this.GPA= 3.7;
        else if(avg>=84 && avg<89)
            this.GPA= 3.3;
        else if(avg>=80 && avg<84)
            this.GPA= 3;
        else if(avg>=76 && avg<80)
            this.GPA= 2.7;
        else if(avg>=73 && avg<76)
            this.GPA= 2.3;
        else if(avg>=70 && avg<73)
            this.GPA= 2;
        else if(avg>=67 && avg<70)
            this.GPA= 1.7;
        else if(avg>=64 && avg<67)
            this.GPA= 1.3;
        else if(avg>=60 && avg<64)
            this.GPA= 1;
        else
            this.GPA= 0;
    }
}
