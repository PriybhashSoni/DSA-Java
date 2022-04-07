class Solution {
    public boolean chP(String s,int low,int high)
    {
        while(low<high)
        {
            if(s.charAt(low)!=s.charAt(high))
            {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
         int low=0;
        int high=s.length()-1;
        while(low<high)
        {
            if(s.charAt(low)!=s.charAt(high))
            {
                return chP(s,low,high-1) || chP(s,low+1,high) ;
            }
            low++;
            high--;
        }
        return true;
    }
}
