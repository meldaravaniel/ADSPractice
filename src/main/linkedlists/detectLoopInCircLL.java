package main.linkedlists;

import main.data_structures.Node;

/**
 * Created by chq-keving on 3/13/2017.
 */
public class detectLoopInCircLL {

    public static boolean checkForLoop(Node head) {
        Node slow = head, fast = head;
        while(slow != null && fast != null && fast.getNextRef() != null) {
            slow = slow.getNextRef();
            fast = fast.getNextRef().getNextRef();
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
