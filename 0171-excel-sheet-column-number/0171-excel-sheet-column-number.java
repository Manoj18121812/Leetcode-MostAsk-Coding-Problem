class Solution {
    public int titleToNumber(String col) {
      int result=0;
      for(int i=0;i<col.length();i++){

            int ch = col.charAt(i);
            int value= ch-'A'+1;
            result= result* 26+value;
      }
      return result;
    }
}