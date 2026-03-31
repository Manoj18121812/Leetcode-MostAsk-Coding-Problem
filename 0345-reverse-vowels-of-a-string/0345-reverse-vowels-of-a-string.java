class Solution {
    public String reverseVowels(String s) {
    char chars[]=s.toCharArray();

    int left=0;
    int right=chars.length-1;

    Set<Character>set = Set.of('a','e','i','o','u','A','E','I','O','U');

    while(left<right){

        while(left<right && !set.contains(chars[left])) left++;
        while(left<right && !set.contains(chars[right])) right--;

        if(left<right){
            char temp = chars[left];
            chars[left]=chars[right];
            chars[right]= temp;

            left++;
            right--;
    }
    }
    return new String(chars);
    }
}
