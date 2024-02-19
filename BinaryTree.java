// Diameter of a Tree - Number of Nodes in the Longest path between any 2 nodes.

//  - Case 1: Diameter (Longest path) passes through Root
//  - Case 2: Diameter (Longest path) does not pass through Root
//  Approach 1: O(n^2)
//      -> Diam 1 - Largest dia in Left Subtree
//      -> Diam 2 - Largest dia in Right Subtree
//      -> Diam 3 - leftHeight + rightHeight + 1
//      -> Actual Diameter of the tree = Max(Diam 1,Diam 2,Diam 3)

public class BinaryTree {

}
