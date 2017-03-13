package main.linkedlists;

import main.data_structures.Node;
import main.data_structures.SinglyLinkedList;

/**
 * Created by chq-keving on 3/10/2017.
 */
public class DeleteANodeInMiddle {

    public static boolean deleteNode(Node node) {
        //if node.getNextRef() == null . that means you dont have access to a previous node
        // to remove the reference to the node you are trying to delete.
        if (node == null || node.getNextRef() == null) {
            return false;
        }
        Node next = node.getNextRef();
        node.setValue(node.getNextRef().getValue());
        node.setNextRef(node.getNextRef().getNextRef());
        return true;
    }
}
