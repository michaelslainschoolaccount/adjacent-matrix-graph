import java.util.*;

public class Graph {
    private Edge[][] edges;

    public Graph(Set<Edge> edges, Set<Node> nodes) {
        int max = 0;
        for (Node node : nodes)
            max = Math.max(max, node.getId());

        int size = max + 1;
        this.edges = new Edge[size][size];

        for (Edge edge : edges) {
            int x = edge.getStart().getId();
            int y = edge.getEnd().getId();
            this.edges[x][y] = edge;
        }
    }

    public Set<Node> getAdjacent(Node node) {
        HashSet<Node> adjacentNodes = new HashSet<Node>();
        int id = node.getId();

        for (int row = 0; row < edges.length; row++) {
            for (int col = 0; col < edges[row].length; col++) {
                if (row != id && col != id)
                    continue;

                Edge edge = edges[row][col];
                if (edge == null)
                    continue;

                Node start = edge.getStart();
                Node end = edge.getEnd();
                Node adjacentNode = start.getId() == id ? end : start;
                adjacentNodes.add(adjacentNode);
            }
        }

        return adjacentNodes;
    }
}
