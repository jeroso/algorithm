package practice.interview;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(int v) {
        stack.add(v);
    }

    public void pop() {
        if(stack.isEmpty()) {
            return;
        }
        stack.remove(stack.size() - 1);
    }

    public int peek() {
        if(stack.isEmpty()) return -1;
        return stack.get(stack.size() - 1);
    }
    public void isEmpty() {
        if(stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}

