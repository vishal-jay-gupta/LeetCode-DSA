/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

import java.util.*;

public class Solution {

/* 
    Aproach 1
    Time Complexity = O(n)
    Space Complexity = O(n)

    In worth case we are storing n node in hset
*/

    // public ListNode detectCycle(ListNode head) {
    //     if(head == null) return null;
    //     if(head.next == null) return null;

    //     HashSet<ListNode> hset = new HashSet<>();

    //     while(head != null){
    //         if(hset.contains(head)){
    //             return head;
    //         }else{
    //             hset.add(head);
    //             head = head.next;
    //         }
    //     }

        
    //     return null;
    // }

    
    /* 
    Aproach 2
    Time Complexity = O(n)
    Space Complexity = O(1)

    Floyd's Cycle Detection - use slow and fast pointer
*/
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
    }
}