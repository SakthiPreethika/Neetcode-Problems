/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        preorder(root,sb);
        return sb.toString();
        
    }
    public void preorder(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("#,");
            return;
        }
        sb.append(root.val).append(",");
        preorder(root.left,sb);
        preorder(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String []part=data.split(",");
        int index[]={0};
        return build(part,index);
        
    }
    public TreeNode build(String[] val,int[] index){
        if(val[index[0]].equals("#")){
            index[0]++;
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(val[index[0]]));
        index[0]++;
        root.left=build(val,index);
        root.right=build(val,index);
        return root;
    }
}
