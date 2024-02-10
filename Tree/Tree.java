class Node {
    int data;
    Node right;
    Node left;

    public Node(int data) {
        this.data = data;
    }
}

class BinaryTree {

    Node root;

    // Insertion Method
    public void insert(int data) {
        root = insertRecursively(root, data);
    }

    // Recursive Insertion Method
    public Node insertRecursively(Node root, int data) {

        if (root == null) {
            root = new Node(data);
        }

        else if (root.data > data) {
            root.left = insertRecursively(root.left, data);
        }

        else if (root.data < data) {
            root.right = insertRecursively(root.right, data);
        }

        return root;
    }

    // Delete Method
    public void delete(int data) {
        root = deleteRecursive(root, data);
    }

    // Recursive Delete Method
    public Node deleteRecursive(Node root, int data) {
        if (root == null) {
            return null;
        }

        if (data < root.data) {
            root.left = deleteRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRecursive(root.right, data);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right
            // subtree)
            root.data = findMinRecursive(root.right);

            // Delete the inorder successor
            root.right = deleteRecursive(root.right, root.data);
        }
        return root;
    }

    // InOrder Traversal
    public void inOrder() {
        inOrderRecursive(root);
    }

    // Recursive InOrder Traversal
    public void inOrderRecursive(Node root) {
        if (root != null) {
            inOrderRecursive(root.left);
            System.out.print(root.data + " ");
            inOrderRecursive(root.right);
        }
    }

    // PreOrder Traversal
    public void preOrder() {
        preOrderRecursive(root);
    }

    // Recursive PreOrder Traversal
    public void preOrderRecursive(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }

    // PostOrder Traversal
    public void postOrder() {
        postOrderRecursive(root);
    }

    // Recursive PostOrder Traversal
    public void postOrderRecursive(Node root) {
        if (root != null) {
            postOrderRecursive(root.left);
            postOrderRecursive(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Search a Value in Binary Tree
    public boolean search(int data) {
        return searchRecursive(root, data);
    }

    // Search a value in Binary Tree Recursively
    public boolean searchRecursive(Node root, int data) {
        if (root == null) {
            return false;
        }

        if (data == root.data) {
            return true;
        }

        else if (data < root.data) {
            return searchRecursive(root.left, data);
        }

        else if (data > root.data) {
            return searchRecursive(root.right, data);
        }
        return false;
    }

    // Minimum Element in a Tree
    public int findMin() {
        if (root == null) {
            System.out.println("Tree is Empty");
        }
        return findMinRecursive(root);
    }

    // Minimum Element in a Tree Recursively
    public int findMinRecursive(Node root) {
        // Base case: if the current node has no left child, it is the minimum
        if (root.left == null) {
            return root.data;
        }

        else {
            // Recursive case: keep going left
            return findMinRecursive(root.left);
        }
    }

    // Maximum Element in a Tree
    public int findMax() {
        if (root == null) {
            System.out.println("Tree is Empty");
        }
        return findMaxRecursive(root);
    }

    // Maximum Element in a Tree Recursively
    public int findMaxRecursive(Node root) {
        // Base case: if the current node has no right child, it is the maximum
        if (root.right == null) {
            return root.data;
        }

        else {
            // Recursive case: keep going right
            return findMaxRecursive(root.right);
        }
    }

    // Height of the Binary Tree
    public int height() {
        return heightRecursive(root);
    }

    // Height of the Binary Tree Recursively
    private int heightRecursive(Node root) {
        if (root == null) {
            // Base case: The height of an empty tree is -1
            // (assuming height is defined as the number of edges in the longest path from
            // root to a leaf)
            return -1;
        }

        else {
            // Recursively find the height of the left and right subtrees
            int leftHeight = heightRecursive(root.left);
            int rightHeight = heightRecursive(root.right);

            // Manually compare the heights of the left and right subtrees
            if (leftHeight > rightHeight) {
                return leftHeight + 1;
            }

            else {
                return rightHeight + 1;
            }
        }
    }

}

public class Tree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // 8 7 12 15 2 5

        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        // Display the tree nodes in InOrder traversal
        System.out.println("InOrder traversal of the binary tree:");
        tree.inOrder();
        System.out.println();

        // Display the tree nodes in PreOrder traversal
        System.out.println("PreOrder traversal of the binary tree:");
        tree.preOrder();
        System.out.println();

        // Display the tree nodes in PostOrder traversal
        System.out.println("PostOrder traversal of the binary tree:");
        tree.postOrder();
        System.out.println();

        // Deleting a node from the tree
        int deleteValue = 7;
        System.out.println("Deleting " + deleteValue + " from the tree.");
        tree.delete(deleteValue);

        // Searching for a value in the tree
        int searchValue = 11;
        System.out.println("Does the tree contain " + searchValue + "? " + tree.search(searchValue));

        // Calculating the height of the tree
        System.out.println("Height of the tree: " + tree.height());

    }
}

