package main.linkedlists;

import main.data_structures.Node;

/**
 * Created by chq-keving on 3/6/2017.
 */
public class FindNthToLastElement {
    //Implement an algorithm to find the nth to last element of a singly linked list.
    //In the non java.collections linked list. You have to iterate through a linked
    // list by using the next ref on the node of the head and keep reassigning it.

    public static Node findNth(Node head, int n) {
        if (head == null || n < 1) {
            return null;
        }
        Node p1 = head;
        Node p2 = head;
        //this loop is setting the p2 node to be n number of nodes from the start
        for (int j = 0; j < n - 1; ++j) {
            if (p2 == null) {
                return null;
            }
            p2 = p2.getNextRef();
        }
        //increment until the second node reaches the tail and then p1 is n nodes from the last node/element
        while (p2.getNextRef() != null) {
            p1 = p1.getNextRef();
            p2 = p2.getNextRef();
        }
        return p1;
    }

    public static Node findNthRecursive(Node head, int nth) {
        if (nth <= 0) return null;
        int i = 0;
        return findNthLastRecursive(head, nth, i);
    }

    private static Node findNthLastRecursive(Node p, int nth, int pos) {
        if (p == null) {
            return null;
        }
        Node n = findNthLastRecursive(p.getNextRef(), nth, pos);
        pos++;
        if (pos == nth) {
            n = p;
        }
        return n;
    }
}
