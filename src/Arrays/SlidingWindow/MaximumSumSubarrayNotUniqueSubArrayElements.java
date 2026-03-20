package Arrays.SlidingWindow;
//Maximum sum in subarray - not unique subarray elements - we just need to calculate amongst
//all the subarrays formed, the array which gives maximum sum
//Note : the array consists of -ve integers as well, that's why sum of all array elements != sum of largest subarray

import java.util.List;

class MaximumSumSubarrayNotUniqueSubArrayElements {
    public long maxSum(List<Integer> nums, int m) {

        int currentSum=0, maxSum=0;
        for(int start=0;start<nums.size();start++){
            for(int end=start;end<nums.size();end++){
                currentSum += nums.get(end);
                maxSum = Math.max(maxSum,currentSum);
            }

        }
        return maxSum;

    }
}
