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
        //https://www.youtube.com/results?search_query=how+does+a+linked+list+work+in+java
        //http://www.java2novice.com/data-structures-in-java/linked-list/singly-linked-list/
    }


    class Node<T> implements Comparable<T> {
        private T value;
        private Node<T> nextRef;

        public T getValue() { return value; }

        public void setValue(T value) { this.value = value; }

        public Node<T> getNextRef() { return nextRef; }

        public void setNextRef(Node<T> nextRef) { this.nextRef = nextRef; }

        @Override
        public int compareTo(T arg) {
            if (arg == this.value) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
