import java.util.Scanner;
class Numbers{

  int marks[];

  void createArray(int l){

      marks = new int[l];
  }

  void inputArray(){

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < marks.length; i++){
      System.out.println("Enter array element");
      marks[i] = sc.nextInt();
    }
  }

  void displayArray(){

    for (int i = 0; i < marks.length; i++){
      System.out.print(marks[i]+" ");
    }
  }
}

class ArrayTest{
  public static void main(String[] args) {
    Numbers n = new Numbers();
    n.createArray(5);
    n.inputArray();
    n.displayArray();
  }
}
