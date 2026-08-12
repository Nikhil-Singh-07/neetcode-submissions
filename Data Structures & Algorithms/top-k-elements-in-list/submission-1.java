class Solution {
    private int sort(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b){
        return b.getValue() - a.getValue();
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int element : nums){
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> arr = new ArrayList<>(map.entrySet());
        arr.sort(this::sort);
        int[] res = new int[k];
        for (int i = 0; i < k; i++){
            res[i] = arr.get(i).getKey();
        }
        return res;
        
    }
}
