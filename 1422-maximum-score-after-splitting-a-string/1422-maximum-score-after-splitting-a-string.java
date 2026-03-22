class Solution {
    public int maxScore(String s) {
        
        int totalonce=0;

        for(char c: s.toCharArray()){
            if(c=='1') totalonce++;
        }

        int leftZero=0;
        int rightOnce= totalonce;
        int maxScore=0;

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                leftZero++;
            }else{
                rightOnce--;
            }
            maxScore= Math.max(maxScore,leftZero+rightOnce);
        }
        return maxScore;
    }
}