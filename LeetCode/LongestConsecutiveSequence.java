class Solution {
    public int longestConsecutive(int[] nums) {
        int count=1;
        int max=1;
        if(nums.length<2)
        {
            return nums.length;
        }
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]==1)
            {  
                count++;
                 
            }
            else if(nums[i]-nums[i-1]==0)
            {
                continue;
            }
            else
            {   
                max=Math.max(max,count);
                count=1;
            }
        }
        return Math.max(max,count);
    }
}
