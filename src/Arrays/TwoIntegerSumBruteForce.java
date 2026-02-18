package Arrays;

class TwoIntegerSumBruteForce {
    public int[] twoSum(int[] numbers, int target) {
        int[] returnArray;
        int startPointer = 0;
        int endPointer = 0;

        for(startPointer=0;startPointer<numbers.length;startPointer++){
            for(endPointer=startPointer+1;endPointer<numbers.length;endPointer++){
                if(numbers[startPointer] + numbers[endPointer] == target)
                    return new int[] {numbers[startPointer], numbers[endPointer]};
            }
        }
        return new int[] {-1,-1};
    }
}



