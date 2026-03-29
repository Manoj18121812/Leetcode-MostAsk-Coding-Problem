class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Set<Integer>set = new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        int missing =1;
        while(true){
            if(!set.contains(missing)){
                return missing;
            }else{
                missing++;
            }
        }
        
    }
}