class ReverseLinkedList {
    Node reverseList(Node head) {
        // code here
        Node prev = null;
        Node curr = head;
        Node next;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}
