import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer>set = new HashSet<>();

        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
         n =NextNumber(n);
        }
        return true;
    }
    private int NextNumber(int num){
        int result=0;
        while(num>0){
            int digit=num%10;
            result=result+ digit*digit;
            num=num/10;
        }
        return result;
    }
    
}