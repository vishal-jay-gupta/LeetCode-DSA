import java.util.*;

/*-------------------------------------------------------------------------------------------
        Time Complexity = O(no. of days)
        Space Complexity = O(Total no. of next call)
--------------------------------------------------------------------------------------------*/

// class StockSpanner {
//     ArrayList<Integer> list = new ArrayList<>();
//     public StockSpanner() {
        
//     }

//     public int next(int price) {

//         list.add(price);
//         int ans = 0;

//         for(int i=list.size()-1; i>=0; i--){
//             // System.out.println(list.get(i));
//             if(price >= list.get(i)) ans++;
//             else break;
//         }

//         return ans;
//     }
// }


/*-------------------------------------------------------------------------------------------
        Time complexity: O(1) amortized per call – Each price is pushed and popped at most once.
        Space complexity: O(n) – Stack stores pairs of price and span.
--------------------------------------------------------------------------------------------*/

class StockSpanner {
    Stack<int []> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {

        int span = 1;

        while(!stack.isEmpty() && stack.peek()[0] <= price){
            span += stack.pop()[1];
        }

        stack.push(new int[]{price, span});

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */