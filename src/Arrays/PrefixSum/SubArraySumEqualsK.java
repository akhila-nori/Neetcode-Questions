package Arrays.PrefixSum;
//When you find that target (which is $PrefixSum_{i-1}$) already exists in your HashMap, you can infer one powerful truth:
// There is at least one "starting point" in the past that, if cut off, leaves exactly $k$ behind.
//Imagine a piece of string:
//        |---Prefix(i-1)---|----------k----------|
//        |----------------Total Sum----------------|

//If you know the Total Sum (from start to current point).
//
//And you know the Prefix(i-1) (from start to some previous point).
//
//The difference k is physically forced to be the contiguous piece in between those two points.

import java.util.HashMap;
import java.util.Map;

class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int currentSum=0, count=0,target=0;
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,1);

        for(int i=0;i<nums.length;i++){
            currentSum += nums[i];
            target = currentSum - k;

            if(m.containsKey(target)){
                count += m.get(target);
            }
            m.put(currentSum, m.getOrDefault(currentSum,0)+1);
        }

        return count;
    }
}