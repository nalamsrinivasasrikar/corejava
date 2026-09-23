package collectionfw;

import java.util.LinkedList;

public class LinkedListExample{
    public static void main(String[] args) {
        
        // ==========================================
        // 1. STANDARD LIST OPERATIONS
        // ==========================================
        System.out.println("--- STANDARD LIST OPERATIONS ---");
        LinkedList<String> list = new LinkedList<>();

        // add(E e) - Appends to the end
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial List: " + list); // [Apple, Banana, Cherry]

        // get(int index) - Retrieves element at index
        String itemAtIndex1 = list.get(1);
        System.out.println("Element at index 1: " + itemAtIndex1); // Banana

        // remove(int index) - Removes by index
        list.remove(1);
        System.out.println("After removing index 1: " + list); // [Apple, Cherry]

        // remove(Object o) - Removes first occurrence of element
        list.remove("Apple");
        System.out.println("After removing 'Apple': " + list); // [Cherry]

        System.out.println();


        // ==========================================
        // 2. QUEUE OPERATIONS (FIFO: First-In, First-Out)
        // ==========================================
        System.out.println("--- QUEUE OPERATIONS ---");
        LinkedList<String> queue = new LinkedList<>();

        // offer(E e) - Adds to the tail (end) of queue
        queue.offer("Customer 1");
        queue.offer("Customer 2");
        queue.offer("Customer 3");
        System.out.println("Queue: " + queue); // [Customer 1, Customer 2, Customer 3]

        // peek() - Looks at head without removing (returns null if empty)
        System.out.println("Next in line (peek): " + queue.peek()); // Customer 1

        // poll() - Retrieves and removes head (returns null if empty)
        System.out.println("Served (poll): " + queue.poll()); // Customer 1
        System.out.println("Queue after poll: " + queue); // [Customer 2, Customer 3]

        System.out.println();


        // ==========================================
        // 3. DEQUE OPERATIONS (Double-Ended Queue / Stack)
        // ==========================================
        System.out.println("--- DEQUE OPERATIONS ---");
        LinkedList<String> deque = new LinkedList<>();

        // addFirst(E e) / addLast(E e) - Add directly to either end
        deque.addFirst("Middle");
        deque.addFirst("Front");  // Pushed to beginning
        deque.addLast("Back");    // Appended to end
        System.out.println("Deque: " + deque); // [Front, Middle, Back]

        // getFirst() / getLast() - Inspect ends (throws exception if empty)
        System.out.println("First element: " + deque.getFirst()); // Front
        System.out.println("Last element: " + deque.getLast());   // Back

        // removeFirst() / removeLast() - Remove from either end
        String removedFront = deque.removeFirst();
        String removedBack = deque.removeLast();
        
        System.out.println("Removed First: " + removedFront); // Front
        System.out.println("Removed Last: " + removedBack);   // Back
        System.out.println("Deque remaining: " + deque);     // [Middle]
    }
}