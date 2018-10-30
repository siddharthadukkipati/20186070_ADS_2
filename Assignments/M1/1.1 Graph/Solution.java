import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        // empty constructor.
    }
    /**
     * main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int v = Integer.parseInt(scan.nextLine());
        int e = Integer.parseInt(scan.nextLine());
        int temp = e;
        String[] data = scan.nextLine().split(",");
        if (s.equals("List")) {
            GraphList graphList = new GraphList(v);
            while (temp > 0) {
                String[] list1 = scan.nextLine().split(" ");
                graphList.addEdge(Integer.parseInt(list1[0]),
                             Integer.parseInt(list1[1]));
                temp--;
            }
            System.out.println(graphList.display(data));
        } else if (s.equals("Matrix")) {
            temp = e;
            GraphMatrix graphMatrix = new GraphMatrix(v);
            while (temp > 0) {
                String[] matrix1 = scan.nextLine().split(" ");
                graphMatrix.addEdge(Integer.parseInt(matrix1[0]),
                            Integer.parseInt(matrix1[1]));
                temp--;
            }
            System.out.println(graphMatrix);
        }
    }
}
