package observationtasks;
import java.util.Scanner;

// looping statements of 1st program
public class LabProgram3 {

    public static void main(String[] args) {
Scanner m = new Scanner(System.in);
int n;
System.out.println("enter the number");
n = m.nextInt();
System.out.println("the multipilcation table of given number");
for(int i = 1; i<= 10; i++){
    System.out.println(n + "x" + i + " = " + (n*i));
}        
   }
}

/**
 * LoopState of 2nd problem is numbers display
 

public class Labprogram3 {

    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        int n;
        System.out.println(" enter the number");
        n = N.nextInt();
        System.out.println("Numbers from 1 to n" + (n));
        for (int i =1; i <= n; i++){
            System.out.println("");
        }
    }
}
    */


/**
 * LoopState of 3rd problem sum of natural numbers
 
public class LabProgram3 {
public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
int n;
System.out.println("enter the number");
n = sn.nextInt();
int sum = 0;
for (int i = 1;i<=n;i++){
    sum = sum +i;
}
System.out.println("sum = " + sum);
}
    
}*/



/**
 * LoopState 4th problem is fibonacci series
 */
/*public class LabProgram3 {
public static void main(String[] args) {
    Scanner f = new Scanner(System.in);
    int n;
    System.out.println("enter n");
    n  = f.nextInt();
    int a = 0 ;
    int  b= 1;
    System.out.println("the fibonacci series");
for( int i= 1; i<= n;i++){
    System.out.print(a+"");

int c = a+b;
a = b;
b = c;
}
}
}*/
