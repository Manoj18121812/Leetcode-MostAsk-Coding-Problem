class Solution {
    public String multiply(String num1, String num2) {
        /*
        int num1 = Integer.parseInt(num1);
        int num2 = Integer.parseInt(num2);
        double num3= num1*num2;
        return String.valueOf(num3);*/

        int m = num1.length();
        int n = num2.length();
        int arr[] = new int[m+n];

        for(int i=m-1;i>=0;i--){
            int d1= num1.charAt(i)-'0';;
            for(int j =n-1;j>=0;j--){
                int d2=num2.charAt(j)-'0';

            int mul= d1 * d2;//18

            int sum = mul + arr[i+j+1];//18
            arr[i+j+1] = sum%10;//8
            arr[i+j] = arr[i+j]+sum/10;//1

            }
        }
        StringBuilder sb = new StringBuilder();

        for(int r:arr){
            if(sb.length()==0 & r==0) continue;
            sb.append(r);
        }

        return sb.length()==0 ? "0" :sb.toString();

    }
}