class Solution {
    public boolean backspaceCompare(String s, String t) {
        int sPointer = s.length() - 1;
        int tPointer = t.length() - 1;
        
        while (sPointer >= 0 || tPointer >= 0) {
            sPointer = getNextCharacterPosition(s, sPointer); // can be negative, empty string;
            tPointer = getNextCharacterPosition(t, tPointer); // can be negative, empty string;
            
            if ((sPointer < 0 && tPointer >= 0) ||
                (tPointer < 0 && sPointer >= 0) ||
                (sPointer >= 0 && tPointer >= 0) && (s.charAt(sPointer) != t.charAt(tPointer))
               ) {
                return false;
            }
            
            sPointer--;
            tPointer--;
        }
        
        return true;
    }

    public int getNextCharacterPosition(String s, int start) {
        if (start < 0) {
            return start;
        }
        
        char c = s.charAt(start);
        int count = c == '#' ? 2 : 0;
        
        while (count > 0) {
            start--;
            
            if (start < 0) {
                start -= count;
                break;
            }
            
            c = s.charAt(start);
            
            if (c == '#') {
                count++;
            } else {
                count--;
            }
        }
               
        return start;
    }
}