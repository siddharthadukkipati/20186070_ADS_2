// import java.util.Scanner;
// public final class Solution {
//     private Solution() {
//         //unused constructor.
//     }
//     public static void main(final String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int vertices = Integer.parseInt(sc.nextLine());
//         int edges = Integer.parseInt(sc.nextLine());
//         Digraph digraph = new Digraph(vertices);
//         while (sc.hasNext()) {
//             String[] input = sc.nextLine().split(" ");
//             digraph.addEdge(Integer.parseInt(input[0]),
//                             Integer.parseInt(input[1]));
//         }
//         DirectedCycle directedcycle = new DirectedCycle(digraph);
//         System.out.println(directedcycle);
//     }
// }
import java.util.*;
public class Solution {
    Solution() {
        //unused..
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vertices = Integer.parseInt(scan.nextLine());
        int edges = Integer.parseInt(scan.nextLine());
        Digraph digraphObject = new Digraph(vertices);
        while(scan.hasNext()) {
            String[] data = scan.nextLine().split(" ");
            digraphObject.addEdge(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
        }
        DirectedCycle directedCycleObj;
        directedCycleObj = new DirectedCycle(digraphObject);
        System.out.println(directedCycleObj);
    }
}