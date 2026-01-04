class Solution {
    public int lengthOfLongestSubstring(String s) {

       int left =0;
       int right =0;
       int maxLength=0;
       int n = s.length();

Set<Character> set = new HashSet<>();

       while(right<n){
        char current = s.charAt(right);

        if(!set.contains(current)){
            set.add(current);
            maxLength= Math.max(maxLength,right-left+1);
            right++;
        }else{
            set.remove(s.charAt(left));
            left++;
        }


       } 
       return maxLength;
    }
}
