class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
         int count=0;
         int n=arr.length;
         int ans[]=new int[n];
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 if(arr[i]>arr[j] && j!=i){
                     count++;
                 }
             }
             ans[i]=count;
             count=0;
         }

         return ans;

    }
}