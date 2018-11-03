import java.util.Arrays;
class PageRank {
	
	private Digraph graphObj;

	PageRank(Digraph digraph) {
		this.graphObj = digraph;
	}
}

class WebSearch {

}


public class Solution {
	public static void main(String[] args) {
		// read the first line of the input to get the number of vertices

		int vertexCount = Integer.parseInt(StdIn.readLine());
		// iterate count of vertices times

		// to read the adjacency list from std input
		// and build the graph
		Digraph digraphObj = new Digraph(vertexCount);
		for (int i = 0; i < vertexCount; i++) {
			String[] edges = StdIn.readLine().split(" ");
			for (int k = 1; k < edges.length; k++) {
				digraphObj.addEdge(Integer.parseInt(edges[0]), Integer.parseInt(edges[k]));
			}
		}
		System.out.println(digraphObj);
		// Create page rank object and pass the digraphObj object to the constructor
		PageRank pageRankObj = new PageRank(digraphObj);

		// print the page rank object

		// This part is only for the final test case

		// File path to the web content
		String file = "WebContent.txt";

		// instantiate web search object
		// and pass the page rank object and the file path to the constructor

		// read the search queries from std in
		// remove the q= prefix and extract the search word
		// pass the word to iAmFeelingLucky method of web search
		// print the return value of iAmFeelingLucky

	}
}
