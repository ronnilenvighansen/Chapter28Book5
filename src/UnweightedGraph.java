/**
 * Created by Ronni on 29-11-2016.
 */
import java.util.*;

public class UnweightedGraph<V> extends AbstractGraph<V> {
    public UnweightedGraph() {
    }

    public UnweightedGraph(V[] vertices, int[][] edges) {
        super(vertices, edges);
    }

    public UnweightedGraph(List<V> vertices, List<Edge> edges) {
        super(vertices, edges);
    }

    public UnweightedGraph(List<Edge> edges, int numberOfVertices) {
        super(edges, numberOfVertices);
    }

    public UnweightedGraph(int[][] edges, int numberOfVertices) {
        super(edges, numberOfVertices);
    }
}