//  --__Approach 2: O(n)__--

import java.util.*;

public class BinaryTree6 {
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

    static class treeInfo {
        int ht;
        int dia;

        treeInfo(int ht, int dia) {
            this.ht = ht;
            this.dia = dia;
        }
    }

    public static treeInfo diameter2(Node root) {
        if (root == null) {
            return new treeInfo(0, 0);
        }

        treeInfo left = diameter2(root.left);
        treeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int dia1 = left.dia;
        int dia2 = right.dia;
        int dia3 = left.ht + right.ht + 1;

        int myDia = Math.max(Math.max(dia1, dia2), dia3);

        treeInfo myInfo = new treeInfo(myHeight, myDia);

        return myInfo;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println(diameter2(root).dia);
    }
}
