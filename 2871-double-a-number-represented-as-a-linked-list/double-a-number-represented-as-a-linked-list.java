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
    public ListNode doubleIt(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            int val = curr.val*2;
            if(val < 10){
                curr.val = val;
            }
            else if(prev != null){
                curr.val = val % 10;
                prev.val = prev.val+1;
            }
            else{
                head = new ListNode(1,curr);
                curr.val = val%10;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}