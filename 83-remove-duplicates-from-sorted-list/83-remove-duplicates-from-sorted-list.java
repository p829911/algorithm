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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode curNode = head;
        ListNode nextNode = head.next;
        while (nextNode != null) {
            if (curNode.val == nextNode.val) {
                nextNode = nextNode.next;
                curNode.next = nextNode;
            } else {
                curNode.next = nextNode;
                curNode = nextNode;
                nextNode = curNode.next;
            }
        }
        return head;
    }
}