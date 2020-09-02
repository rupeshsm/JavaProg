import java.util.*;
//import java.lang.*;
class ExamDetails{
  private int marks;
  //private int cgpa;
  private char grade;

  void calculateMarks(int cg, int oopm, int cn, int max){
    if(cg>=40 & oopm>=40 & cn>=40){
      marks = cg+oopm+cn;

      if(max>0 & ((float)marks/max)>=0.4f){
        grade = 'P';
      }
      else{
        grade='F';
      }

    }

    System.out.println("Total Marks Scored: "+ marks);
    System.out.println("grade: "+ grade);



  }

}


class StudentInfo{

  String name;
   private int rollnum;


  StudentInfo(){


  }
  StudentInfo(StudentInfo si){
    rollnum=si.rollnum;
    name=si.name;

  }
   void setData(int rollnum, String name){
    this.rollnum=rollnum;
    this.name=name;
    //

  }

    void getData(){

    System.out.println("Roll No: "+rollnum);
    System.out.println("Name: "+name);
    //System.out.println("My Grade: "+grade);
  }

}

class StudentIn{
public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Name");

  String name = sc.nextLine();

  System.out.println("Enter Roll No");

  int rollno = sc.nextInt();;

  StudentInfo s1 = new StudentInfo();
  s1.setData(name,rollno);
  StudentInfo copys1 = new StudentInfo(s1);
  copys1.name = "Sara";
  System.out.println("Details of Student 1");
  s1.getData();
  System.out.println("Details of Student 1 copy");
  copys1.getData();


  //ExamDetails ed = new ExamDetails();
  //ed.calculateMarks(40, 40, 40 , 0);

  //s1.marks = 35.6f;
  //System.out.println("My New Roll No: "+si.rollnum+si.marks);

}

}
