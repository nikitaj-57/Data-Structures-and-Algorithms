public class Main {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      // Write your code here
    //   1. creating a new Node temp which will be equal to val
      Node temp = new Node();
      temp.data = val;
      
    //   2. 2 conditions: if LL is empty
      if(size == 0) {
          head = temp;
          tail = temp;
      } else {
        //   if size isn't null
        tail.next = temp;
        tail = temp;
      }
      
      size++;
    }
  }
