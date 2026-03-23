package Arrays.PrefixSum;


import java.util.HashMap;
import java.util.Map;

class ContinousSubArraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sumCurrent=0,rem=0,len=0;
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,-1);

        for(int i=0;i<nums.length;i++){
            sumCurrent += nums[i];
            rem = sumCurrent % k;



            // if(m.containsKey(rem)){
            //    len = i - m.get(rem);
            //    if(len >=2) return true;
            // }

            // m.put(rem,i);





            //we found a match, check distance from oldest same remainder index
            //The HashMap will not store the new index. It will strictly keep the old one.
            //The "Wait and See" Strategy: By not updating the Map, you keep the index 10 sitting there.
            //In sceanrios where arr = [0,0,0]. subarray - [0,0,0].
            if(m.containsKey(rem)){
                if(i - m.get(rem) >= 2) return true;
            } else {
                m.put(rem,i);
            }

        }

        return false;

    }
}
