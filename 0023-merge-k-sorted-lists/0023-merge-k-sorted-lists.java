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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> allValues = new ArrayList<>();
        
        // Step 1: Collect all values from all lists
        for (ListNode list : lists) {
            while (list != null) {
                allValues.add(list.val);
                list = list.next;
            }
        }
        
        // Step 2: Sort all values
        Collections.sort(allValues);
        
        // Step 3: Build new sorted linked list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : allValues) {
            current.next = new ListNode(val);
            current = current.next;
        }
        
        return dummy.next;
    }
}