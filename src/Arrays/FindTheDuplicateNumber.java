package Arrays;

import java.util.HashSet;
import java.util.Set;

class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Set<Integer> n = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!n.contains(nums[i])) {
                n.add(nums[i]);
            } else return nums[i];
        }
        return -1;

    }
}