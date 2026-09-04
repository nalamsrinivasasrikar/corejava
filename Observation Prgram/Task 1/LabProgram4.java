package observationtasks;
import java.util.Scanner;
//task on methods of 1st problem
/* 
public class LabProgram4 {
 static int factorial(int n){
     int fact =1 ;
     for(int i =1;i<= n;i++){
         fact = fact *i;
     }
     return fact;
 }
 public static void main(String[] args) {
     Scanner fa = new Scanner(System.in);
     int n , result;
     System.out.println("enter the number");
     n = fa.nextInt();
      result = factorial(n);
     System.out.println("factorial = " + result);

 }
}
 */

/**
* MethodTask of 2nd problem is prime number

public class LabProgram4 {

static boolean is prime(int n){
 if(n <= 1)
 return false;
for (int i =2 ; i<= n/2 ;i++){
 if(n %i == 0)
     return false;
}
return true;
}
public static void main(String[] args) {
 
 Scanner pr = new Scanner(System.in);
int n;
System.out.println("enter the nnumber");
n = pr.nextInt();
if(isprime(n))
 System.out.println("PRIME NUMBER");
else
System.out.println("not a prime number");
}
}
*/

/**
* MethodTask of 3rd problrem

public class LabProgram4 {

static int max(int a , int b){
 if(a>b)
     return a;
 else
     return b;
}
 public static void main(String[] args) {
     Scanner mt = new Scanner(System.in);
     int a ,b , max;
     System.out.println("enter the values of a,b");
     a = mt.nextInt();
     b = mt.nextInt();
    max =  max(a,b);
    System.out.println("maximum is " + max);
 }
}
*/

/**
* MethodTask of 4th problem
*/
public class LabProgram4 {
static double area(double radius){
 return 3.14 * radius *radius;
}
public static void main(String[] args) {
 Scanner sr= new Scanner(System.in);
 double radius , result;
 System.out.println("enter the radius");
 radius =  sr.nextDouble();
 result = area(radius);
 System.out.println("area = " + result);

}
 
}


