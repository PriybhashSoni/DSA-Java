class Solution {
    public int findDuplicate(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        
        Iterator mapIterator = map.entrySet().iterator();
        
        while(mapIterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)mapIterator.next();
            int freq = ((int)mapElement.getValue());
            
            if(freq > 1){
                return (int)mapElement.getKey();
            }
        }
        return -1;
    }
}
