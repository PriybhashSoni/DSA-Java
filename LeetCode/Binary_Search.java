class Solution {
    public int search(int[] nums, int target) {
        return BS(nums, 0, nums.length-1, target);
    }
    public int BS(int[] nums, int l, int h, int target){
        if(l<=h){
            int mid =(l+h)/2;
            if(nums[mid]>target){
                return BS(nums,l,mid-1, target);
            }
            else if(nums[mid]<target){
                return BS(nums, mid+1,h, target);
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
