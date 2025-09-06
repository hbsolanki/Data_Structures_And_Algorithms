
import java.util.LinkedList;
import java.util.Queue;

class FirstNonRepeatingLetter {

    public static void firstCharacterNonReating(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            freq[curr - 'a']++;
            q.add(curr);
            while (!q.isEmpty() && freq[q.peek()-'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print(-1+" ");
            } else {
                System.out.print(q.peek()+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        firstCharacterNonReating("aabccxb");
    }
    
}