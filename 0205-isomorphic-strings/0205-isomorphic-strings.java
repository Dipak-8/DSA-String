class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] A = new int[256];
        int[] B = new int[256];

        Arrays.fill(A, -1);
        Arrays.fill(B, -1);

        for(int i=0; i<s.length(); i++) {
            char st = s.charAt(i);
            char tt = t.charAt(i);

            if(A[st] == -1 && B[tt] == -1) {
                A[st] = tt;
                B[tt] = st;
            } else if(A[st] != tt && B[tt] != st) {
                return false;
            }
        }
        return true;
    
    }
}