import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// Self loops are not allowed...
		// Parallel Edges are allowed...
		// Take the Graph input here...
		Scanner scan = new Scanner(System.in);
		int vertexCount = Integer.parseInt(scan.nextLine());
		int edges = Integer.parseInt(scan.nextLine());
		EdgeWeightedGraph edgeweight = new EdgeWeightedGraph(vertexCount);
		for (int i = 0; i < edges; i++) {
			String[] tokens = scan.nextLine().split(" ");
			int vert = Integer.parseInt(tokens[0]);
			int edg = Integer.parseInt(tokens[1]);
			double weight = Double.parseDouble(tokens[2]);
			Edge edgeObj = new Edge(vert, edg, weight);
			edgeweight.addEdge(edgeObj);
		}
		String caseToGo = StdIn.readLine();
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
			break;

		case "ViaPaths":
			// Handle the case of ViaPaths, where three integers are given.
			// First is the source and second is the via is the one where path should pass throuh.
			// third is the destination.
			// If the path exists print the distance between them.
			// Other wise print "No Path Found."
			break;

		default:
			break;
		}

	}
}