package Impl.LinkedList.LinkedListInterface;

public interface LinkedListInterface {
    //insertions
    void insertAtFirst(int data);
    void insert(int data);
    void insertAtGivenIndex(int data, int index);

    //deletions
    int deleteAtFirst();
    int delete();
    int deleteAtGivenIndex(int index);

    //search
    int search(int data);

    //get data at given index
    int getDataAtIndex(int index);
}
