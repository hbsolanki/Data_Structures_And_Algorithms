🗂️ Custom HashMap Implementation in Java
This project provides a from-scratch implementation of a HashMap in Java to demonstrate its internal workings. It uses the chaining method (with a LinkedList) for collision handling and offers a clear comparison to Java's built-in HashMap from the Collections Framework.
🏗️ How a HashMap Works Internally
A HashMap is fundamentally built on three core concepts: hashing, collision handling, and rehashing.

1. Hashing
   Every key is converted into an integer using its hashCode() method. This hash code is then used to compute an index in an underlying array (often called buckets). This determines where the key-value pair should be stored.
   The bucket index is calculated as follows:
   index = Math.abs(key.hashCode()) % N

Here, N represents the total number of buckets. 2. Collision Handling
When two different keys produce the same bucket index, a collision occurs. This implementation resolves collisions using chaining. All key-value pairs that map to the same bucket are stored in a LinkedList at that index. When retrieving a value, the list must be traversed to find the correct key. 3. Rehashing
As more elements are added, the LinkedLists can grow longer, slowing down performance. To prevent this, the map is resized when its load factor (lambda)—the ratio of entries to buckets (lambda=n/N)—exceeds a certain threshold.
Threshold: In this custom implementation, rehashing is triggered when lambda2.0.
Process: A new array with double the number of buckets is created, and all existing key-value pairs are re-inserted according to their new hash indices.
🚀 Features of This Custom HashMap
Generic Implementation: Works with any key (K) and value (V) types.
Dynamic Sizing: Automatically doubles its capacity via rehashing to maintain performance.
Collision Resolution: Implements LinkedList chaining to handle hash collisions.
Core Functionality: Provides essential Map interface methods.
Implemented Methods
put(K key, V value): Inserts or updates a key-value pair.
get(K key): Retrieves the value for a given key.
remove(K key): Deletes an entry and returns its value.
containsKey(K key): Checks if a key exists in the map.
keyset(): Returns an ArrayList of all keys.
size(): Returns the total number of entries.
isEmpty(): Checks if the map is empty.
📌 Example Usage
public class Main {
public static void main(String[] args) {
// Note: Using the custom HashMap class, not java.util.HashMap
CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("India", 140);
        map.put("USA", 35);
        map.put("China", 150);

        System.out.println("Value for 'India': " + map.get("India"));       // Output: 140
        System.out.println("Contains key 'USA': " + map.containsKey("USA")); // Output: true

        map.remove("USA");
        System.out.println("All keys after removal: " + map.keyset());       // Output: [China, India]
        System.out.println("Current size: " + map.size());                 // Output: 2
    }

}

🆚 Custom HashMap vs. java.util.HashMap
This table highlights the key differences between this custom implementation and the highly optimized version provided by the Java Collections Framework (JCF).
Feature
Custom Implementation
Java's HashMap (JCF)
Collision Handling
LinkedList chaining only.
LinkedList for small buckets, balanced tree for large ones (since Java 8).
Rehash Threshold
Load Factor (lambda) > 2.0
Load Factor (lambda) > 0.75 (default)
Performance
O(n) in the worst case.
O(1) on average, O(log n) in the worst case.
Null Support
Not supported.
Allows one null key and multiple null values.
Thread Safety
Not synchronized.
Not synchronized (use ConcurrentHashMap for thread safety).

📖 Learning Outcomes
Building this project from the ground up helps solidify understanding of:
The fundamental principles of hashing.
Implementing chaining with LinkedList to resolve collisions.
The importance and mechanics of rehashing for maintaining performance.
The architectural differences between a basic map and Java’s production-ready HashMap.
