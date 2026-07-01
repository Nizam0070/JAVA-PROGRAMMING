/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//if else condition statement//
import java.util.Scanner;
class hello{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      int age=sc.nextInt();
      if(age>=18){                               
        System.out.println("adult");
      }
      else{
        System.out.println("not audult");
      }
  }
}
//odd even logic
int x=sc.nextInt();
      if(x % 2 == 0){

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//if else if condition statement//
import java.util.Scanner;
class hello{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      if(x == y){
        System.out.println("equall");
      }
      else if(x > y){
        System.out.println("x is garater");
      }
      else {
        System.out.println("y is garetr");
      }
  }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//switch condition statement//
import java.util.Scanner;
class hello{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     int button = sc.nextInt();
     switch(button){
      case 1:System.out.println("mai kalifa");
      break;
      case 2:System.out.println("sunnyleon");
      break;
      case 3:System.out.println("mai malakova");
      break;
      default : System.out.println("invalid");
     }
  }
}
