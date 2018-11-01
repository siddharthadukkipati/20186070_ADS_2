import java.util.Arrays;
public class WordNet {

    // constructor takes the name of the two input files
    public WordNet(String synsets, String hypernyms) {
        readSynsetFile(synsets, hypernyms);
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
    
    public void readSynsetFile(String filename, String hypernyms) {
        int id;
        int ver = 0;
        In in = new In("./Files" + "/" + filename);
        while (!in.isEmpty()) {
            ver++;
            String[] data = in.readString().split(",");
            // System.out.println(Arrays.toString(data));
            id = Integer.parseInt(data[0]);
            String[] synArray = data[1].split(",");
        }
        Digraph digraphObject = new Digraph(ver);
        readHypernymFile(hypernyms, digraphObject);
    }
    public void readHypernymFile(String filename, Digraph digraph) {
        In in = new In("./Files" + "/" + filename);
        while (!in.isEmpty()) {
            String[] data = in.readString().split(",");
            // System.out.println(Arrays.toString(data));
            int ver1 = Integer.parseInt(data[0]);
            for (int i = 0; i < data.length; i++) {
                int ver2 = Integer.parseInt(data[i+1]);
                digraph.addEdge(ver1,ver2);
            }
        }
        System.out.println(digraph);
    }
    // do unit testing of this class
    // public static void main(String[] args)
}
