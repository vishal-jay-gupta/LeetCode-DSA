import java.util.*;

class Solution {
    class Person{
        int tickets;
        int index;

        Person(int tickets, int index){
            this.tickets = tickets;
            this.index = index;
        }
    }

    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Person> q = new LinkedList<>();

        // 
        for(int i=0; i<tickets.length; i++){
            q.offer(new Person(tickets[i], i));
        }

        int ans = 0;
        while(!q.isEmpty()){
            Person p = q.poll();
            p.tickets--;
            ans++;
            if(p.tickets == 0){
                if(p.index == k){
                    return ans;
                }
            }else{
                q.offer(p);
            }
        }
        return -1;
    }
}