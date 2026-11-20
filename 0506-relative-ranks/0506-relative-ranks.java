import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());
        String[] position = new String[n];

        for(int i=0; i<n; i++){
            treeMap.put(score[i], i);
        }

        int idx = 1;
        for(Map.Entry<Integer, Integer> entry : treeMap.entrySet()){
            if(idx == 1){
                position[entry.getValue()] = "Gold Medal";
            }else if(idx == 2){
                position[entry.getValue()] = "Silver Medal";
            }else if(idx == 3){
                position[entry.getValue()] = "Bronze Medal";
            }else{
                position[entry.getValue()] = idx + "";
            }
            idx++;
        }

        return position;

    }
}