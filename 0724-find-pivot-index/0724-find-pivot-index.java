class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;

        for(int num:nums){
            totalsum=totalsum+num;
        }
        int leftSum=0;

        for(int i=0;i<nums.length;i++){
            int rightSum= totalsum -leftSum -nums[i];

            if(leftSum==rightSum){
                return i;
            }
            leftSum = leftSum + nums[i];
        }

        return -1;
    }
}