package Impl.Stack.StackImplUsingLLNodes;

import Impl.Stack.StackInterface.StackInterface;

public class StackUsingLL implements StackInterface {

    StackNode top = null;

    @Override
    public void push(int data) {
        StackNode node = new StackNode(data);
        node.next = top;
        top = node;
    }

    @Override
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty, can't pop");
            return -1;
        }
        int topData = top.data;
        top = top.next;
        return topData;
    }

    @Override
    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void printStack() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        StackNode temp = top;
        while(temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public class StackNode {
        int data;
        StackNode next;
        StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
