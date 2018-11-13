import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused...
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        String[] words = loadWords();
        //Your code goes here...
        TST<Integer> tstObj = new TST<Integer>();
        Scanner scan = new Scanner(System.in);
        String prefix = scan.nextLine();
        int j = 0;
        for (String word : words) {
            SuffixArray suffixArrayObj = new SuffixArray(word);
            for (int i = 0; i < word.length(); i++) {
                tstObj.put(suffixArrayObj.select(i), j++);
            }
        }
        for (String word : tstObj.keysWithPrefix(prefix)) {
            System.out.println(word);
        }
    }
    /**
     * Loads words.
     *
     * @return     { description_of_the_return_value }
     */
    public static String[] loadWords() {
        In in = new In("/Files/dictionary-algs4.txt");
        return in.readAllStrings();
    }
}

