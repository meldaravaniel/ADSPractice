package main.linkedlists;

import main.data_structures.Node;
import main.data_structures.SinglyLinkedList;

/**
 * Created by chq-keving on 3/13/2017.
 */
public class AddNumbersInLL {

    /*
    Given two numbers represented by two lists, write a function that returns sum list.
    The sum list is list representation of addition of two input numbers.
    Input:
    First List: 5->6->3  // represents number 365
    Second List: 8->4->2 //  represents number 248
    Output
    Resultant list: 3->1->6  // represents number 613
     */

    public static Node addTwoLists(Node first, Node second) {
        Node headR = null;
        Node prev = null;
        Node temp = null;
        int carry = 0, sum;

        while (first != null || second != null) {
            sum = carry + (int)(first != null ? first.getValue() : 0)
                    + (int)(second != null ? second.getValue() : 0);
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;
            temp = new Node(sum);
            if (headR == null) {
                headR = temp;
            } else {
                prev.setNextRef(temp);
            }
            prev = temp;

            if (first != null) {
                first = first.getNextRef();
            }
            if (second != null) {
                second = second.getNextRef();
            }
        }
        if (carry > 0) {
            temp.setNextRef(new Node(carry));
        }
        return headR;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.getValue() + " ");
            head = head.getNextRef();
        }
        System.out.println("");
    }
}
