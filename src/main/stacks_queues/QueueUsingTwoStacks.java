package main.stacks_queues;

import java.util.Stack;

/**
 * Created by chq-keving on 3/24/2017.
 */
public class QueueUsingTwoStacks<T> {

    private final Stack<T> s2;
    private final Stack<T> s1;

    public QueueUsingTwoStacks() {
        s1 = new Stack<T>();
        s2 = new Stack<T>();
    }

    public void add(T value) {
        s1.push(value);
    }

    public T peek() {
        if (!s2.empty()) return s2.peek();
        while (!s1.empty()) s2.push(s1.pop());
        return s2.peek();
    }

    public T remove() {
        if (!s2.empty()) return s2.pop();
        while (!s1.empty()) s2.push(s1.pop());
        return s2.pop();
    }
}
