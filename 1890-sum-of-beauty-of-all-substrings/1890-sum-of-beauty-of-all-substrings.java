class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int[] freq = new int[26];
        int sum = 0;

        for(int i=0; i<n; i++) {
            Arrays.fill(freq, 0);
            for(int j=i; j<n; j++) {
                int index = s.charAt(j)-'a';
                freq[index]++;
                
                int maxFreq = 0, minFreq = Integer.MAX_VALUE;
                for(int k=0; k<26; k++) {
                    if(freq[k] > 0) {
                        minFreq = Math.min(freq[k], minFreq);
                        maxFreq = Math.max(freq[k], maxFreq);
                    }
                }

                int beauty = maxFreq - minFreq;
                sum += beauty;
            }
        }
        return sum;
    }
}