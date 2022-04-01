class Solution {
    public int removeElement(int[] nums, int val) {
       
        int[] newarr=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                newarr[j++]=nums[i];
            }
        }
        
        for(int i=0; i<j; i++){
            nums[i]=newarr[i];
        }
        return j;
    }
}
