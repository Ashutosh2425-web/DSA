public class LinkedListCycle {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public boolean hascycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
