class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> freqMap = new HashMap<>();
        List<Character>[] array = new ArrayList[s.length()+1];

        for(char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
        }

        freqMap.keySet().forEach(
            c -> {
                if(array[freqMap.get(c)] == null) {
                    array[freqMap.get(c)] = new ArrayList();
                }
                array[freqMap.get(c)].add(c);
            }
        );

        for(int i=array.length-1; i>0; i--) {
            if(array[i] != null) {
                for(char c : array[i]) {
                    for(int j=0; j<i; j++) {
                        sb.append(c);
                    }
                }
            }
        }

       return sb.toString(); 
    }
}