class Solution {
    public int trap(int[] height) {
        //[0,2,2,2,3,3,3,3,3,3,3]
        //[3,3,3,3,3,3,3,3,3,2,1]
        int size = height.length;

        int[] left = new int[size];
        int[] right = new int[size];
        left[0] = height[0];
        right[size - 1] = height[size - 1];
        int result = 0;
        for (int i = 1; i < size; i++){
            left[i]= Math.max(left[i-1], height[i]);

        }
        for (int i = size - 2; i >= 0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        }
        for (int i = 0; i < size; i++){
            result += Math.min(left[i], right[i]) - height[i];
        }
        return result;

    }
}
