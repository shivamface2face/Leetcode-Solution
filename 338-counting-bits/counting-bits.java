class Solution {
    public int[] countBits(int n) {

        int ans[]=new int[n+1];

        for(int i=0;i<=n;i++){
            ans[i]=count(i);
        }

        return ans;
        
    }
public static int count(int x){
    int count=0;
    for(int i=0;i<32;i++){
        if((x&(1<<i))!=0){
            count++;
        }
    }
    return count;
}

}