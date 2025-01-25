package Impl.LinkedList.CircularLinkedListImpl;

public class CircularLinkedListPractise implements CircularLinkedListInterface {
    CLLNode head = null;
    CLLNode tail = null;

    @Override
    public void insertAtFirst(int data) {
        CLLNode newNode = new CLLNode(data);
        if(head == null) {
            tail = newNode;
        }
        else {
            newNode.next = head;
        }
        head = newNode;
        tail.next = head;
    }

    @Override
    public void insert(int data) {
        if(head == null) {
            insertAtFirst(data);
            return;
        }
        CLLNode newNode = new CLLNode(data);
        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
    }

    @Override
    public void insertAtGivenIndex(int data, int index) {
        if(index == 1 || head == null) {
            insertAtFirst(data);
            return;
        }
        CLLNode temp  = head;
        int counter = 2;
        do{
            if(counter == index) {
                CLLNode newNode = new CLLNode(data);
                newNode.next = temp.next;
                temp.next = newNode;
                //update tail pointer if node is added after tail node
                if(temp == tail) {
                    tail = tail.next;
                }
                return;
            }
            temp = temp.next;
            counter++;
        } while(temp != head);

        //if index is out of bounds(greater than linked list length), we insert at last of the list
        insert(data);
    }

    @Override
    public int deleteAtFirst() {
        if(head == null) {
            return -1;
        }
        int headData = head.data;
        //if linked list contains single node
        if(head == tail){
            head = tail = null;
        }
        else {
            tail.next = head.next;
            head = head.next;
        }
        return headData;
    }

    @Override
    public int delete() {
        if(head == null) {
            return -1;
        }
        int tailData = tail.data;
        //if cll has single node
        if(head == tail) {
            head = tail = null;
            return tailData;
        }

        CLLNode temp = head;
        while(temp.next != tail) {
            temp = temp.next;
        }

        //detach tail to head
        tail.next = null;
        //update new tail
        temp.next = head;
        tail = temp;
        return tailData;
    }

    @Override
    public int deleteAtGivenIndex(int index) {
        if(head == null) {
            return -1;
        }
        if(index == 1) {
            return deleteAtFirst();
        }
        CLLNode temp = head;
        int counter= 2;
        do {
            if(counter == index) {
                int tempNextData = temp.next.data;
                if(temp.next == tail) {
                    tail= temp;
                }
                temp.next = temp.next.next;
                return tempNextData;
            }
            temp = temp.next;
            counter++;
        } while(temp != head);

        return -1;
    }

    @Override
    public int search(int data) {
        if(head != null) {
            int counter = 1;
            CLLNode temp = head;
            do {
                if (temp.data == data) {
                    return counter;
                }
                temp = temp.next;
                counter++;
            } while (temp != head);
        }
        return -1;
    }

    @Override
    public int getDataAtIndex(int index) {
        if(head != null) {
            int counter = 1;
            CLLNode temp = head;
            do {
                if (counter == index) {
                    return temp.data;
                }
                temp = temp.next;
                counter++;
            } while (temp != head);
        }
        return -1;
    }

    @Override
    public void reverseCLL() {

    }

    @Override
    public void printCLL() {
        if(head == null) {
            System.out.println("Circular Linked List is empty");
            return;
        }
        CLLNode temp = head;
        do {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        } while(temp != head);
        System.out.println(" start ");
    }

    public class CLLNode {
        private int data;
        private CLLNode next;
        public CLLNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
