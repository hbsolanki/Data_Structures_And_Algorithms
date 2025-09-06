package Hashing;

import java.util.*;

public class HashMapImplemantation {
    
    static class HashMap<K, V> {

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // total node in buckets
        private int N; //total Buckets;
        private LinkedList<Node> buckets[];

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[this.N];

            for (int i = 0; i < this.N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int search(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            for (int di = 0; di < ll.size(); di++) {
                Node node = ll.get(di);

                if (Objects.equals(node.key, key))
                    return di;
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        public void rehash() {

            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];
            N *= 2;

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            //Nodes => add new Buckets
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }


        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = search(key, bi);

            if (di == -1) { //New Value
                Node node = new Node(key, value);
                buckets[bi].add(node);
                n++;

            } else { //alread just update value 
                buckets[bi].get(di).value = value;
            }

            //Reahash Checking
            double lambda = (double) n / N;
            if (lambda > 2.0)
                rehash();
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = search(key, bi);
            if (di == -1)
                return null;

            V value = buckets[bi].get(di).value;
            buckets[bi].remove(di);
            n--;
            return value;
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = search(key, bi);

            if (di == -1)
                return null;

            return buckets[bi].get(di).value;
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = search(key, bi);
            return di == -1 ? false : true;
        }

        public ArrayList<K> keyset() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < buckets[i].size(); j++) {
                    keys.add(buckets[i].get(j).key);
                }
            }

            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public int size() {
            return n;
        }

    }
    
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 140);
        map.put("USA", 35);
        map.put("China", 150);
        map.put("Nepal", 3);
        map.put("Bhutan", 1);

        System.out.println("After put operations:");
        System.out.println("Keys: " + map.keyset());
        System.out.println("Size: " + map.size());

        System.out.println("Get values:");
        System.out.println("India -> " + map.get("India"));
        System.out.println("USA -> " + map.get("USA"));
        System.out.println("Unknown -> " + map.get("Unknown"));

        System.out.println("Contains Key:");
        System.out.println("Contains 'China'? " + map.containsKey("China"));
        System.out.println("Contains 'Japan'? " + map.containsKey("Japan"));

        System.out.println("Remove operation:");
        System.out.println("Remove 'USA': " + map.remove("USA"));
        System.out.println("Remove 'Japan': " + map.remove("Japan"));
        System.out.println("Keys after removal: " + map.keyset());
        System.out.println("Size after removal: " + map.size());

        System.out.println("Check empty:");
        System.out.println("Is map empty? " + map.isEmpty());

        for (String key : new ArrayList<>(map.keyset())) {
            map.remove(key);
        }
        System.out.println("Is map empty after clearing? " + map.isEmpty());
    }
}
