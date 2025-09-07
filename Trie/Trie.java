package Trie;


public class Trie {

    static class Node {
        boolean eow;
        Node child[];

        public Node() {
            eow = false;
            child = new Node[26];
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node temp = root;

        for (int i = 0; i < word.length(); i++) {
            int idx =  word.charAt(i) - 'a';
            if (temp.child[idx] == null) {
                temp.child[idx] = new Node();
            }
            temp = temp.child[idx];
        }

        temp.eow = true;
    }

    public static boolean search(String word) {
        Node temp = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (temp.child[idx] == null)
                return false;

            temp = temp.child[idx];
        }

        return temp.eow;
    }
    

    
    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any", "three", "th" };
        for (String word : words) {
            insert(word);
        }

        for (String word : words) {
            System.out.println(search(word));
        }
        System.out.println();
        System.out.println(search("word"));
    }
}