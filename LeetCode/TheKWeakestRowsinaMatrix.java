class Solution {
    public int[] kWeakestRows(int[][] mat, int s) {
        int[][] arr=new int[mat.length][2];
         
         for (int i = 0; i < mat.length; i++){
             int sum=0;
             for(int j=0; j<mat[i].length; j++){
              sum+=mat[i][j];
             }
             arr[i][0]=sum;
             arr[i][1]=i;
         }
       
        
        
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length -i; j++) {
                if(arr[j-1][0] > arr[j][0]){
                    int temp1 = arr[j-1][0];
                    int temp2 = arr[j-1][1];
                    arr[j-1][0] = arr[j][0];
                    arr[j-1][1] = arr[j][1];
                    arr[j][0]=temp1;
                    arr[j][1]=temp2;
                }
            }
        }
        
        int[] ans= new int[s];
        for(int i=0;i<s;i++)
        {
            ans[i]=arr[i][1];
        }
        return ans;
    }
}
