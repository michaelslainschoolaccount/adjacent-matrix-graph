public class Node {
    private int id;

    public Node(int num) {
        id = num;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return Integer.toString(id);
    }
}