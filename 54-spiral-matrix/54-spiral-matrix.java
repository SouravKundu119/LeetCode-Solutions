class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int M=matrix.length,N=matrix[0].length;
        int i=0,j=0;
        while(res.size()<M*N){
            
            while(j<N && matrix[i][j]>-200){
                res.add(matrix[i][j++]);
                matrix[i][j-1]=-200;
            }
            j--;
            i++;
            while(i<M && matrix[i][j]>-200){
                res.add(matrix[i++][j]);
                matrix[i-1][j]=-200;
            }
            i--;
            j--;
            
            while(j>=0 && matrix[i][j]>-200){
                res.add(matrix[i][j--]);
                matrix[i][j+1]=-200;
            }
            j++;
            i--;
            while(i>=0 && matrix[i][j]>-200){
                res.add(matrix[i--][j]);
                matrix[i+1][j]=-200;
            }
            
            i++;
            j++;
            
        }
        return res;
    }
}