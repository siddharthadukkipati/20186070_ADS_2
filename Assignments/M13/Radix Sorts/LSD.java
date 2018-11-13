public class LSD {
    /**
     * { var_description }.
     */
    private static final int BITS_PER_BYTE = 8;

    /**
     * Constructs the object.
     */
    public LSD() { 
        //unused...
    }
    /**
     * { var_description }.
     */
    private static String[] check;

   /**
     * Rearranges the array of W-character strings in ascending order.
     * Time complexity for the sort in O(wn).
     * @param a the array to be sorted
     * @param w the number of characters per string
     */
    public static void sort(final String[] a, final int w) {
        int n = a.length;
        final int two = 256;
        check = a;
        int R = two;   // extend ASCII alphabet size
        String[] aux = new String[n];

        for (int d = w - 1; d >= 0; d--) {
            // sort by key-indexed counting on dth character

            // compute frequency counts
            int[] count = new int[R + 1];
            for (int i = 0; i < n; i++) {
                count[a[i].charAt(d) + 1]++;
            }

            // compute cumulates
            for (int r = 0; r < R; r++) {
                count[r + 1] += count[r];
            }

            // move data
            for (int i = 0; i < n; i++) {
                aux[count[a[i].charAt(d)]++] = a[i];
            }

            // copy back
            for (int i = 0; i < n; i++) {
                a[i] = aux[i];
            }
        }
        check = a;

    }
    /**
     * toString methd is used to print the array.
     * Complexity is O(N).
     * @return [description]
     */
    public String toString() {
        String result = "[";
        for (int i = 0; i < check.length - 1; i++) {
            result += check[i] + ", ";
        }
        result += check[check.length - 1] + "]";
        return result;
    }
}
