class Solution {
    public int dominantIndex(int[] nums) {
        
        int large = nums[0];
        int index = 0;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > large){
                large = nums[i];
                index = i;
            }
        }

        for(int j = 0; j < nums.length; j++){
            if(j != index && large < 2 * nums[j]){
                return -1;
            }
        }
        
        return index;


    }
}