package main.stacks_queues;

import java.util.Stack;


public class SortingStack {

    public static Stack sort(Stack<Integer> input) {
        Stack<Integer> output = new Stack<>();
        while (!input.empty()) {
            int tmp = input.pop();
            while (!output.empty() && input.peek() > tmp) {
                input.push(output.pop());
            }
            output.push(tmp);
        }
        return output;
    }
}
