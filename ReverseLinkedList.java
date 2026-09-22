public class ReverseLinkedList {
    public class ListNode{
        int val;
        ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
    public ListNode reverseList(ListNode head){
        ListNode previous=null;
        ListNode current=head;

        while(current != null){
            ListNode next=current.next;
            current.next=previous;
            previous=current;
            current=next;;
        }
        return previous;
    }
}
