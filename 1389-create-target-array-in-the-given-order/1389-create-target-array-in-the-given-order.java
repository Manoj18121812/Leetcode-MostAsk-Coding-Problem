class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

     List<Integer>list = new ArrayList<>();

     for(int i=0;i<nums.length;i++){
        list.add(index[i],nums[i]);
     }

     int result[]= new int[list.size()];

     for(int j=0;j<nums.length;j++){
        result[j]=list.get(j);
     }
    return result;
    }
}