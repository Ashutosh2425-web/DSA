/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode previous=dummy;
        ListNode current=dummy.next;
        while(current!=null){
            if(current.val==val){
                previous.next=current.next;
                current=current.next;
            }else{
                current=current.next;
                previous=previous.next;
            }
        }
        return dummy.next;
    }
}