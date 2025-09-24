class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        for(int i=s.length()-1; i>=0; i--) {
            if(len == 0 && s.charAt(i) == ' ')
                continue;
            else if(len != 0 && s.charAt(i) == ' ')
                break;
            len += 1;
        }
        return len;
    }
}