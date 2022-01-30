public void reversePI(){
      // write your code here
      Node prev = null;
      Node curr = head;
      
      while(curr != null) {
          Node ahead = curr.next;
          curr.next = prev;
          prev = curr;
          curr = ahead;
      }
      
      Node temp = head;
      head = tail;
      tail = temp;
    }