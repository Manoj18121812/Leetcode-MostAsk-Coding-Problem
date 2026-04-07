class Solution {
    public String longestPalindrome(String s) {

      String sub="";

      for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
            String ans=s.substring(i,j+1);
            if(isPalindrome(ans)){
                if(ans.length()>sub.length()){
                    sub=ans;
                }
            }
        }
      }
      return sub;
    }

    private boolean isPalindrome(String str){

        int left=0;
        int right=str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}