package Assignment;
//Demonstration of inheritance and implementation cases in Java

//Case 1: C1 extends C2
class Cl2 {
void display() {
   System.out.println("Case 1: Hello from C2");
}
}
class Cl1 extends Cl2 {
void show() {
   System.out.println("Case 1: Hello from C1");
}
}

//Case 2: C1 extends C2, C3 (Invalid)
//class C1 extends C2, C3 {} // ❌ Compilation error: multiple class inheritance not allowed
class Cl3 {}

//Case 3: C1 implements I1
interface I1 {
void greet();
}
class C1ImplI1 implements I1 {
public void greet() {
   System.out.println("Case 3: Hello from I1 implementation");
}
}

//Case 4: C1 implements I1, I2
interface I2 { void message(); }
class C1ImplI1I2 implements I1, I2 {
public void greet() { System.out.println("Case 4: Greeting from I1"); }
public void message() { System.out.println("Case 4: Message from I2"); }
}

//Case 5: C1 implements C2 extends I1 (Invalid, corrected as extends + implements)
class Cl1ExtCl2ImplI1 extends Cl2 implements I1 {
public void greet() { System.out.println("Case 5: Greeting from I1 with base C2"); }
}

//Case 6: I1 extends I2
interface I2Base { void base(); }
interface I1ExtI2 extends I2Base { void greet(); }
class Cl1ImplI1ExtI2 implements I1ExtI2 {
public void base() { System.out.println("Case 6: Base from I2"); }
public void greet() { System.out.println("Case 6: Greeting from I1"); }
}

//Case 7: I1 implements C1 (Invalid)
//interface I1Bad implements C1 {} // ❌ Compilation error: interfaces cannot implement classes

//Case 8: I1 extends I2, I3
interface I3 { void extra(); }
interface I1ExtI2I3 extends I2Base, I3 {
void greet();
}
class C1ImplI1ExtI2I3 implements I1ExtI2I3 {
public void base() { System.out.println("Case 8: Base from I2"); }
public void extra() { System.out.println("Case 8: Extra from I3"); }
public void greet() { System.out.println("Case 8: Greeting from I1"); }
}

//Main driver class
public class AllOperations {
public static void main(String[] args) {
   // Case 1
   Cl1 obj1 = new Cl1();
   obj1.display();
   obj1.show();

   // Case 2
   System.out.println("Case 2: Invalid in Java (multiple class inheritance not allowed)");

   // Case 3
   C1ImplI1 obj3 = new C1ImplI1();
   obj3.greet();

   // Case 4
   C1ImplI1I2 obj4 = new C1ImplI1I2();
   obj4.greet();
   obj4.message();

   // Case 5
   Cl1ExtCl2ImplI1 obj5 = new Cl1ExtCl2ImplI1();
   obj5.display();
   obj5.greet();

   // Case 6
   Cl1ImplI1ExtI2 obj6 = new Cl1ImplI1ExtI2();
   obj6.base();
   obj6.greet();

   // Case 7
   System.out.println("Case 7: Invalid in Java (interfaces cannot implement classes)");

   // Case 8
   C1ImplI1ExtI2I3 obj8 = new C1ImplI1ExtI2I3();
   obj8.base();
   obj8.extra();
   obj8.greet();
}
}

