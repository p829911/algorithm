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
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode rootNode = new ListNode(0);
        ListNode cur = rootNode;

        while (list1 != null | list2 != null) {

            if (list1 == null) {
                cur.next = list2;
                break;
            }

            if (list2 == null) {
                cur.next = list1;
                break;
            }

            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            
            cur = cur.next;
        }

        return rootNode.next;
    }
}