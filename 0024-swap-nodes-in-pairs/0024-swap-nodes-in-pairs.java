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

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newhead = head.next;
        swapAdjacent(head);
        return newhead;
    }

    private void swapAdjacent(ListNode head){
        ListNode prevHead = null;
        ListNode head1 = head;
        ListNode head2 = head1.next;
        while(head1 != null && head1.next != null){
            head2 = head1.next;
            if(prevHead != null){
                prevHead.next = head2;
            }
            ListNode head3 = head2.next;
            head2.next = head1;
            head1.next = head3;

            prevHead = head1;
            head1 = head3;
        }
        
    }


}