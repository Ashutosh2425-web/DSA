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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        int length =0;
        ListNode current=head;

        while(current != null){
            length++;
            current=current.next;
        }
        k=k%length;

        if(k == 0){
            return head;
        }
        current=head;

        for(int i=1;i< length -k; i++){
            current=current.next;
        }
        ListNode newHead=current.next;

        ListNode tail=head;

        while(tail.next != null){
            tail=tail.next;
        }
        tail.next=head;

        current.next=null;

        return newHead;
    }
}