import java.util.Scanner;
class hello {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //INPUTS
      String name=sc.nextLine(); //nextLine for multiple words printing
      int a = sc.nextInt();
      int b = sc.nextInt(); 
     //OPERATONS
      int c = a+b;
      int d = a*b;
      int e = a-b;
      int f = a%b;
      //OUTPUT
    System.out.println("the sum :"+c);
    System.out.println("the mul :"+d); 
    System.out.println("the sub :"+e);
    System.out.println("the div:"+f);
    System.out.println("my name is "+name);
    }
    }
 
    

