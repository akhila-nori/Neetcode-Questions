package Arrays.PrefixSum;

//O(n^2) time complexity - you are trying to compute contiguous subarrays again and again
class SubArraySumEqualskBruteForce {
    public int subarraySum(int[] nums, int k) {
        int sumInner, c=0;
        for(int i=0;i<nums.length;i++){
            sumInner=0;
            for(int j=i;j<nums.length;j++){
                sumInner += nums[j];
                if(sumInner==k) c++;
            }

        }
        return c;

    }
}
