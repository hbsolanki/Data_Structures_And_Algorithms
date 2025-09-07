package Trie;

public class PrefixProblem {
    
    static class Node {
        int freq;
        Node child[];
        boolean eow;

        public Node() {
            this.freq = 1;
            this.child = new Node[26];
            this.eow = false;
        }

    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node temp = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (temp.child[idx] == null) {
                temp.child[idx] = new Node();
            } else {
                temp.child[idx].freq++;
            }

            temp = temp.child[idx];
        }

    }

    public static String shortestUniquePrefixWord(String word) {
        StringBuilder sb = new StringBuilder("");
        Node temp = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            temp = temp.child[idx];

            if (temp.freq == 1) {
                sb.append(word.charAt(i));
                break;
            }
            sb.append(word.charAt(i));
            
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String words[] = { "zebra", "dog", "duck", "dove" };
        
        for (String word : words) {
            insert(word);
        }

        for (String word : words) {
            System.out.print(shortestUniquePrefixWord(word)+" ");
        }
    }
}
