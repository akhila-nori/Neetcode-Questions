package Arrays.SlidingWindow;

class MaxSubarrayAverageSlidingWindow {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0.0;

        //calculating the first iteration sum
        for(int i=0;i<k;i++){
            sum = sum + nums[i];
        }

        double maxSum = sum;

        //sliding window approach
        int startPointer=0;
        int endPointer=k;

        while(startPointer < nums.length-k){
            sum = sum - nums[startPointer];
            startPointer++;

            sum = sum + nums[endPointer];
            endPointer++;

            maxSum = Math.max(sum, maxSum);

        }

        return maxSum/k;

    }
}