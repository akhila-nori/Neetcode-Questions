package Arrays.SlidingWindow;

import java.util.Arrays;

class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        //Step 1 : create scoreboard for s1

        int scoreboard1[] = new int[26];
        for(int i=0;i<s1.length();i++){
            //find frequerncy of each character
            int index = s1.charAt(i) - 'a';
            scoreboard1[index]++;
        }

        //Step 2 : slide a window of fixed length s1 across s2
        int k = s1.length();
        int scoreboard2[] = new int[26];
        for(int right=0;right<s2.length();right++){

            //add a new character on right to our scoreboard 2
            scoreboard2[s2.charAt(right) - 'a']++;

            //sliding window concept - if character on right exceds 'k' window size ,
            //remove left charcater and decrement scoreboard count for that character
            //most important part of fixed size sliding window
            //1. The GoalWe want our window in s2 to be exactly the same length      as       s1.
            //If s1 = "abc", then k = 3. We only ever want to count 3 characters at a time in s2.
            //KICK OUT THE PERSON WHO IS THE FIRST ONE , IN WINDOW SIZE 'k'
            if(right>=k){
                int leftIndexKickedOut = s2.charAt(right - k) - 'a';
                scoreboard2[leftIndexKickedOut]--;

            }
//Look at that last number. Even though you have 3 characters, your right pointer is only at index 2.Mathematically: 2 = 3 - 1 . Index = k - 1
            if(right >= k-1){
                if(Arrays.equals(scoreboard1,scoreboard2)){
                    return true;
                }
            }

        }
        return false;
    }
}
