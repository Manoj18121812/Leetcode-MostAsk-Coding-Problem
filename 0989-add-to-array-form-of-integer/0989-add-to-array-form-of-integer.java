class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

    LinkedList<Integer>list = new LinkedList<>();
    int i=num.length-1;

    while(i>=0||k>0){
        if(i>=0){
            k=k+num[i];
            i--;
        }
        list.addFirst(k%10);
        k=k/10;
    }
    return list;
    }
}