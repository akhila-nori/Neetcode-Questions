package Arrays;

import java.util.Arrays;

class AssignCookiesBruteForce {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        boolean[] usedCookies = new boolean[s.length];
        for(int i=0;i<g.length;i++){ //students
            for(int j=0;j<s.length;j++){ //cookies
                if(!usedCookies[j] && s[j]>=g[i]){
                    usedCookies[j] = true;
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}