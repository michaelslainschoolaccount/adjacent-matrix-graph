import java.util.*;

public class Graph {
    private ArrayList<Node> nodes;
    private Edge[][] edges;

    public Graph(Set<Edge> edges, Set<Node> nodes) {
        TreeSet<Node> orderedNodes = new TreeSet<Node>(nodes);
        int size = orderedNodes.last().getId() + 1;

        this.edges = new Edge[size][size];

        for (Edge edge : edges) {
            int x = edge.getStart().getId();
            int y = edge.getEnd().getId();
            this.edges[x][y] = edge;
        }

        nodes = orderedNodes;
    }

    public Set<Node> getAdjacent(Node node) {
        HashSet<Node> adjacentNodes = new HashSet<Node>();
        int id = node.getId();

        for (int row = 0; row < edges.length; row++) {
            for (int col = 0; col < edges[col].length; col++) {
                if (row != id && col != id)
                    continue;

                Edge edge = edges[row][col];
                Node start = edge.getStart();
                Node end = edge.getEnd();
                Node adjacentNode = start.getId() == id ? end : start;
                adjacentNodes.add(adjacentNode);
            }
        }

        return adjacentNodes;
    }
}
