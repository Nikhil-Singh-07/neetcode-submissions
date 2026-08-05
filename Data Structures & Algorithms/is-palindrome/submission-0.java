class Solution {

    private char isLowerCase(char ch){
        if (ch >= 'A' && ch <= 'Z' ){
            return (char)(ch + 32);
        }
        return ch;
    }

    private boolean isAlphaNumeric (char ch){
        return (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'|| ch >= '0'
        && ch <= '9');
    }

    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while (low < high){
            while (low < high && !isAlphaNumeric(s.charAt(low))){
                low++;
            }
            while (low < high && !isAlphaNumeric(s.charAt(high))){
                high--;
            }
           
            if (isLowerCase(s.charAt(low)) == isLowerCase(s.charAt(high))){
                low++;
                high--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
