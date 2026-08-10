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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        ListNode rev = revers(second);
        ListNode first = head;
        while(rev != null){
            ListNode tmp1 = first.next;
            ListNode tmp2 = rev.next;
            first.next = rev;
            rev.next = tmp1;
            first = tmp1;
            rev = tmp2;
        }
    }
    public ListNode revers(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }
}
