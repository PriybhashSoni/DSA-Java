class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int x = grid.length ;
        int y = grid[0].length;
        int mod = x * y;
        k = k % mod;
        Integer[][] newGrid = new Integer[x][y];
        for (int i = 0 ; i < mod; i++) {
            int pre = (i - k + mod) % mod;
            newGrid[i / y][i % y] = grid[pre / y][pre % y];
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            ans.add(Arrays.asList(newGrid[i]));
        }
        return ans;
    }
}
