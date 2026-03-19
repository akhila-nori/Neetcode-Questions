package Arrays.SlidingWindow;

public class MaxSubarrayAverageBruteForce {
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            // Step 1: Initialize max with a very small value
            double maxAvg = -Double.MAX_VALUE;

            // Step 2: Outer loop - 'i' is the starting point of our window
            // We stop at 'nums.length - k' so we always have k elements left
            //This is the "Stopping Point" logic. It ensures that your window doesn't "fall off" the end of the array.
            //
            //Think of it like this: If you have an array of 6 items and you need to grab a group of 4, where is the last possible place you can start?
            //1. The Physical LogicLet's look at an array with 6 slots (Indices 0 to 5) and $k = 4$:Can you start at Index 0? Yes. (Elements: 0, 1, 2, 3) — 4 items.Can you start at Index 1? Yes. (Elements: 1, 2, 3, 4) — 4 items.Can you start at Index 2? Yes. (Elements: 2, 3, 4, 5) — 4 items.Can you start at Index 3? No. (Elements: 3, 4, 5... Wait, there is no 6!) — Only 3 items.
           //So, the last valid index to start is 2.

            //Refer this logic for understanding -
          //  Let's strip away the fancy words and look at the numbers on the floor.Imagine an array of 6 numbers (indices 0 to 5):[ 10, 20, 30, 40, 50, 60 ]The length ($n$) is 6.You want a window of 4 numbers ($k=4$).Step 1: Find the absolute LAST windowGo to the very end of the array (index 5) and count backwards 4 steps to see where that window must start:Step 1: index 5Step 2: index 4Step 3: index 3Step 4: index 2 <-- This is your "Wall".If you start any later than index 2, you won't have 4 numbers left to grab.Step 2: The "Gap" Math ($n - k$)How did we get that number 2 without counting backwards manually?Take the Total Length and subtract the Window Size:$$6 - 4 = 2$$

            for (int i = 0; i <= nums.length - k; i++) {

                double currentSum = 0;

                // Step 3: Inner loop - sum up k consecutive elements
                for (int j = i; j < i + k; j++) {
                    currentSum += nums[j];
                }

                // Step 4: Calculate average and update the max
                double currentAvg = currentSum / k;
                maxAvg = Math.max(maxAvg, currentAvg);
            }

            return maxAvg;
        }
    }
}
