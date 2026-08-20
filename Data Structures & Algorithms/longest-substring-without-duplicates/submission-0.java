class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int count = -1;
        int maxCount = 0;
        for (int i = 0; i < s.length(); i++){
            if (mp.containsKey(s.charAt(i))){
                if(count < mp.get(s.charAt(i))){
                    count = mp.get(s.charAt(i));

                }
            }
            mp.put(s.charAt(i), i);
            maxCount = Math.max(maxCount, i - count);
        }
        return maxCount;
    }
}
