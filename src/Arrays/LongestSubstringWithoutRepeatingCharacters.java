package Arrays;

class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(checkIfused(s,i,j)){
                    res = Math.max(res, j-i+1);
                }
            }
        }
        return res;
    }

    private boolean checkIfused(String s, int start, int end){
        boolean[] c = new boolean[128];
        for(int i=start;i<=end;i++){
            char ch = s.charAt(i);
            if(c[ch]) return false;
            c[ch] = true;
        }
        return true;
    }
}