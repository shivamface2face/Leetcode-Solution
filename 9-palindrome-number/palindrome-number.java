class Solution {
    public boolean isPalindrome(int n) {
      
        // int rev=0;

        // while(x>0){
        //     int dig=x%10;
        //     rev=(rev*10)+dig;
        //     x=x/10;
        // }
        int ol=n;
         int rev = 0;
        // remainder
        int rem;
  
        while (ol > 0) {
            rem = ol % 10;
            rev = (rev * 10) + rem;
            ol = ol / 10;
        }

        if(rev==n){
            return true;
        }

            return false;
        
        
        
    }
}