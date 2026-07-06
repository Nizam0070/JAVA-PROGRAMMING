// Nested loop //
import java.util.*;
class nestedloop{
public static void main(String[] args){
    int n=4; // rows //
    int m=5;  // columns //
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            System.out.print("*");
        }
         System.out.println();
    }
}
}
// output //
*****
*****
*****
*****



// Nested loop //
class nestedloop{
public static void main(String[] args){
    int n=4;
    int m=5;
    // outer loop //
    for(int i=1;i<=n;i++){
        // inner loop //
        for(int j=1;j<=m;j++){
             //cell -> (i,j) //
             if(i==1 || j==1 || i==n || j==m){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
    System.out.println();
}
}
}
// output //
*****
*   *
*   *
*****


// Nested loop //
class nestedloop{
public static void main(String[] args){
    int n=4;
    // outer loop //
    for(int i=1;i<=n;i++){
        // inner loop //
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

}
}
//output//
*
**
***
****



// Nested loop //
class nestedloop{
public static void main(String[] args){
    int n=4;
    // outer loop //
    for(int i=4;i>=1;i--){
        // inner loop //
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

}
}
// output //
****
***
**
*


// Nested loop //
class nestedloop{
public static void main(String[] args){
    int n=8;
    // outer loop //
    for(int i=1;i<=n;i++){
        // inner loop //
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
}

// output //
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8



// Nested loop //
class nestedloop{
public static void main(String[] args){
    int n=8;
    // outer loop //
    for(int i=8;i>=1;i--){
        // inner loop //
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
}

// output //
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1


// Nested loop //
class nestedloop{
public static void main(String[] args){
    int n=5;
    int number=1;
    // outer loop //
    for(int i=1;i<=n;i++){
        // inner loop //
        for(int j=1;j<=i;j++){
            System.out.print(number+" ");
            number++;
        }
        System.out.println();
    }
}
}

// output //
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15


// Nested loop //
class nestedloop{
public static void main(String[] args){
    int n=5;
    int number=1;
    // outer loop //
    for(int i=1;i<=n;i++){
        // inner loop //
        for(int j=1;j<=i;j++){
            int sum=i+j;
            if(sum%2==0){ // even //
                System.out.print("1 ");
            }
            else{
                System.out.print("0 ");
            }
        }
        System.out.println();
    }
}
}

// output //
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1 {
    
}
