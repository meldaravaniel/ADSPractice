package main.stacks_queues;

/**
 * Created by chq-keving on 3/13/2017.
 */
public class SingleArrayThreeStacks {
    private int stackSize = 300;
    int[] buffer = new int[stackSize * 3];
    int[] stackPointer = {0,0,0}; // stack pointers to track top elem
                        //no elements in each stack
                        //stackNum has to be 0, 1, or 2

    public void push (int stackNum, int value) {
        //Find the index of the top element in the array + 1, and
        //increment the stack pointer
        int index = stackNum * stackSize + stackPointer[stackNum] + 1;
        stackPointer[stackNum]++;
        buffer[index] = value;
    }

    public int pop(int stackNum) {
                    //   2 * 300 + 0 when empty,
        int index = stackNum * stackSize + stackPointer[stackNum];
        stackPointer[stackNum]--;
        int value = buffer[index];
        buffer[index] = 0;
        return value;
    }

    public int peek(int stackNum) {
        int index = stackNum * stackSize + stackPointer[stackNum];
        return buffer[index];
    }

    public boolean isEmpty(int stackNum) {
        return stackPointer[stackNum] == stackNum*stackSize;
    }

}
