package Arrays.TwoPointersPattern;

//odd length of string - keep expanding left and right pointers around centre, ie., l, r start at same middle location - for each substring combination
//even length of string - l,r at adjacent indexes, i.e., l = i, r = i+1 th index

//expand through both and see which is bigger length -> even length or odd length and accordingly update your max_length.

//CORE LOGIC - We iterate through the string and, for every index, we treat it as the center for both an odd and an even palindrome, expanding our two pointers outwards as long as the characters match.

class LongestPalindomicSubstring {
    public String longestPalindrome(String s) {
        int max_length = 0, final_start=0, final_end=0;
        if(s == null) return "";
        for(int i=0;i<s.length();i++){

            //odd length
            int len1 = expandFromCentre(s,i,i);

            //even length
            int len2 = expandFromCentre(s,i,i+1);

            //Get the best length for this specific center
            if(len1 > len2) max_length = len1;
            else max_length = len2;

            if(max_length > ((final_end) - (final_start) + 1)){
                final_start = i - (max_length-1)/2;
                final_end = i + (max_length/2);
            }

        }
        return s.substring(final_start, final_end+1);


    }

    private int expandFromCentre(String s, int start, int end){
        while(start>=0 && end < s.length()){
            if(s.charAt(start)!=s.charAt(end)) break;
            else{
                start--;
                end++;
            }
        }

        return (end-1) - (start+1) + 1;
    }

}
