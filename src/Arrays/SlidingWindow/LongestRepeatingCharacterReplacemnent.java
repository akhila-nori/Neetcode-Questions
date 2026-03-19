package Arrays.SlidingWindow;

class LongestRepeatingCharacterReplacemnent {
    public int characterReplacement(String s, int k) {
        int m[] = new int[26];
        int windowSize = 0, maxFrequency = 0, maxLength = 0,left=0;

        for(int right=0;right<s.length();right++){

            //update character frequency in array 'm' of 26 upper case characters
            int index = s.charAt(right) - 'A';
            m[index]++;

            //update maxfrequency in the current window size
            maxFrequency = Math.max(maxFrequency,m[index]);

            //check if the window is invalid - adjustments needed in window size
            windowSize = right - left + 1;
            if(windowSize - maxFrequency > k){
                //ajustments are required in window sizing, remove left character
                m[s.charAt(left) - 'A']--;
                left++;
            }

            //record max length of window right now
            maxLength = Math.max(maxFrequency,right-left+1);
        }

        return maxLength;


    }
}