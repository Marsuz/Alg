package crack.graphs;

import java.util.Scanner;

/**
 * Created by mzajda on 14/12/2016.
 */
public class MyGraphApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        MyGraph<Integer> graph = new MyGraph<>(n);
        for (int i = 0; i < m; i++) {
            int from = in.nextInt();
            int to = in.nextInt();
            int val = in.nextInt();
            graph.addEdge(val, from, to);
        }
        graph.printGraph();
    }
}
