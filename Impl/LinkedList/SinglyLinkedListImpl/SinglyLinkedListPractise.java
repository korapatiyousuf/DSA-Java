package Impl.LinkedList.SinglyLinkedListImpl;

public class SinglyLinkedListPractise implements SinglyLinkedListInterface {
    SLLNode head = null;
    SLLNode tail = null;


    // -------------- Insertion ------------------
    //insert a new node with given data at start of the linked list
    @Override
    public void insertAtFirst(int data) {
        SLLNode newNode = new SLLNode(data);
        newNode.next = head;
        head = newNode;
        if(tail == null) {
            tail = head;
        }
    }

    //insert a new Node (at end of LL) with given data
    @Override
    public void insert(int data) {
        if(head == null) {
            insertAtFirst(data);
            return;
        }

        SLLNode newNode = new SLLNode(data);
        tail.next = newNode;
        tail = newNode;
    }

    //insert a new node with given data at given index (1-based indexing)
    //1 <= index size <= linked-list_length
    @Override
    public void insertAtGivenIndex(int data, int index) {
        if(index == 1 || head == null) {
            insertAtFirst(data);
            return;
        }
        SLLNode temp = head;
        SLLNode newNode = new SLLNode(data);
        int counter = 2;
        while(temp.next != null) {
            if(counter == index) {
                break;
            }
            temp = temp.next;
            counter++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //delete head node
    @Override
    public int deleteAtFirst() {
        if(head == null) {
            return -1;
        }
        int headVal = head.data;
        head = head.next;
        return headVal;
    }

    //delete last node
    public int delete() {
        if(head == null) {
            return -1;
        }
        int lastVal = tail.data;
        if(head == tail){
            head = tail = null;
            return lastVal;
        }
        SLLNode temp = head;
        while(temp.next != tail) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;

        return lastVal;
    }

    @Override
    public int deleteAtGivenIndex(int index) {
        if(index == 1) {
            return deleteAtFirst();
        }
        SLLNode temp = head;
        int counter = 1;
        while(temp.next != null) {
            if(counter+1 == index) {
                int deleteVal = temp.next.data;
                temp.next= temp.next.next;
                return deleteVal;
            }
            temp = temp.next;
            counter++;
        }
        return -1;
    }

    //search for given data in linked list
    @Override
    public int search(int data) {
        int index = 1;
        SLLNode temp = head;
        while(temp != null) {
            if(temp.data == data) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }

    @Override
    public int getDataAtIndex(int index) {
        int counter = 1;
        SLLNode temp = head;
        while(temp != null) {
            if(counter == index) {
                return temp.data;
            }
            temp = temp.next;
            counter++;

        }
        return -1;
    }

    //------------------ reverse -----------------
    @Override
    public void reverseSLL() {
        if(head == null || head.next == null) {
            return;
        }
        SLLNode prev = null, curr = head, next;
        tail = head;
        while(curr != null) {
            next= curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //-------------------print -------------------------
    @Override
    public void printSLLNodes() {
        SLLNode temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Singly Linked List Node class
    public class SLLNode {
        private int data;
        private SLLNode next;

        public SLLNode(int data) {
            this.data = data;
            this.next = null;
        }

        public SLLNode(int data, SLLNode next) {
            this.data = data;
            this.next = next;
        }
    }
}
