package TestAndLearn;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BST {
    Node root;

    public BST() {
        root = null;
    }

    // Inorder Traversal
    public void inorderTraversal(Node node) {
        if (node == null)
            return;
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    // Preorder Traversal
    public void preorderTraversal(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    // Postorder Traversal
    public void postorderTraversal(Node node) {
        if (node == null)
            return;
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = new Node(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(9);

        System.out.println("Inorder Traversal:");
        tree.inorderTraversal(tree.root);
        System.out.println("\nPreorder Traversal:");
        tree.preorderTraversal(tree.root);
        System.out.println("\nPostorder Traversal:");
        tree.postorderTraversal(tree.root);
    }
}

