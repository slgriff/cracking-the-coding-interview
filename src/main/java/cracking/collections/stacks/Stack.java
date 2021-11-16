package cracking.collections.stacks;

import java.util.LinkedList;

public class Stack {
    LinkedList<Integer> stack;

    public Stack() {
        stack = new LinkedList<Integer>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(int item) {
        stack.push(item);
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }
}
