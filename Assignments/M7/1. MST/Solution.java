import java.util.Scanner;
/**
 * client class.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * main method.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices = Integer.parseInt(sc.nextLine());
        int edges = Integer.parseInt(sc.nextLine());
        EdgeWeightedGraph edgeWeightGraph = new EdgeWeightedGraph(vertices);
        while (sc.hasNext()) {
            String[] tokens = sc.nextLine().split(" ");
            int a = Integer.parseInt(tokens[0]);
            int b = Integer.parseInt(tokens[1]);
            double weight = Double.parseDouble(tokens[2]);
            Edge edgeObject = new Edge(a, b, weight);
            edgeWeightGraph.addEdge(edgeObject);
        }
        LazyPrimMST lazyPrimObj = new LazyPrimMST(edgeWeightGraph);
        System.out.printf("%.5f\n", lazyPrimObj.weight());
    }
}

