package exceptions;
//type not presentexception
public class TypeNotPresent {
public static void main(String[] args) {
 try {
     throw new TypeNotPresentException("missing class of not same type", new ClassNotFoundException());
 } catch (TypeNotPresentException tnpe) {
     //  handle exception
     System.out.println("the exception is "  + tnpe.getMessage());

 }
 finally{
     System.out.println("catched done");
 }
} 
}
