package Arrays.PrefixSum;

class LeftAndRightSumDifference {
    public int[] leftRightDifference(int[] nums) {

        int[] ans = new int[nums.length];
        int totalSum=0;

        for(int num : nums){
            totalSum += num;
        }

        int leftSum = 0, rightSum = 0;

        for(int i=0;i<nums.length;i++){
            rightSum = totalSum - leftSum - nums[i];

            ans[i] = Math.abs(leftSum-rightSum);

            leftSum += nums[i];

        }
        return ans;
    }
}