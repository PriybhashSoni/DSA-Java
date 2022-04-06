class Solution {
    public int minSplit(int[] nums,int maxV)
    {
        int sum=0;
        int Split=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]+sum<=maxV)
            {
                sum+=nums[i];
            }
            else
            {
                sum=nums[i];
                Split+=1;
            }
        }
        return Split+1;
    }
    public int splitArray(int[] nums, int m) {
        int res=0;
        int l=nums[0];
        int r=0;
        for(int i=0; i<nums.length; i++){
            
            if(l<= nums[i]){
                l=nums[i];
            }
            r+=nums[i];
        }
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(minSplit(nums,mid)<=m)
            {
                r=mid-1;
                res=mid;
            }
            else
            {
                l=mid+1;
            }
        }
        
        return res;
    }
}
