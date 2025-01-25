package Impl.LinkedList.DoublyLinkedListImpl;

public class DoublyLinkedListPractise implements DoublyLinkedListInterface{
    DLLNode head = null, tail = null;

    @Override
    public void insertAtFirst(int data) {
        DLLNode newNode = new DLLNode(data);
        //if list is empty
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {  //list contains atleast a node
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    @Override
    public void insert(int data) {
        DLLNode newNode = new DLLNode(data);
        //if linked list is empty
        if(head == null) {
            head = newNode;
        }
        else {          //linked list already has nodes
            tail.next = newNode;
            newNode.prev = null;
        }
        tail = newNode;
    }

    @Override
    public void insertAtGivenIndex(int data, int index) {
        //if the index is start of linked list
        if(index == 1 || head == null) {
            insertAtFirst(data);
            return;
        }
        int counter = 1;
        DLLNode temp = head;
        DLLNode newNode = new DLLNode(data);

        //iterating loop until temp points a node before last node
        while(temp.next != null) {
            if(counter+1 == index) {
                newNode.next = temp.next;
                temp.next.prev = newNode;

                newNode.prev = temp;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
            counter++;
        }

        //if flow is not returned and reached here, either the index is equal or greater than size of linked list
        //so, calling insert method, which inserts a node at end of the linked list
        insert(data);
    }

    @Override
    public int deleteAtFirst() {
        //if linked list is empty, head is null
        if(head == null) {
            return -1;
        }

        int headData = head.data;

        //if linked list has only one node
        if(head == tail) {
            head = tail = null;
        }
        else { //list has more than one node
            head = head.next;
            head.prev = null;
        }
        return headData;
    }

    @Override
    public int delete() {
        //if linked list is empty
        if(tail == null) {
            return -1;
        }
        int tailData = tail.data;

        //if linked list has only one node
        if(head == tail){
            head = tail = null;
        }
        else {  //linked list has more than one node
            tail = tail.prev;
            tail.next = null;
        }
        return tailData;
    }

    @Override
    public int deleteAtGivenIndex(int index) {
        if(index == 1) {
            return deleteAtFirst();
        }
        int counter = 1;
        DLLNode temp = head;
        while(temp != null) {
            if(counter+1 == index) {
                if(temp.next == tail){
                    return delete();
                }
                int tempNextData = temp.next.data;
                temp.next = temp.next.next;
                temp.next.prev = temp;
                return tempNextData;
            }
            temp = temp.next;
            counter++;
        }
        return -1;
    }

    @Override
    public int search(int data) {
        DLLNode temp = head;
        int index = 1;
        //iterate through the linked list using temp pointer
        while(temp != null ) {
            //if given data key is available in linked list
            if(temp.data == data) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        //if head is null or given data key is not available in linked list return 0
        return -1;
    }

    @Override
    public int getDataAtIndex(int index) {
        int counter = 1;
        DLLNode temp = head;
        while(temp != null) {
            if(counter == index) {
                return temp.data;
            }
            temp = temp.next;
            counter++;
        }
        return -1;
    }

    @Override
    public void reverseDLL() {
        if(head == null || head.next == null) {
            return;
        }
        DLLNode prev = null, curr = head, next;
        tail = head;
        while(curr != null) {
            next = curr.next;

            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;

        }

        head = prev;
    }

    @Override
    public void printDLL() {
        DLLNode temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> " );
            temp = temp.next;
        }
        System.out.println(" null ");
    }

    //Doubly Linked List Node class
    public class DLLNode {
        private int data;
        private DLLNode next;
        private DLLNode prev;

        public DLLNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
