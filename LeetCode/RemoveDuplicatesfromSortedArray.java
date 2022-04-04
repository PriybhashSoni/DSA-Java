class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> py=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            py.add(nums[i]);
        }
        int i=0;
        for(Integer item:py)
        {
            nums[i++]=item;
        }
        
        for(int j=0; j<i; j++){
            for(int k=0; k<i-j-1; k++){
                if(nums[k] >nums[k+1]){
                    int temp = nums[k];
                    nums[k]=nums[k+1];
                    nums[k+1]= temp;
                }
            }
        }
        
        return i;
    }
}
