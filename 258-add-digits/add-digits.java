class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>0){
            int dg=num%10;
            sum=sum+dg;
            if(sum>9){
                sum=(sum%10)+(sum/10);

            }
            num=num/10;
        }
        return sum;
    }
}