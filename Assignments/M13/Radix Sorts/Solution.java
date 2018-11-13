import java.util.Scanner;
/**
 * Solution class.
 */
final class Solution {
    /**
     * default constructor.
     */
    private Solution() {
    	//unused..
    }
    /**
     * main method.
     * Complexity is O(N).
     * @param args String.
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        LSD lsdObj = new LSD();
        String[] input = new String[count];
        int length;
        for (int i = 0; i < count; i++) {
            input[i] = scan.nextLine();
            length = input[i].length();
        }
        length = input[0].length();
        // lsd.sort(input, length);
        // String[] result = new String[count];
        lsdObj.sort(input, length);
        System.out.println(lsdObj);

    }
}
