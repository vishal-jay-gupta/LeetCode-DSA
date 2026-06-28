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

    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return null;

        HashSet<ListNode> hset = new HashSet<>();

        while(head != null){
            if(hset.contains(head)){
                return head;
            }else{
                hset.add(head);
                head = head.next;
            }
        }

        
        return null;
    }

    
    // public ListNode detectCycle(ListNode head) {
        
    // }
}