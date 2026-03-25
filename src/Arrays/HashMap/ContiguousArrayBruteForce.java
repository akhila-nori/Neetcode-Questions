package Arrays.HashMap;

class ContiguousArrayBruteForce {
    public int findMaxLength(int[] nums) {

        int maxLen = 0;
        for(int i=0;i<nums.length;i++){
            int zeros=0;
            int ones=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0) {
                    zeros++;
                } else ones++;

                if(zeros == ones){
                    maxLen = Math.max(maxLen,j-i+1);
                }

            }

        }
        return maxLen;

    }
}
