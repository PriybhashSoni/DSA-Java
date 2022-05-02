class Solution {
    int l=0;
    int h=0;
    public void swap(int nums[],int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
       
    }
    public int[] sortArrayByParity(int[] nums) {
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]%2==0)
            {
               swap(nums,l,h);
               l++;
               h++;
            }
        else
        {
            h++;
        }
    }
     return nums;
    }
}
