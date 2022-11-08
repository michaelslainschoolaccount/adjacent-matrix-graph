import java.util.*;

public class Test {
    private int testAmount = 0;
    private int amountPassed = 0;

    public void runTests() {
        test1();
        test2();
        test3();
        stopTests();
    }

    private void createTest(boolean criteria, String name, Set<Node> adjacentNodes) {
        System.out.println("Test " + ++testAmount + ": " + name);

        System.out.print("-- [");
        for (Node node : adjacentNodes)
            System.out.print(" " + node.getId() + ", ");
        System.out.println("]");

        System.out.print("-- ");
        if (criteria) {
            System.out.println("passed");
            amountPassed++;
            return;
        }
        System.out.println("failed");
    }

    private void stopTests() {
        System.out.println();
        System.out.println(amountPassed + " / " + testAmount + " passed");

        if (amountPassed < testAmount)
            System.out.println("You suck (:");

        System.out.println();
    }

    // tests
    private void test1() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Edge edge1 = new Edge(node1, node2);

        Set<Node> nodes = new HashSet<Node>();
        nodes.add(node1);
        nodes.add(node2);
        Set<Edge> edges = new HashSet<Edge>();
        edges.add(edge1);

        Graph graph = new Graph(edges, nodes);

        Set<Node> adjacentNodes = graph.getAdjacent(node1);
        boolean criteria = adjacentNodes.contains(node2);

        createTest(criteria, "1 adjacent node", adjacentNodes);
    }

    private void test2() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Edge edge1 = new Edge(node1, node2);
        Edge edge2 = new Edge(node1, node3);

        Set<Node> nodes = new HashSet<Node>();
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        Set<Edge> edges = new HashSet<Edge>();
        edges.add(edge1);
        edges.add(edge2);

        Graph graph = new Graph(edges, nodes);

        Set<Node> adjacentNodes = graph.getAdjacent(node1);
        boolean criteria = adjacentNodes.contains(node2) &&
                adjacentNodes.contains(node3);

        createTest(criteria, "multiple adjacent nodes", adjacentNodes);
    }

    private void test3() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Edge edge1 = new Edge(node1, node2);
        Edge edge2 = new Edge(node1, node3);
        Edge edge3 = new Edge(node1, node4);

        Set<Node> nodes = new HashSet<Node>();
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);
        Set<Edge> edges = new HashSet<Edge>();
        edges.add(edge1);
        edges.add(edge2);
        edges.add(edge3);

        Graph graph = new Graph(edges, nodes);

        Set<Node> adjacentNodes = graph.getAdjacent(node1);
        boolean criteria = adjacentNodes.contains(node2) &&
                adjacentNodes.contains(node3) && adjacentNodes.contains(node4);

        createTest(criteria, "even more adjacent nodes", adjacentNodes);
    }
}
