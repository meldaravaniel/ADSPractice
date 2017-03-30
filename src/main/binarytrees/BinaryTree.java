package main.binarytrees;

/**
 * Created by chq-keving on 3/28/2017.
 */
public class BinaryTree {

    TreeNode root;

    public void addNode(int key, String name) {
        TreeNode newNode = new TreeNode(key, name);
        if (root == null) {
            root = newNode;
        } else {
            TreeNode focusNode = root;
            TreeNode parent;
            while(true){
                parent = focusNode;
                if (key < focusNode.key){
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverseTree(TreeNode focusNode) {
        if (focusNode != null) {
            System.out.println("Focus node: " + focusNode.key);
        } else {
            System.out.println("Null");
        }
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void preOrderTraverseTree(TreeNode focusNode) {
        if (focusNode != null) {
            System.out.println("Focus node: " + focusNode.key);
        } else {
            System.out.println("Null");
        }
        if (focusNode != null) {
            System.out.println(focusNode);
            preOrderTraverseTree(focusNode.leftChild);
            preOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void postOrderTraverseTree(TreeNode focusNode) {
        if (focusNode != null) {
            System.out.println("Focus node: " + focusNode.key);
        } else {
            System.out.println("Null");
        }
        if (focusNode != null) {
            postOrderTraverseTree(focusNode.leftChild);
            postOrderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

    public TreeNode findNode(int key) {
        TreeNode focusNode = root;
        while(focusNode.key != key){
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }

            if (focusNode == null) {
                return null;
            }
        }
        return focusNode;
    }

    public boolean deleteNode(int key) {
        if (root == null) return false;
        TreeNode focusNode = root;
        TreeNode parent = root;

        boolean isItALeftChild = true;

        while (focusNode.key != key) {
            parent = focusNode;
            if (key < focusNode.key) {
                isItALeftChild = true;
                focusNode = focusNode.leftChild;
            } else {
                isItALeftChild = false;
                focusNode = focusNode.rightChild;
            }

            if (focusNode == null) return false;
        }

        if (focusNode.leftChild == null && focusNode.rightChild == null) {
            if (focusNode == root) {
                root = null;
            } else if (isItALeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        } else if (focusNode.rightChild == null) {
            if (focusNode == root) {
                root = focusNode.leftChild;
            } else if (isItALeftChild) {
                parent.leftChild = focusNode.leftChild;
            } else {
                parent.rightChild = focusNode.leftChild;
            }
        } else if (focusNode.leftChild == null) {
            if (focusNode == root) {
                root = focusNode.rightChild;
            } else if (isItALeftChild) {
                parent.leftChild = focusNode.rightChild;
            } else {
                parent.rightChild = focusNode.rightChild;
            }
        } else {
            TreeNode replacement = getReplacementNode(focusNode);

            if (focusNode == root) {
                root = replacement;
            } else if (isItALeftChild) {
                parent.leftChild = replacement;
            } else {
                parent.rightChild = replacement;
            }
            replacement.leftChild = focusNode.leftChild;
        }

        return true;
    }

    private TreeNode getReplacementNode(TreeNode nodeToBeReplaced) {

        TreeNode replacementParent = nodeToBeReplaced;
        TreeNode replacement = nodeToBeReplaced;

        TreeNode focusNode = nodeToBeReplaced.rightChild;
        while(focusNode != null) {
            replacementParent = replacement;
            replacement = focusNode;
            focusNode = focusNode.leftChild;
        }

        if (replacement != nodeToBeReplaced.rightChild) {
            replacement.leftChild = replacement.rightChild;
            replacement.rightChild = nodeToBeReplaced.rightChild;
        }
        return replacement;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addNode(30, "irty");
        tree.addNode(20, "Boss");
        tree.addNode(166, "one hund 66");
        tree.addNode(25, "twenty five");
        tree.addNode(40, "thiry");
        tree.addNode(15, "fifteen");
        tree.addNode(35, "trty");
        tree.addNode(50, "ty");

//        tree.inOrderTraverseTree(tree.root);
//        System.out.println("Pre");
//        tree.preOrderTraverseTree(tree.root);
//        System.out.println("Post");
//        tree.postOrderTraverseTree(tree.root);

        System.out.println("Find node: 35");
        System.out.println(tree.findNode(35));
    }
}
