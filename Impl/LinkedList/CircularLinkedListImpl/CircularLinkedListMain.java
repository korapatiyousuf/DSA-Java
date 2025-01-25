package Impl.LinkedList.CircularLinkedListImpl;

public class CircularLinkedListMain {
    public static void main(String[] args) {
        CircularLinkedListPractise cll = new CircularLinkedListPractise();
        cll.insertAtFirst(67);
        cll.insert(78);
        cll.insertAtFirst(56);
        cll.insertAtGivenIndex(99, 4);
        cll.printCLL();
        cll.insertAtGivenIndex(105, 9);
        cll.printCLL();

        System.out.println("Delete first element of circular linked list: " +cll.deleteAtFirst());
        cll.printCLL();

        System.out.println("Delete last node of circular linked list: " +cll.delete());
        cll.printCLL();

        System.out.println("Search element 99: " +cll.search(99));
        System.out.println("get element at index 2: " +cll.getDataAtIndex(2));

        cll.printCLL();

        System.out.println("Delete at given index 2: " +cll.deleteAtGivenIndex(2));
        cll.printCLL();

        System.out.println("Delete at given index 1: " +cll.deleteAtGivenIndex(1));
        cll.printCLL();
    }
}
