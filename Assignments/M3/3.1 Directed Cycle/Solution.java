/**
 * { item_description }.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused..
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int vertices = Integer.parseInt(scan.nextLine());
        int edges = Integer.parseInt(scan.nextLine());
        Digraph digraphObject = new Digraph(vertices);
        while (scan.hasNext()) {
            String[] data = scan.nextLine().split(" ");
            digraphObject.addEdge(Integer.parseInt(data[0]),
                Integer.parseInt(data[1]));
        }
        DirectedCycle directedCycleObj;
        directedCycleObj = new DirectedCycle(digraphObject);
        if (directedCycleObj.hasCycle()) {
            System.out.println("Cycle exists.");
        } else {
            System.out.println("Cycle doesn't exists.");
        }
    }
}
