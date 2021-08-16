public class BinaryTree {

    public Node root;

    public Node insertNode(Node current, int key) {
        if (current == null) {
            return new Node(key);
        } else if (key < current.getKey()) {
            current.setLeftNode(insertNode(current.getLeftNode(), key));
        } else if (key > ) {
            current.setRightNode(insertNode(current.getRightNode(), key));
        }

    }

    public void add(int key) {
        root = insertNode(root, key);
    }

}
