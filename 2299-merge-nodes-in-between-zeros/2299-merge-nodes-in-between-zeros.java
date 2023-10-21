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
    public ListNode mergeNodes(ListNode head) {

        ListNode i = head;
        ListNode j = head.next;
        int sum = 0;
        while(j != null){
            sum += j.val;
            if(j.val == 0){
                i.next.val = sum;
                i.next.next = j.next;
                i = j;
                sum = 0;
            }
            j = j.next;
        }

        return head.next;
    }
}