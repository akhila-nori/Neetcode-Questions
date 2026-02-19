package Arrays.TwoPointersPattern;

class TwoIntegerSum {
    public int[] twoSum(int[] numbers, int target) {
        int startPointer = 0;
        int endPointer = numbers.length-1;
        int sum = 0;
        while(startPointer < endPointer){
            sum = numbers[startPointer] + numbers[endPointer];
            if(sum == target){
                return new int[]{numbers[startPointer], numbers[endPointer]};
            }
            else if(sum > target) endPointer--;
            else startPointer++;
        }
        return new int[] {-1,-1};
    }
}


