class Solution {
    public int reverse(int x) {
        
        if(x > 2147483647 || x<-2147483648)
            return 0;
        int p=x;
        int n=0;
    while(p!=0)
    {
        p=p/10;
        n++;
    }     
        int res = 0;
        p=x;
        while(p!=0)
        {
            int mod=p%10;
            p=p/10;
            res+=Math.pow(10,n-1)*mod;
            n--;
        }
        
        if(res<2147483647 && res >-2147483648){
            return res;
        }
        return 0;
    }
}
