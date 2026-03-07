package Arrays.TwoPointersPattern;


import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        int max=0;
        Set<Character> charSet = new HashSet<>();
        for(right=0;right<s.length();right++){
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            max=Math.max(max, right-left+1);
        }
        return max;
    }
}