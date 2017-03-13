package main.data_structures;

/**
 * Created by chq-keving on 3/6/2017.
 */
public class SinglyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public void add(T element) {
        //create a node and give it the value
        Node<T> newNode = new Node<>();
        newNode.setValue(element);
        //try to find out where to put it.
        //if there is nothing in the list
        if (head == null) {
            //head and tail are the same when only one element exists.
            head = newNode;
            tail = newNode;
        } else {
            //before reassigning the tail node to the latest give it a reference to the new value.
            tail.setNextRef(newNode);
            //reassign the tail to a node that only has a value. and NO ref
            tail = newNode;
        }
    }

    public void addAfter(T element, T after) {
        Node<T> tmp = head;
        Node<T> refNode = null;
        while(true){
            if(tmp == null){
                break;
            }
            if(tmp.compareTo(after) == 0){
                //found the target node, add after this node
                refNode = tmp;
                break;
            }
            tmp = tmp.getNextRef();
        }
        if(refNode != null){
            //add element after the target node
            Node<T> nd = new Node<T>();
            nd.setValue(element);
            nd.setNextRef(tmp.getNextRef());
            if(tmp == tail){
                tail = nd;
            }
            tmp.setNextRef(nd);

        } else {
            System.out.println("Unable to find the given element...");
        }
    }

    public void deleteFront() {
        if (head == null) {
            System.out.println("Underflow.. ");
        }
        Node<T> tmp = head;
        head = tmp.getNextRef();

    }
}
