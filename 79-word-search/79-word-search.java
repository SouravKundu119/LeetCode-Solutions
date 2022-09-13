class Solution {
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        
        //Since the word can start at any grid
        //So we have to search every grid once to get the starting grid
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word.charAt(0) && DFS_helper(i,j,row,col,board,word,0)==true){
                    return true;
                }
            }
        }
        return false;
    }
    
    //Trying to get the whole word from the starting grid
    public boolean DFS_helper(int i,int j,int row,int col,char[][] board,String word,int index){
        while(index!=word.length()){
            char cur=word.charAt(index);
            
            //base case for out of bounds
            if(i<0 || j<0 || i>=row || j>=col)
                return false;
            //next base case if the current char is not matching so we can move to the next grid
            if(board[i][j]!=cur)
                return false;
            
            //this is the starting point and from here on we should start the search
            board[i][j]='0';//Mark this as visited by cancelling the value
            index++;
            
            //search all the neighbours
            boolean found = ( DFS_helper(i, j-1, row, col, board, word, index) ||
                              DFS_helper(i-1, j, row, col, board, word, index) ||
                              DFS_helper(i, j+1, row, col, board, word, index) ||
                              DFS_helper(i+1, j, row, col, board, word, index));
            
            board[i][j]=cur;//not changing the board
            return found;
        }
        return true;
    }
}