class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()){
            return "";
        }
        StringBuilder encodedString = new StringBuilder();
        List<Integer> sizesOfStrs = new ArrayList<>();
        for (String str : strs){
            sizesOfStrs.add(str.length());
        }
        for (Integer size: sizesOfStrs){
            encodedString.append(size);
            encodedString.append(',');
        }
        encodedString.append('#');
        for(String str: strs){
            encodedString.append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedString = new ArrayList<>();
        if(str.length() == 0){
            return decodedString;
        }
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#'){
            StringBuilder current = new StringBuilder();
            while(str.charAt(i) != ','){
                current.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(current.toString()));
            i++;
        }
        i++;
        for (int size : sizes){
            decodedString.add(str.substring(i, i + size));
            i += size;
        }
        return decodedString;
    }
}
