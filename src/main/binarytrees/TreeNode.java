package main.binarytrees;

/**
 * Created by chq-keving on 3/28/2017.
 */
public class TreeNode {

    int key;
    String name;

    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int key, String name) {
        this.key = key;
        this.name = name;
    }


    @Override
    public String toString() {
        return "TreeNode{" +
                "key=" + key +
                ", name='" + name + '\'' +
                '}';
    }
}
