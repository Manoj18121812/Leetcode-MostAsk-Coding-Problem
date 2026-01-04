class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        Set<Integer>set = new HashSet<>();
        List<Integer>list= new ArrayList<>();

        for(int num : nums){
            if(!set.add(num)){
                list.add(num);
            }
        }
        return list;
    }
}