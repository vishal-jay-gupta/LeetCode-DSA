/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

import java.util.*;

class Solution {

    /*-----------------------------------------------------------------------------------------
            Recursive say solution
    -----------------------------------------------------------------------------------------*/
    // public Node flatten(Node head) {

    //     if (head == null) return null;

    //     Node curr = head;

    //     while (curr != null) {

    //         if (curr.child != null) {

    //             Node next = curr.next;

    //             Node child = flatten(curr.child);

    //             curr.next = child;
    //             child.prev = curr;

    //             curr.child = null;

    //             Node tail = child;

    //             while (tail.next != null) {
    //                 tail = tail.next;
    //             }

    //             if (next != null) {
    //                 tail.next = next;
    //                 next.prev = tail;
    //             }
    //         }

    //         curr = curr.next;
    //     }

    //     return head;
    // }



    public Node flatten(Node head) {
        if(head == null) return head;

        Node curr = head;

        while(curr != null){
            if(curr.child != null){
                Node nextNode = curr.next;
                Node childNode = curr.child;

                while(childNode.next != null){
                    childNode = childNode.next;
                }

                if(nextNode != null){
                    childNode.next = nextNode;
                    nextNode.prev = childNode;
                }

                curr.next = curr.child;
                curr.child.prev= curr;

                curr.child = null;
            }
            curr = curr.next;
        }

        return head;
    }
}