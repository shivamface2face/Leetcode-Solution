class Solution {
    public boolean isPalindrome(String str) {
       str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       int s=0;
       int e=str.length()-1;

       boolean ans=check(str,s,e);

      
        return ans;
    }

    static boolean check(String str,int s,int e){
            if(s>=e) return true;
         if(str.charAt(s)!=str.charAt(e)) return false;
         return check(str,s+1,e-1);
    }
}