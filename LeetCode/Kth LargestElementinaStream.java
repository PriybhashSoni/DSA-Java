class KthLargest {

    private PriorityQueue<Integer> pq;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.pq = new PriorityQueue<>();
        this.k = k;
        for(int i=0; i<nums.length; i++) {
            add(nums[i]);
        }
    }
    
    public int add(int val) {
        pq.offer(val);             
        if(pq.size() > k)        
            pq.poll();            
        
        return pq.peek();      
    }
}
