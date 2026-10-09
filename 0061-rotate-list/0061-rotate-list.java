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
    public ListNode rotateRight(ListNode head, int k) {
        int n = 0;

        ListNode curr = head;
        while(curr != null){
            n++;
            curr = curr.next;
        }

        if(n < 2) return head;

        k = k % n;
        // System.out.println("size of ll: " + n);
        // System.out.println("k Value: " + k);
        
        for(int i=0; i<k; i++){
            curr = head;
            ListNode prev = null;
            while(curr.next != null){
                prev = curr;
                curr = curr.next;
            }
            // System.out.println("val: " + curr.val);
            curr.next = head;
            prev.next = null;
            head = curr;
        }

        return head;
    }
}