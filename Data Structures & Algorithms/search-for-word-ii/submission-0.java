class Solution {
    class Node{
        Node child[]=new Node[26];
        String word;
    }
    Node root=new Node();
    List<String> ans=new ArrayList<>();
    public List<String> findWords(char[][] board, String[] words) {
        for(String s:words){
            Node curr=root;
            for(char c:s.toCharArray()){
                int index=c-'a';
                if(curr.child[index]==null){
                    curr.child[index]=new Node();
                }
                curr=curr.child[index];

            }
            curr.word=s;
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                    dfs(board,i,j,root);
            }
        }
        return ans;
            
    }
    public void dfs(char[][] board,int r,int c,Node root){
        if(r<0 || r>=board.length || c<0 || c>=board[0].length){
            return;
        }
        char ch=board[r][c];
        if(ch=='#'){
            return;
        }
        Node next=root.child[ch-'a'];
        if(next==null){
            return;
        }
        if(next.word!=null){
            ans.add(next.word);
            next.word=null;
        }
        board[r][c]='#';
        dfs(board,r-1,c,next);
        dfs(board,r+1,c,next);
        dfs(board,r,c-1,next);
        dfs(board,r,c+1,next);
        board[r][c]=ch;
    }
}
