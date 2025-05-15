class Solution {
    public String intToRoman(int num) {
        int[] intArr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strArr = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; 

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=intArr.length-1; i++) {
            while(num >= intArr[i]) {
                sb.append(strArr[i]);
                num -= intArr[i];
            }
        }
        return sb.toString();
    }
}