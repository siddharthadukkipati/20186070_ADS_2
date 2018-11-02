import java.util.Scanner;
/**
 * class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        // default constructor is not used.
    }

    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int vertices = Integer.parseInt(scan.nextLine());
        int edges = Integer.parseInt(scan.nextLine());
        Graph graphObj = new Graph(vertices);
        while (edges > 0) {
            String[] tokens = scan.nextLine().split(" ");
            int v = Integer.parseInt(tokens[0]);
            int w = Integer.parseInt(tokens[1]);
            graphObj.addEdge(v, w);
            edges--;
        }
        Bipartite bipartiteObj = new Bipartite(graphObj);
        if (bipartiteObj.isBipartite()) {
            System.out.println("Graph is bipartite");
        } else {
            System.out.println("Graph is not a bipartite");
        }
    }
}


