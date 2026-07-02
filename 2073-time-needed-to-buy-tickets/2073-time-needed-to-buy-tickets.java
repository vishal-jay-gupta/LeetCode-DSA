import java.util.*;

class Solution {
    /*-------------------------------------------------------------------------------
                    APPROACH - 1
            ------------------------------------
            Time complexity = O(n + totalTickets)
            Space Complexity: O(n)
    --------------------------------------------------------------------------------*/


    // class Person{
    //     int tickets;
    //     int index;

    //     Person(int tickets, int index){
    //         this.tickets = tickets;
    //         this.index = index;
    //     }
    // }

    // public int timeRequiredToBuy(int[] tickets, int k) {
    //     Queue<Person> q = new LinkedList<>();

    //     // 
    //     for(int i=0; i<tickets.length; i++){
    //         q.offer(new Person(tickets[i], i));
    //     }

    //     int ans = 0;
    //     while(!q.isEmpty()){
    //         Person p = q.poll();
    //         p.tickets--;
    //         ans++;
    //         if(p.tickets == 0){
    //             if(p.index == k){
    //                 return ans;
    //             }
    //         }else{
    //             q.offer(p);
    //         }
    //     }
    //     return -1;
    // }


    /*-------------------------------------------------------------------------------
                    APPROACH - 2
            ------------------------------------
            Time complexity = O(n + totalTickets)
            Space Complexity: O(1)
    --------------------------------------------------------------------------------*/

    public int timeRequiredToBuy(int[] tickets, int k) {
        int ans = 0;
        int n = tickets.length;
         while (tickets[k] > 0) {
            for (int i = 0; i < n; i++) {

                if (tickets[i] != 0) {
                    tickets[i]--;
                    ans++;
                }

                if (tickets[k] == 0)
                    return ans;
            }
        }

        return ans;
    }
}