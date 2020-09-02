class Numbers {

  int a;
  int b;
  final int MAX=50;

  Numbers(int a, int b){
    this.a = a;
    this.b =b;
    MAX++;
  }

    Numbers swapNumbers(){

    Numbers n = new Numbers(b , a);
    return n;
  }

  void getData(){

    System.out.println("Num a = "+a+" and Num b = "+b+MAX);
  }
}

class SwapTest {

  public static void main(String[] args) {

    Numbers n1 = new Numbers(5,6);
    Numbers n2 = n1.swapNumbers();

    n1.getData();
    n2.getData();


  }


  }
