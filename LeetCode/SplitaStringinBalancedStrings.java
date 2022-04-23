class Solution {
    public int balancedStringSplit(String s) {
        int l=0,r=0,ans=0;
        if(s.length()==0)
        {
            return 0;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            {
                r++;
            }
           else if(s.charAt(i)=='L')
            {
                l++;
            }
             if(r==l)
            {
                ans++;
            }
        }
        return ans;
    }
}
