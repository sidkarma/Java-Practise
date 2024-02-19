// Diameter of a Tree - Number of Nodes in the Longest path between any 2 nodes.

//  - Case 1: Diameter (Longest path) passes through Root
//  - Case 2: Diameter (Longest path) does not pass through Root
//  --__Approach 1: O(n^2)__--
//      -> Diam 1 - Largest dia in Left Subtree
//      -> Diam 2 - Largest dia in Right Subtree
//      -> Diam 3 - leftHeight + rightHeight + 1
//      -> Actual Diameter of the tree = Max(Diam 1,Diam 2,Diam 3)

import java.util.*;

public class BinaryTree5 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftH = height(root.left);
        int rightH = height(root.right);

        int myHeight = Math.max(leftH, rightH) + 1;

        return myHeight;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = height(root.left) + height(root.right) + 1;
        return Math.max(dia3, Math.max(dia1, dia2));
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(diameter(root));
    }
}
