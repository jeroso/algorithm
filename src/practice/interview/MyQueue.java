package practice.interview;

import java.util.Deque;
import java.util.LinkedList;

public class MyQueue<T> {
    private Deque<T> stack1 = new LinkedList<>();
    private Deque<T> stack2 = new LinkedList<>();

    public void enqueue(T value) {
        stack1.addLast(value);
    }

    public T dequeue() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.addLast(stack1.removeLast());
            }
        }
        return stack2.removeLast();
    }

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }


}
