package recordprog;
import java.util.Scanner;

class primepalindrome{
   static boolean isPrime(int n){ // method to check prime number
  if(n <= 1)
    return false;
if(n<= 3)
    return true;
if(n %2 == 0 || n%3 == 0)
    return false;
for (int i = 5 ;(long) i * i<= n;i +=6){
    if(n % 2 == 0 || n %(i +2) == 0)
        return false;
}
return true;
    }

static boolean isPalindrome(int n){
    int original = n;
    int reversed = 0;
    while(n != 0){
       int digit = n%10;
       reversed  = reversed * 10+ digit;
       n /= 10;
    }
    return original == reversed;
}
}
public class Experiment2 {
    public static void main(String[] args) {
Scanner pp  = new Scanner(System.in);
System.out.println("enter the number");
 int n = pp.nextInt();
boolean prime = primepalindrome.isPrime(n);
boolean palindrome = primepalindrome.isPalindrome(n);
if(prime && palindrome){
    System.out.println( n +" is a PRIME NUMBER AND PALINDROME");
}
else if(prime){
    System.out.println(n + "IT IS PRIME BUT NOT PALINDROME");
}else if(palindrome){
    System.out.println(n + "IS NOT PRIME BUT IT IS A PALINDROME");
}else{
    System.out.println(n + "IS NEITHER PRIME NOR BE PALINDROME");
}
pp.close();        
    }
}

