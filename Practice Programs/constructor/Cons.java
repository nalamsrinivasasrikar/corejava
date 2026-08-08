package Arrays;

public class Cons {
  // constructors with parameters
 
    int rollno;
    String college  ;
        float score ;
public Cons(int i , String n, float c){

        this.rollno = i  ;
        this.college  = n;
        this.score = c;
    }


 void exams(){
System.out.println( " roll no is: " + this.rollno);
System.out.println(" college name is: "  + this.college);
System.out.println("score is :" + this.score);

}

public static void main(String[] args) {
    Cons c= new Cons(238 ," ANITS" , 98.33f );
    c.exams();

}
//  constructs with methods calling
/* 
public class ConTypes {
int a = 1251;
void race(){
    System.out.println("this is third prom of constructor");
}
    

void team(){
    System.out.println(" this is anothe routput of this program");
}
public static void main(String[] args) {
    int a= 24, b= 64;
    int c = a+b;
    System.out.println(" result is "  + c);
ConTypes toc = new ConTypes();
toc.race();
toc.team();
}
} 
*/

// normal consrtuctor for not use keyword of public
/* 
public class ConTypes {

    ConTypes() {
        System.out.println("constructor is called");

    }

    public static void main(String[] args) {
        ConTypes tea = new ConTypes();
        
    }
}


*/
}

