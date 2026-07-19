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

// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         ListNode curr = head;
//         while(curr!=null) {
//             arr.add(curr.val);
//             curr = curr.next;
//         }

//         curr = head;

//         for(int i=arr.size() - 1; i>=0; i--) {
//             curr.val=arr.get(i);
//             curr=curr.next;
//         }
//         return head;
//     }
// }

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
