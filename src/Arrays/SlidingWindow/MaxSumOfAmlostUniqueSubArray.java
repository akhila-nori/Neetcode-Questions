package Arrays.SlidingWindow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MaxSumOfAmlostUniqueSubArray {
    public long maxSum(List<Integer> nums, int m, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        int numIn=0,numberToBeKickedOut=0;
        long currentSum=0, maxSum=0;

        for(int right=0;right<nums.size();right++){
            numIn = nums.get(right);
            count.put(numIn, count.getOrDefault(numIn,0)+1);
            currentSum += nums.get(right);

            if(right>=k){
                //SLIDING WINDOW LOGIC

                //will go here everytime after 1st group is full
                //in that case we need to remove left index and move right pointer
                // i.e., slide window

                numberToBeKickedOut = nums.get(right-k);
                currentSum -= numberToBeKickedOut;
                count.put(numberToBeKickedOut, count.get(numberToBeKickedOut)-1);

                //0th, 1st index iteration will fail if writtebn outside, that'w why move this inside and not outside
                if(count.get(numberToBeKickedOut) == 0){
                    count.remove(numberToBeKickedOut);
                }
            }

            //     if(count.get(numberToBeKickedOut) == 0){
            //     count.remove(numberToBeKickedOut);
            //  }




            //checking if the current window is full... waiting for 0th, 1st to fill
            if(right >= (k-1)){
                //lets say when index = 2, it comes inside
                // here point to note is that , middle elemnts we are not touching
                // nor are we updating the count in HashMap for middle elements
                // only right-k and right count we are updating.

                if(count.size() >= m){
                    maxSum = Math.max(currentSum,maxSum);
                }
            }
        }
        return maxSum;

    }
}
