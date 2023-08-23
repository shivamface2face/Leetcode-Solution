class Solution {
    public int search(int[] arr, int x) {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==x){
                ans= mid;
            }
             if(arr[start]<=arr[mid]){
                if(arr[start]<=x && x<=arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(arr[mid]<=x && arr[end]>=x){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }

        }
     return ans;
        
    }
}