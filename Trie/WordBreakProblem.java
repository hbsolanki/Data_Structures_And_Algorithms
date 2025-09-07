package Trie;

public class WordBreakProblem {

    public static boolean wordBreak(String key) {
        
        if (key.length() == 0) {
            return true;
        }

        for (int i = 0; i <= key.length(); i++) {

            if (Trie.search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        String words[] = { "i", "like", "samsung", "mobile", "ice" };
        String key = "ilikesamsungice";

        for (String word : words) {
            Trie.insert(word);
        }

        System.out.println(wordBreak(key));
    }
}
