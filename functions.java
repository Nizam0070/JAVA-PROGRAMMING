//creating functions//
// import java.util.*;
// class functions{
//     //creating a function
//     public static int[] opsAll(int a,int b){
//         int sum=a+b;
//         int mul=a*b;
//         int div=a%b;
//         int sub=a-b;
//         return new int[]{sum, mul, div, sub};
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int[] result =opsAll(a,b);
        
//         System.out.println(result[0]);
//         System.out.println(result[1]);
//         System.out.println(result[2]);
//         System.out.println(result[3]);
//     }


// }
//creating functions and using condiions in it//
// class fact{
//     public static void factorialNum(int n) {     //creating a function
//         if(n<0){
//             System.out.println("invalid num");
//             return;
//         }
//         //factorial logic
//         int factorial=1;
//         for(int i=n;i>=1;i--){
//             factorial=factorial*i;
//         }
//         System.out.println(factorial);    
//     }
//     public static void main(String[] agrs){       
//         int n=-5;
//         factorialNum(n);                          //calling function
//     }
// }

                                           //HOMEWORK//

//make a function to check if a num is prime or not//
//make a function to check if a given num is even or not//          done    
//make a funcr=tion to print the table of gievn num n//             done



// import java.util.*;
// class hello{
//     public static void Table(int num) {
//         for(int i=1;i<=10;i++){
//             System.out.println(num+"x"+i+"="+(num*i));
//         }   
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         Table(num);
//     }
// }


// import java.util.Scanner;
// class hello{
//     public static void EOnum(int num) {
//         if(num%2==0){
//             System.out.println("even");
//         }
//         else{
//             System.out.println("odd");
//         }
//         }  
//         public static void main(String[] args) {
//           Scanner sc=new Scanner(System.in);
//             int num=sc.nextInt();
//             EOnum(num);
//         } 
//     }