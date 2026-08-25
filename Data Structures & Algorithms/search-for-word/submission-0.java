class Solution {
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(dfs(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,String word,int r,int c,int index){
        if(r<0 || r>board.length-1 ||c<0 || c>board[0].length-1){
            return false;
        }
        if(board[r][c]!=word.charAt(index)){
            return false;
        }
        if(index==word.length()-1){
            return true;
        }
        char temp=board[r][c];
        board[r][c]='#';
        boolean found=dfs(board,word,r+1,c,index+1)||
                      dfs(board,word,r-1,c,index+1)||
                      dfs(board,word,r,c+1,index+1)||
                      dfs(board,word,r,c-1,index+1);
        board[r][c]=temp;
        return found;
    }
}
