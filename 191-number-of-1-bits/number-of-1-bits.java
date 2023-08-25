public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int x) {
          int count=0;
    for(int i=0;i<32;i++){
        if((x&(1<<i))!=0){
            count++;
        }
    }
    return count;
    }
}