class Shapes{
  int sides;
  String type;

  Shapes(){
    sides=0;
    type = "No Shape";
  }

  Shapes(Shapes s){
    sides=s.sides;
    type = s.type;
  }
  Shapes(String type, int sides){
    this.sides = sides;
    this.type= type;
  }

  void display(){

    System.out.println(type +" with "+sides + " sides");
  }

  boolean equals(Shapes s) {
if(s.type == type && s.sides ==sides) return true;
         else return false;
       }

}





class CopyObjTest{

  public static void main(String[] args) {

    Shapes s1 = new Shapes();
    Shapes s2 = new Shapes("Square",4);
    Shapes s3 = new Shapes(s2);
    Shapes s4 = new Shapes("Square",4);
    Shapes s5 = s2;
    s5.type="Ractangle";

    s1.display();
    s2.display();
    //s3.type="Ractangle";
    s3.display();
    s4.display();
    s5.display();
    System.out.println("s2==s3 "+s3.equals(s2));
    System.out.println("s2==s4 "+s4.equals(s2));
  //  System.out.println("s2==s3 "+s3.equals(s2));
    System.out.println("s2==s5 "+s5.equals(s2));


  }
}
