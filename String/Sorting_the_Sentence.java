import java.util.Arrays;

class Sorting_the_Sentence {
    
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
    
    public static  String sortSentence(String s) {
        String arr[]=s.split(" ");
        Arrays.sort(arr, (s1, s2) -> {
            char lastChar1 = s1.charAt(s1.length() - 1);
            char lastChar2 = s2.charAt(s2.length() - 1);
            return Character.compare(lastChar1, lastChar2);
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(0, arr[i].length() - 1);
        }

        return String.join(" ", arr);
        
    }
}