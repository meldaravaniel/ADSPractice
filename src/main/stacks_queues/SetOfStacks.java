package main.stacks_queues;


import java.util.ArrayList;
import java.util.Stack;

public class SetOfStacks {

    private final int capacity;

    public SetOfStacks(int capacity) {
        this.capacity = capacity;
    }

    ArrayList<Stack> stacks = new ArrayList<>();

    void push(Object thing) {
        Stack last = getLastStack();
//        if (last != null && !last.isAtCapacity()) {
//            last.push(thing);
//        } else {
//            Stack stack = new Stack(capacity);
//            stack.push(thing);
//            stacks.add(stack);
//        }
    }

    Object pop() {
        Stack last = getLastStack();
        Object v = last.pop();
        if (last.empty()) stacks.remove(stacks.size() - 1);
        return v;
    }

    public Stack getLastStack() {
        if (stacks.size() == 0) return null;
        return stacks.get(stacks.size()-1);
    }

    int popAt(int index) {
        return leftShift(index, true);
    }

    private int leftShift(int index, boolean removeTop) {
        Stack stack = stacks.get(index);
        int removedItem;
        if (removeTop) removedItem = (Integer) stack.pop();
//        else removedItem = stack.removeBottom();
        return 1;
    }

}
