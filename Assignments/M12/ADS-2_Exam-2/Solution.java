// import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// Self loops are not allowed...
		// Parallel Edges are allowed...
		// Take the Graph input here...
		// Scanner scan = new Scanner(System.in);
		int vertexCount = Integer.parseInt(StdIn.readLine());
		Digraph digraphObj = new Digraph(vertexCount); 
		for (int i = 0; i < vertexCount; i++) {
			String[] edges = StdIn.readLine().split(" ");
			for (int k = 1; k < edges.length ; k++) {
				digraphObj.addEdge(Integer.parseInt(edges[0]), Integer.parseInt(edges[k]));
			}
		}
		String caseToGo = null;
		switch (caseToGo) {
		case "Graph":
			//Print the Graph Object.
			System.out.println(digraphObj);

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