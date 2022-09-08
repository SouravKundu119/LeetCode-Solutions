class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int res[][]=new int[n-2][m-2];
        for(int i=0;i+2<n;i++){
            for(int j=0;j+2<m;j++){
                for(int row=i;row<i+3;row++){
                    for(int col=j;col<j+3;col++){
                        res[i][j]=Math.max(res[i][j],grid[row][col]);
                    }
                }
            }
        }
        return res;
    }
}