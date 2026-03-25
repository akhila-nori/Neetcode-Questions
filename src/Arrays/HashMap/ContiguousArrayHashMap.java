package Arrays.HashMap;

import java.util.HashMap;
import java.util.Map;

class SolContiguousArrayHashMapution {
    public int findMaxLength(int[] nums) {

        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,-1);
        int maxLen=0, runningSum=0;

        //transforming array - 0s to -1
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
        for(int i=0;i<nums.length;i++){
            runningSum +=nums[i];

            // Have we seen this exact sum before?  5 + 0 betweent index earlier where sum was 5 to current index sum turned out to be = 5
            // If yes, the subarray between the FIRST time we saw it
            // and NOW has a net sum of zero.
            if(m.containsKey(runningSum)){
                int indexPos = m.get(runningSum);
                maxLen = Math.max(maxLen,i-indexPos);
            } else{
                m.put(runningSum,i);
            }
        }

        return maxLen;
    }
}
