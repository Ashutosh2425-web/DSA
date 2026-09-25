/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         ListNode PA=headA;
        ListNode PB=headB;

        while(PA != PB){
            if(PA == null){
                PA=headB;
            }else{
                PA=PA.next;
            }
            if(PB == null){
                PB=headA;
            }else{
                PB=PB.next;
            }
        }
        return PB;
    }
}