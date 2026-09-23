package collectionfw;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Instantiate a Queue using LinkedList
        Queue<String> line = new LinkedList<>();

        // 1. Add elements (Enqueue)
        line.offer("Alice");
        line.offer("Bob");
        line.offer("Charlie");
        System.out.println("Queue: " + line); // Output: [Alice, Bob, Charlie]

        // 2. Inspect the front element
        System.out.println("Front element (peek): " + line.peek()); // Output: Alice

        // 3. Remove elements (Dequeue)
        String removed = line.poll(); 
        System.out.println("Removed: " + removed); // Output: Alice
        System.out.println("Queue after poll: " + line); // Output: [Bob, Charlie]
        
        // 4. Iterate over remaining elements
        System.out.println("Remaining people in line:");
        for (String person : line) {
            System.out.println("- " + person);
        }
    }
}

