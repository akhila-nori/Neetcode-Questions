package Arrays;

class LongestPalindromicSubString {
    public String longestPalindrome(String s) {
        int max_length=0;
        if(s.length()==1) return s;
        String max_Str = "";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s,i,j)){
                    int curr_length = j-i+1;
                    if(curr_length > max_length){
                        max_length = curr_length;
                        max_Str = s.substring(i,j+1);
                    }
                }
            }
        }
        return max_Str;

    }
    boolean isPalindrome(String s , int start, int end){
        while(start < end){
            if(s.charAt(start)!= s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}