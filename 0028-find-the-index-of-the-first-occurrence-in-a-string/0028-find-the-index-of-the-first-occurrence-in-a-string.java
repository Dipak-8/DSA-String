class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)) 
            return -1;
        int ans = 0;
        for(int i=0; i <= haystack.length()-needle.length(); i++) {  
            int j = 0;
            while(j < needle.length()) {
                char c1 = haystack.charAt(i+j);
                char c2 = needle.charAt(j);
                if(c1 == c2)
                    j++; 
                else
                    break;  
            }
            if(j == needle.length()) {
                ans = i;
                break;
            }
        } 
        return ans;
    }
}