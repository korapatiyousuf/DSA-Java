package Impl.LinkedList.SinglyLinkedListImpl;

public class SinglyLinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedListPractise sll = new SinglyLinkedListPractise();
        sll.insert(23);

        sll.insert(27);
        sll.insert(32);
        sll.insert(72);
        sll.insertAtFirst(1);
        sll.insertAtGivenIndex(25,3);
        sll.printSLLNodes();

        sll.reverseSLL();
        sll.printSLLNodes();

        System.out.println("Delete linked list last node: " +sll.delete());
        System.out.println("Delete linked list first node: " +sll.deleteAtFirst());
        System.out.println("Delete at given index: " +sll.deleteAtGivenIndex(3));
        sll.printSLLNodes();

        int index = 2;
        System.out.println("fetch data at index " +index +" :"  +sll.getDataAtIndex(index));
        int data = 23;
        System.out.println("Search for " +data +" in linked list, is found at index: " +sll.search(data));
    }
}
