public class BST1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // left subtree ke andar insert
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int key) { // O(Height)
        if (root == null) {
            return false;
        }
        if (root.data > key) { // Left subtree
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        int vals[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < vals.length; i++) {
            root = insert(root, vals[i]);
        }

        inOrder(root);
        System.out.println();

        if (search(root, 7)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
