import java.util.Scanner;

class VariableTest{

  public static void main(String[] args) {
    int i;
    float f;
    double d;
    char ch;
    String str;
    boolean b;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter int float double char string and boolean value");
    str = sc.nextLine();
    System.out.println("Enter int float double char string and boolean value");
    ch = sc.nextLine().charAt(0);
    i = sc.nextInt();
    f = sc.nextFloat();
    d = sc.nextDouble();

    System.out.print("Enter int float double char string and boolean value");
    b = sc.nextBoolean();

    System.out.println(i +" "+" "+ f + " "+d + " "+ch + " "+str + " "+b);


  }
}
