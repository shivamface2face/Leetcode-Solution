class Solution {
    public int[] sortedSquares(int[] arr) {
        	int ans[]=new int[arr.length];

		for(int i=0;i<arr.length;i++){
			ans[i]=arr[i]*arr[i];
		}

		Arrays.sort(ans);
		return ans;
        
    }
}