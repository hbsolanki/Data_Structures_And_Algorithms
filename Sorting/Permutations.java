 class Permutations {

    // Recursive method to generate permutations
    public static void generatePermutations(String str, String result) {
        // Base case: if the string is empty, print the result
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Choose a character
            char ch = str.charAt(i);

            // Remaining string after removing the chosen character
            String remaining = str.substring(0, i) + str.substring(i + 1);
            
            // Recursive call with the updated result
            generatePermutations(remaining, result + ch);
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("Permutations of " + input + ":");
        generatePermutations(input, "");
    }
}
