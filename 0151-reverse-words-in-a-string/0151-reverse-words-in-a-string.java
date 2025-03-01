class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<String>();
        s += " ";
        String words = "";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                if(!words.isEmpty()){
                    st.push(words);
                    words = "";
                }
            }
            else
                words += s.charAt(i);
        }
        
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()) {
            ans.append(st.pop());
            if(!st.isEmpty())
                ans.append(" ");
        }
        return ans.toString();
    }
}