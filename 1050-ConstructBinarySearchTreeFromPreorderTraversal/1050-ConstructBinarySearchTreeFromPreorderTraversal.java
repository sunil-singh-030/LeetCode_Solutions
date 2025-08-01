// Last updated: 8/1/2025, 7:06:18 AM
class Pair{
    TreeNode curr;
    int leftb;
    int rightb;
    public Pair(TreeNode curr,int lb, int rb){
        this.curr = curr;
        this.leftb = lb;
        this.rightb = rb;
    }
}
class Solution {

    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        int[] inorder = preorder.clone();
        Arrays.sort(inorder);
        HashMap<Integer,Integer> inorderMap = new HashMap<>();
        for (int i=0 ; i<n ; i++){
            inorderMap.put(inorder[i],i);
        }
        return buildTree(preorder,0,n-1,inorder,0,n-1,inorderMap);
    }
    public static TreeNode buildTree(int[] preorder, int stpre, int endpre, int[] inorder, int stin, int endin, HashMap<Integer,Integer> valIndex){
        if (stpre>endpre || stin>endin){
            return null;
        }
        TreeNode root = new TreeNode(preorder[stpre]);
        int rootIndex = valIndex.get(preorder[stpre]);
        int sizeleftTree = rootIndex-stin;

        root.left = buildTree(preorder,stpre+1,stpre+sizeleftTree,inorder,stin,rootIndex-1,valIndex);
        root.right = buildTree(preorder,stpre+sizeleftTree+1,endpre,inorder,rootIndex+1,endin,valIndex);
        return root;
    }

    
}
