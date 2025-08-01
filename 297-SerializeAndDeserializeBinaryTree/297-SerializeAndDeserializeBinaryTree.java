// Last updated: 8/1/2025, 7:09:24 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root==null){
            return "";
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i=0 ; i<size ; i++){
                TreeNode curr = queue.poll();
                if (curr==null){
                    sb.append("#,");
                }
                else{
                    sb.append(curr.val);
                    sb.append(',');
                    queue.offer(curr.left);
                    queue.offer(curr.right);
                }
            }
        }
        return sb.substring(0,sb.length()-1).toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()){
            return null;
        }
        String[] arr = data.split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.valueOf(arr[0]));
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty()){
            TreeNode curr = queue.poll();
            if (arr[i].charAt(0)=='#'){
                curr.left = null;
            }
            else{
                curr.left = new TreeNode(Integer.valueOf(arr[i]));
                queue.offer(curr.left);
            }
            i++;
            if (arr[i].charAt(0)=='#'){
                curr.right = null;
            }
            else{
                curr.right = new TreeNode(Integer.valueOf(arr[i]));
                queue.offer(curr.right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));