class Solution {
    class Pair{
        int key; 
        int value;
        Pair(int k, int val)
        {
            key = k;
            value = val;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> py= new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            py.put(nums[i], py.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.key - b.key);
        for(Map.Entry<Integer, Integer> e: py.entrySet())
        {
            int key = e.getValue();
            int value = e.getKey();
            pq.offer(new Pair(key, value));
        }
        while(pq.size() > k)
        {
            pq.poll();
        }
        int[] ans = new int[k];
        int i = 0;
        while(!pq.isEmpty())
        {
            Pair a = pq.poll();
            ans[i] = a. value;
            i++;
        }
        return ans;
    }
}
