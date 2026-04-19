class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int nums3[]= new int[nums1.length + nums2.length];
        int i=0;

        for(int num:nums1){
            nums3[i++]=num;
        }

        for(int num:nums2){
            nums3[i++]=num;
        }

        Arrays.sort(nums3);

        int n=nums3.length;

    if(n%2==1){
        return nums3[n/2];
    }else{
        return (nums3[n/2-1]+nums3[n/2])/2.0;
    }

    }
}