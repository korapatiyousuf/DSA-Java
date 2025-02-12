package Impl.Stack.StackInterface;

public interface StackInterface {
    //push data into stack
    void push(int data);

    //pop data from stack
    int pop();

    //check top element in the stack
    int peek();

    //check if stack is empty
    boolean isEmpty();

    //print stack elements
    void printStack();
}
