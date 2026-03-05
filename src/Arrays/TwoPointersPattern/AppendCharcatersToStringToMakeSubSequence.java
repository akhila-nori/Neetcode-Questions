package Arrays.TwoPointersPattern;

public class AppendCharcatersToStringToMakeSubSequence {
    public int appendCharacters(String s, String t) {
        int sPtr=0, tPtr=0;
        while(sPtr<s.length() && tPtr<t.length()){
            if(s.charAt(sPtr) == t.charAt(tPtr)){
                tPtr++;
            }
            sPtr++;
        }
        return t.length()-tPtr;
    }
}
