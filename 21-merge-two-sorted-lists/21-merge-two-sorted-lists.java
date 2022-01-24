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
    
    public static ListNode makeListNode(List<Integer> values) {
        if (values.isEmpty()) {
            return null;
        }
        ListNode postNode = new ListNode(values.get(values.size() - 1));
        for (int i = values.size() - 2; i >= 0; i--) {
            postNode = new ListNode(values.get(i), postNode);
        }
        return postNode;
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> sortedArray = new ArrayList<>();

        /**
         * && vs &, || vs | 차이
         * &는 두 조건을 모두 검사 하는 것이고
         * &&는 첫번째 조건이 참 일때만 두번째 조건을 검사 하는 것이다.
         */
        while (list1 != null | list2 != null) {

            if (list1 != null) {
                sortedArray.add(list1.val);
                list1 = list1.next;
            }

            if (list2 != null) {
                sortedArray.add(list2.val);
                list2 = list2.next;
            }

        }

        sortedArray.sort(Integer::compareTo);
        return makeListNode(sortedArray);
    }
}