package Impl.Stack.StackUsingArray;

public class StackUsingArray implements StackUsingArrayInterface {

    private static final int DEFAULT_SIZE = 5;
    private int[] stackArr;
    private int top = -1;

    public StackUsingArray(int size) {
        stackArr = new int[size];
    }

    public StackUsingArray() {
        this(DEFAULT_SIZE);
    }

    @Override
    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack is full, can't push " +data);
            return;
        }
        stackArr[++top] = data;
    }

    @Override
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty, can't pop");
            return -1;
        }
        return stackArr[top--];
    }

    @Override
    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return stackArr[top];
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == stackArr.length-1);
    }

    @Override
    public void printStack() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top; i>=0;i--) {
            System.out.print(stackArr[i] +" ");
        }
        System.out.println();
    }
}
