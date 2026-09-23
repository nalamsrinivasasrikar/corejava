package collectionfw;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. Creation (Using Generics to enforce Type Safety)
        ArrayList frameworkList = new ArrayList();

        // 2. Adding Elements
        frameworkList.add("Spring Boot");
        frameworkList.add("Angular");
        frameworkList.add("React");
        frameworkList.add(100);
        frameworkList.add(23.45f);
        frameworkList.add(true);           
        frameworkList.add(100);

        System.out.println(frameworkList);
//        System.out.println(frameworkList.get(0));
        frameworkList.add(3, 400);
        
        frameworkList.addFirst(200);
        System.out.println(frameworkList);
        System.out.println(frameworkList.contains(200));
        System.out.println(frameworkList.indexOf(23));
        System.out.println(frameworkList.remove(0));
        frameworkList.clear();
        System.out.println(frameworkList);
    }
}

