class Solution {
    public boolean rotateString(String s, String goal) {
        String str = s + s;
        if(s.length() != goal.length())
            return false;
        
        for(int i=0; i<s.length(); i++) {
            if(str.substring(i, i+goal.length()).equals(goal))
                return true;
        }

        return false;

    }
}