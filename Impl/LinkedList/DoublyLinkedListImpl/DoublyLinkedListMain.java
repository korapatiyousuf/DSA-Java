package Impl.LinkedList.DoublyLinkedListImpl;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedListPractise dll = new DoublyLinkedListPractise();
        dll.insert(12);
        dll.insertAtFirst(2);
        dll.insert(14);
        dll.insertAtFirst(-54);
        dll.insertAtGivenIndex(24, 4);

        dll.printDLL();

        dll.reverseDLL();
        dll.printDLL();

        System.out.println("Delete element at given index 4: " +dll.deleteAtGivenIndex(4));
        System.out.println("Delete head of linked list" +dll.deleteAtFirst());
        System.out.println("Delete element at given index 1: " +dll.deleteAtGivenIndex(1));
        System.out.println("Delete tail of linked list: " +dll.delete());
        dll.printDLL();
    }
}
