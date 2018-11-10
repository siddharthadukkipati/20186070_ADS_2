/**
 *importing scanner class.
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
        // unused constructor
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // Self loops are not allowed...
        // Parallel Edges are allowed...
        // Take the Graph input here...
        Scanner scan = new Scanner(System.in);
        final int vertexCount = Integer.parseInt(scan.nextLine());
        final int edges = Integer.parseInt(scan.nextLine());
        EdgeWeightedGraph edgeweight = new EdgeWeightedGraph(vertexCount);
        for (int i = 0; i < edges; i++) {
            final String[] tokens = scan.nextLine().split(" ");
            final int vert = Integer.parseInt(tokens[0]);
            final int edg = Integer.parseInt(tokens[1]);
            double weight = Double.parseDouble(tokens[2]);
            Edge edgeObj = new Edge(vert, edg, weight);
            edgeweight.addEdge(edgeObj);
        }
        String caseToGo = scan.nextLine();
        switch (caseToGo) {
        case "Graph":
            //Print the Graph Object.

            System.out.println(edgeweight);
            break;

        case "DirectedPaths":
            // Handle the case of DirectedPaths, where two integers are given.
            // First is the source and second is the destination.
            // If the path exists print the distance between them.
            // Other wise print "No Path Found."
            final String[] tokens = scan.nextLine().split(" ");
            final int source1 = Integer.parseInt(tokens[0]);
            final int destination1 = Integer.parseInt(tokens[1]);
            DijkstraUndirectedSP dijkstraObj =
            new DijkstraUndirectedSP(edgeweight, source1);
            double distBetween = dijkstraObj.distTo(destination1);
            if (dijkstraObj.hasPathTo(destination1)) {
                System.out.println(distBetween);
            } else {
                System.out.println("No Path Found.");
            }
            // System.out.println(distBetween);
            break;

        case "ViaPaths":
            // Handle the case of ViaPaths, where three integers are given.
            // First is the source and second is the via
            // is the one where path should pass throuh.
            // third is the destination.
            // If the path exists print the distance between them.
            // Other wise print "No Path Found."
            final String[] token = scan.nextLine().split(" ");
            final int source2 = Integer.parseInt(token[0]);
            final int via = Integer.parseInt(token[1]);
            final int destination2 = Integer.parseInt(token[2]);
            DijkstraUndirectedSP dijkstraSource = new DijkstraUndirectedSP(edgeweight, source2);
            DijkstraUndirectedSP dijkstraVia = new DijkstraUndirectedSP(edgeweight, via);
            String track = " ";
            if (dijkstraSource.hasPathTo(via) && dijkstraVia.hasPathTo(destination2)) {
                for (Edge eachPath : dijkstraSource.pathTo(via)) {
                    track += eachPath + " ";
                }
                for (Edge eachPath2 : dijkstraVia.pathTo(destination2)) {
                    track += eachPath2 + " ";
                }
                track = track + token[2];
                double distance = dijkstraSource.distTo(via) + dijkstraVia.distTo(destination2);
                System.out.println(track);
                System.out.println(distance);
            } else {
                System.out.println("No Path Found.");
            }
            // if (dijkstraSource.hasPathTo(destination2)) {
            //     // System.out.println(dijkstraS.distTo(destination2));
            // } else {
            //     System.out.println("No Path Found.");
            // }
            break;

        default:
            break;
        }

    }
}
