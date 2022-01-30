public void swap(Node leftNode, Node rightNode) {
        int temp = leftNode.data;
        leftNode.data = rightNode.data;
        rightNode.data = temp;
    }
    
    private Node getNodeAt(int idx) {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
          temp = temp.next;
        }
        return temp;
    }

    public void reverseDI() {
      // write your code here
      int left = 0, right = size-1;
      
      while(left < right) {
          Node leftNode = getNodeAt(left);
          Node rightNode = getNodeAt(right);
          
          swap(leftNode, rightNode);
          left++; right--;
      }
    }