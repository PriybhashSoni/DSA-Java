class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int[] results=new int[2];
        Map<Integer, Integer>map=new HashMap<Integer, Integer>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target - numbers[i])){
                results[1]=i;
                results[0]=map.get(target-numbers[i]);
                return results;
            }
               map.put(numbers[i],i);
        }
        return results;
    }
}
