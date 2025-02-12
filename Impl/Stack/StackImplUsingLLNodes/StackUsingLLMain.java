package Impl.Stack.StackImplUsingLLNodes;

public class StackUsingLLMain {
    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        stack.printStack();
        stack.pop();

        int[] elems = {49,12,42,89,8};
        for(int num: elems) {
            stack.push(num);
        }
        stack.printStack();
        System.out.println("Stack pop: " +stack.pop());
        System.out.println("Stack pop: " +stack.pop());
        stack.printStack();
        System.out.println("stack peek: " +stack.peek());
        while(!stack.isEmpty()) {
            System.out.println("Stack pop: " +stack.pop());
        }
    }
}
