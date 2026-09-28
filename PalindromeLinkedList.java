public class PalindromeLinkedList {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public boolean isPalindrome(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!= null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode previous=null;
        while(slow !=null){
            ListNode next=slow.next;
            slow.next=previous;
            previous=slow;
            slow=next;
        }
        ListNode first=head;
        ListNode second=previous;
        
        while(second != null){
            if(first.val != second.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
    }
}
