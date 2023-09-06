class Solution {
    public String convertToBase7(int decimalNumber) {
    //    	String ans="";
    //     if(decimalNumber<0){
    //         int temp=Math.abs(decimalNumber);
    //         	 while (temp > 0) {
    //         int remainder = temp % 7;
    //         ans = remainder + ans;
    //         temp /= 7;
    //     }

    //      return  (ans) ;
    //     }else{
	//  while (decimalNumber > 0) {
    //         int remainder = decimalNumber % 7;
    //         ans = remainder + ans;
    //         decimalNumber /= 7;
    //     }
    //     return ans;
    //     }
    // }

     return Integer.toString(decimalNumber,7);

    }
}