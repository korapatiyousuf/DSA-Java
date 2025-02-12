package Impl.Stack.StackUsingArray;

public class StackUsingArrayMain {
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        int[] nums = {25,27,29,31,32,33};
        for(int num: nums) {
            stack.push(num);
        }
        stack.printStack();

        //pop all elements from stack
        for(int i=0;i<6;i++) {
            System.out.println("Stack pop operation: " + stack.pop());
        }
    }
}
