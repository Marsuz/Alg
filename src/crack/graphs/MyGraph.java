package crack.graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mzajda on 14/12/2016.
 */
public class MyGraph<V extends Comparable> {

    private List<Vertex> vertices;

    public MyGraph(int size) {
        initGraph(size);
    }

    public void addEdge(V val, int fromId, int toId) {
        vertices.get(fromId).addEdge(val, toId);
    }

    public void printGraph() {
        vertices.forEach(el -> System.out.println(el));
    }

    private void initGraph(int size) {
        vertices = new ArrayList<>(size);
        for (int i = 0; i < size; i++) vertices.add(new Vertex(i));
    }

    private class Vertex {
        int id;
        List<Edge> edges;

        Vertex(int id) {
            this.id = id;
            edges = new ArrayList<>();
        }

        void addEdge(V val, int id) {
            edges.add(new Edge(this, vertices.get(id), val));
        }

        public String toString() {
            StringBuilder builder = new StringBuilder().append(this.id + ": ");
            edges.forEach(edge -> {
                builder.append("(");
                builder.append(edge.to.id);
                builder.append(", ");
                builder.append(edge.val);
                builder.append(")");
            });
            return builder.toString();
        }
    }

    private class Edge {
        Vertex from;
        Vertex to;
        V val;

        Edge(Vertex from, Vertex to, V val) {
            this.from = from;
            this.to = to;
            this.val = val;
        }
    }
}
