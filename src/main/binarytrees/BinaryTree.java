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
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addNode(20, "Boss");
        tree.addNode(25, "twenty five");
        tree.addNode(15, "fifteen");
        tree.addNode(166, "one hund 66");
        tree.addNode(30, "thirty");

        tree.inOrderTraverseTree(tree.root);
    }
}
