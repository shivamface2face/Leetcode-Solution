class Solution {
    public int largestAltitude(int[] gain) {
        int cSum=0;
        int mSum=0;
        for(int i=0;i<gain.length;i++){
            cSum+=gain[i];
            if(cSum>mSum){
                mSum=cSum;
            }
        }
        return mSum;
    }
}