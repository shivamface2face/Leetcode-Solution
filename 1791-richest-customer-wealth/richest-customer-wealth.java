class Solution {
    public int maximumWealth(int[][] accounts) {
          int n=accounts.length;
        int m=accounts[0].length;
        int sum=0;
        int max_Sum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int Cur_Sum=0;
            for(int j=0;j<m;j++){
                Cur_Sum+=accounts[i][j];
            }
            sum=Math.max(sum,Cur_Sum);

        }
        return sum;
    }
}