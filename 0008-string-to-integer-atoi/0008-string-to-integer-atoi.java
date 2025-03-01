class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        int n = s.length();
        long digit = 0;

        if(n == 0)
            return 0;

        while(i < n && s.charAt(i) == ' ')
            i++;
        
        if(i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while(i < n && (s.charAt(i) >= 48 && s.charAt(i) <= 57)) {
            digit = digit * 10 + (s.charAt(i) - '0');

            if(digit * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(digit * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }

        return (int)digit * sign;
    }
}