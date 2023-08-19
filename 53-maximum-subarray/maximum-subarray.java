class Solution {
    public int maxSubArray(int[] nums) {
         int bag_sum=0;
       int max_sum=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++)
     {
         bag_sum=bag_sum+nums[i];

         if(bag_sum>max_sum){
             max_sum=bag_sum;
         }
         if(bag_sum<0){
             bag_sum=0;
         }

   }   
   return max_sum;
    }
}