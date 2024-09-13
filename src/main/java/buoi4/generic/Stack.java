package buoi4.generic;

import java.util.Arrays;

public class Stack<T> {
    private int capacity;
    private int top = -1;
    private T[] items;

    // Phuong thuc khoi tao
    public Stack(int capacity) {
        this.capacity = capacity;
        this.items = (T[]) new Object[capacity];
    }

    public void push(T t) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        top = top + 1;
        items[top] = t;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T tmp = items[top];
        top = top - 1;
        return tmp;
    }

    public boolean isFull() {
        if (top == capacity - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Stack is empty!";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("Stack: \n");
        for (int i = top; i >= 0; i--) {
            builder.append(items[i] + "\n");
        }
        return builder.toString();
    }
}
