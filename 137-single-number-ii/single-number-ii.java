class Solution {
    public int singleNumber(int[] nums) {
          Arrays.sort(  nums);

int ans=-1;
int size=nums.length;
for(int i=0;i<nums.length;i=i+3){
	if(i==(nums.length-1)){
		ans=nums[i];
	}else if(nums[i]!=nums[i+2]){
		ans=nums[i];
		break;
	}
}
return ans;

        
    }
}