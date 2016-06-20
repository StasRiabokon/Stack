/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;

/**
 *
 * @author yasta
 */
public class StackClass implements MyStack {

    private int size;
    private Object[] stackArr;
    private int position;
    private final int sizeOfStack = 1000;

    public StackClass() {
        size = sizeOfStack;
        stackArr = new Object[size];
        position = -1;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size > sizeOfStack) {
            System.out.println("No! " + sizeOfStack + " is max size of Stack");
        }
        this.size = size;
    }

    public boolean isEmpty() {
        return (position == -1);
    }

    public boolean isFull() {
        return (position == size - 1);
    }

    @Override
    public void push(Object element) {
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            stackArr[++position] = element;
        }
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return 0;
        } else {
            return stackArr[position--];
        }
    }

    @Override
    public void popUpAll() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = this.position; i >= 0; i--) {
                System.out.println(stackArr[i]);
            }
            position = -1;
        }

    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return "Stack is Empty";
        } else {
            return stackArr[position];
        }
    }
}
