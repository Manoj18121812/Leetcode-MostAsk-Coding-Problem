class Solution {
    public int largestAltitude(int[] gain) {
        
        int altitude =0;
        int max=0;

        for(int num:gain){
            altitude= altitude +num;
            max= Math.max(max,altitude);
        }
        return max;
    }
}