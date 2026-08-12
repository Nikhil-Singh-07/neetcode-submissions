class Solution {

    private String sort(String str){
        char[] array = str.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < strs.length; i++){
            String sortedString = sort(strs[i]);
            if (mp.containsKey(sortedString)){
                List<String> str = mp.get(sortedString);
                str.add(strs[i]);
                mp.put(sortedString, str);

            }
            else{
                List<String> str = new ArrayList<>();
                str.add(strs[i]);
                mp.put(sortedString, str);
            }
        }
        for (List<String> str: mp.values()){
            res.add(str);
        }
        return res;

    }
}
