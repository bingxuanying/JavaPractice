package AVLTree;

public class Node {
    protected int key;
    protected int height = 1;
    protected Node left = null;
    protected Node right = null;

    public Node(int key) {
        this.key = key;
    }
}
