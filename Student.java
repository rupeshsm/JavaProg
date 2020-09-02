class StudentInfo{


static int tot;
  int rollnum;
  static {
    System.out.println("This will run first");

  }
  float marks;
  char grade;
  String name;



   void setData(String name, int rollnum, float marks){

    this.rollnum=rollnum;
    this.marks=marks;
    this.name = name;


  }
  StudentInfo(){

    System.out.println("New Student Created");
    tot++;
  }

  static int checkTot(){
    return tot;
  }

  char calGrade(){
    grade = (marks>50.0f)?'P':'F';
    return grade;
  }
   void getData(){
    System.out.println("Name: "+name);
    System.out.println("Roll No: "+rollnum);
    System.out.println("Marks: "+marks);
    System.out.println("total: "+tot);
    //System.out.println("My Marks: "+grade);
  }

}

class Student{
public static void main(String[] args) {
  StudentInfo.tot = 50;
  System.out.println("Total Students: "+StudentInfo.checkTot());
  StudentInfo s1 = new StudentInfo();
  //si.setData();
  s1.getData();



  char grade = s1.calGrade();
  System.out.println("Grade after: "+grade);
  System.out.println("Total Students: "+s1.checkTot());
  int i = s1.checkTot();
  StudentInfo s2 = new StudentInfo();
  System.out.println("Total Students: "+s1.checkTot());
  //
  System.out.println("Total Students: "+s1.checkTot());
  //System.out.println("My New Roll No from main : "+si.marks);
  //si.getData();
}

}
