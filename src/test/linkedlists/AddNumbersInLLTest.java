package test.linkedlists;

import main.data_structures.Node;
import main.linkedlists.AddNumbersInLL;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chq-keving on 3/13/2017.
 */
public class AddNumbersInLLTest {
    @Test
    public void addTwoListsTest() throws Exception {
        Node head1 = new Node();
        Node head2 = new Node();
        head1 = new Node(7);
        head1.setNextRef(new Node(5));
        head1.getNextRef().setNextRef(new Node(9));
        head1.getNextRef().getNextRef().setNextRef(new Node(4));
        head1.getNextRef().getNextRef().getNextRef().setNextRef(new Node(6));
        System.out.print("First List is ");
        AddNumbersInLL.printList(head1);

        // creating seconnd list
        head2 = new Node(8);
        head2.setNextRef(new Node(4));
        System.out.print("Second List is ");
        AddNumbersInLL.printList(head2);

        // add the two lists and see the result
        Node rs = AddNumbersInLL.addTwoLists(head1, head2);
        System.out.print("Resultant List is ");
        AddNumbersInLL.printList(rs);
    }

}