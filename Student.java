class StudentInfo{

  int rollnum;
  float marks;

   void setData(int rollnum, float marks){
    this.rollnum=rollnum;
    this.marks=marks;


  }
   void getData(){

    System.out.println("My Roll No: "+rollnum);
    System.out.println("My Marks: "+marks);
  }

}

class Student{
public static void main(String[] args) {

  StudentInfo si = new StudentInfo();
  si.setData(12,85.0f);
  si.getData();

  si.Marks=35.6f;

  System.out.println("My New Roll No from main : "+si.marks);
  si.getData();
}

}
