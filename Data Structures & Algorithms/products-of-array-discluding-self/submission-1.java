class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] product = new int[size];
        if (size == 0){
            return product;
        }
        product[0] = 1;
        for (int i = 1; i < size; i++){
            product[i] = product[i-1] * nums[i-1];
        }
        int right = 1;
        for (int i = size - 1; i >= 0; i--){
            product[i] = product[i] * right;
            right = right * nums[i];
        }
        return product;
    }
}  
