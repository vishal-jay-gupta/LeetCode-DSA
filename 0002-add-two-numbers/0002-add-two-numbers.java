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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(-1);
        ListNode curr = list;
        int carry = 0;
        while(l1 != null && l2 != null){
            int data = l1.val + l2.val + carry;
            if(data <= 9){
                ListNode newNode = new ListNode(data);
                curr.next = newNode;
                curr = curr.next;
                carry = 0;

            }else{
                carry = data / 10;
                data = data % 10;
                ListNode newNode = new ListNode(data);
                curr.next = newNode;
                curr = curr.next;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int data = l1.val;
            data = data + carry;
            if(data <= 9){
                ListNode newNode = new ListNode(data);
                curr.next = newNode;
                curr = curr.next;
                carry = 0;
            }else{
                carry = data / 10;
                data = data % 10;
                ListNode newNode = new ListNode(data);
                curr.next = newNode;
                curr = curr.next;
            }
            l1 = l1.next;
        }
        while(l2 != null){
            int data = l2.val;
            data = data + carry;
            if(data <= 9){
                ListNode newNode = new ListNode(data);
                curr.next = newNode;
                curr = curr.next;
                carry = 0;
            }else{
                carry = data / 10;
                data = data % 10;
                ListNode newNode = new ListNode(data);
                curr.next = newNode;
                curr = curr.next;
            }
            l2 = l2.next;
        }

        if(carry > 0){
            ListNode newNode = new ListNode(carry);
            curr.next = newNode;
            curr = curr.next;
        }

        return list.next;
    }
}