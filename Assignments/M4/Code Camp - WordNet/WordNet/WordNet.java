import java.util.Arrays;
import java.util.ArrayList;
public class WordNet {

    private Digraph digraph;
    private LinearProbingHashST<Integer, String> id;
    private LinearProbingHashST<String, ArrayList<Integer>> noun;
    private int ver;
        // constructor takes the name of the two input files
    public WordNet(String synsets, String hypernyms) {
        readSynsetFile(synsets);
        id = new LinearProbingHashST<Integer, String>();
        noun = new LinearProbingHashST<String, ArrayList<Integer>>();
        readHypernymFile(hypernyms, digraph);
        // return;
    }

    // // returns all WordNet nouns
    // public Iterable<String> nouns() {
    //     return;
    // }

    // // is the word a WordNet noun?
    // public boolean isNoun(String word) {
    //     return;
    // }

    // // distance between nounA and nounB (defined below)
    // public int distance(String nounA, String nounB) {
    //     return;
    // }

    // // a synset (second field of synsets.txt) that is the common ancestor of nounA and nounB
    // // in a shortest ancestral path (defined below)
    // public String sap(String nounA, String nounB) {
    //     return;
    // }
    
    
    public void readSynsetFile(String filename) {
        int id;
        // int ver = 0;
        In in = new In("./Files" + "/" + filename);
        while (!in.isEmpty()) {
            ver++;
            String[] synsetArray = in.readString().split(",");
            // System.out.println(Arrays.toString(synsetArray));
            id = Integer.parseInt(synsetArray[0]); 
            String[] nounArray = synsetArray[1].split(" ");
            digraph = new Digraph(ver);

        }
    }
    public void readHypernymFile(String filename, Digraph digraph) {
        In in = new In("./Files" + "/" + filename);
        while (!in.isEmpty()) {
            String[] synsetArray = in.readString().split(",");
            for (int i = 1; i < synsetArray.length; i++) {
                digraph.addEdge(Integer.parseInt(synsetArray[0]), Integer.parseInt(synsetArray[i]));
            }
        }
        // System.out.println(digraph);
        // DirectedCycle dcObject = new DirectedCycle(digraph);
        // if (dcObject.hasCycle()) {
        //     System.out.println("Cycle detected");
        // } else {
        //     System.out.println(digraph);
        // }
    }
    // do unit testing of this class
    // public static void main(String[] args)
    void display() {
        DirectedCycle dcObject = new DirectedCycle(digraph);
        if(dcObject.hasCycle()) {
            throw new IllegalArgumentException("Cycle detected");
        } else {
            int degree = 0;
            for (int i = 0; i < digraph.V(); i++) {
                if (digraph.outdegree(i) == 0) {
                    degree++;
                }
                if (degree > 1) {
                    throw new IllegalArgumentException("Multiple roots");
                }
            }
            System.out.println(digraph);
        }
    }
}
