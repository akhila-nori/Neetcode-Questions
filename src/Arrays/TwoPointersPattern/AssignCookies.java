package Arrays.TwoPointersPattern;

import java.util.Arrays;

class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int cookiesPointer = 0;
        int childrenPointer = 0;

        while(childrenPointer<g.length && cookiesPointer<s.length){
            if(s[cookiesPointer] >= g[childrenPointer]){
                childrenPointer++;
                count++;
            }
            cookiesPointer++;
        }
        return count;
    }
}