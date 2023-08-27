class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(arr[j]==1){
                    count++;
                }else{
                    break;
                }
            }
            ans=Math.max(ans,count);
        }

        return ans;
        
    }
}