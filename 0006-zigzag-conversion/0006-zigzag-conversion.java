class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] arr = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++) {
            arr[i] = new StringBuilder();
        }
        int i = 0;
        while(i < s.length()) {
            for(int index=0; index<numRows && i<s.length(); index++) {
                arr[index].append(s.charAt(i++)); 
            }
            for(int index=numRows-2; index>0 && i<s.length(); index--) {
                arr[index].append(s.charAt(i++));
            }
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder str : arr) {
            res.append(str);
        }
        return res.toString();
    }
}