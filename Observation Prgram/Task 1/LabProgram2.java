package observationtasks;
import java.util.Scanner;
/*public class LabProgram2 { // first program checks given number is even or odd
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the number");
        n = sc.nextInt();
        if(n %2 == 0){
            System.out.println("the number is even");
        }
         else {
            System.out.println("the number is odd");
         }
        
    }
}*/
/**
 * ConditionalState  second problem 
 
public class LabProgram2{

    public static void main(String[] args) {
                Scanner max = new Scanner(System.in);
int a,b,c;
System.out.println("enter the values of a,b,c");
a = max.nextInt();
b = max.nextInt();
c = max.nextInt();
if (a >= b &&  a >= c)
{
    System.out.println("the largest number is " +a);
}
else if(b >= a && b >= c){
    System.out.println(" the largest number is " + b);
}
else{
    System.out.println("the largest number is " + c);
}
    }
}
    */

/**
 * ConditionalState third problem is grade percentage
 
public class LabProgram2 {
public static void main(String[] args) {
    Scanner p = new Scanner(System.in);
    double percentage;
System.out.println("enter the percentage");
percentage = p.nextDouble();
if (percentage >= 90)
{System.out.println("GRADE - A");

}else if (percentage >= 80)
    System.out.println("GRADE - B");
    else if (percentage >= 70)
    System.out.println("GRADE - C");
else if (percentage >= 60)
    System.out.println("GRADE - D");
else {
    System.out.println(" FAIL");
}
}    
}*/

/**
 * ConditionalState 4th problem day of week
 */
public class LabProgram2 {
public static void main(String[] args) {
    
Scanner d = new Scanner(System.in);

int day;
System.out.println("enter the day");

day = d.nextInt();

switch (day) {
    case 1:
        System.out.println("sunday");
        break;
        case 2:
            System.out.println("monday");
            break;
         case 3:
            System.out.println("tuesday"); 
            break;
            case 4:
                System.out.println("wednesday");
                break;
                case 5:
                    System.out.println("thrusday");
                    break;
                    case 6:
                        System.out.println("friday");
                        break;
    default:
        System.out.println("invalid day");
        break; 


}
    
}
}


