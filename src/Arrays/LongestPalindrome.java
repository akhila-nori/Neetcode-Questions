package Arrays;

class LongestPalindrome {
    public String longestPalindrome(String s) {
        String longest = "";
        if(s==null || s.length()<1) return "";
        for (int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s,i,j)){
                    if(j-i+1 > longest.length()) longest = s.substring(i,j+1);
                }
            }
        }
        return longest;

    }
    private boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
