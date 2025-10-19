// Last updated: 10/19/2025, 4:00:32 PM
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
class Solution {
    public TreeNode buildTree(int[] inOrder, int[] postOrder) {
        HashMap<Integer,Integer> inOrderMap = new HashMap<>();
	int n = inOrder.length;
	for (int i=0 ; i<n ; i++){
		inOrderMap.put(inOrder[i],i);
	}
	return buildTree(inOrderMap,inOrder,0,n-1,postOrder,0,n-1);
    }
    public TreeNode buildTree(HashMap<Integer,Integer> inOrderMap, int[] inOrder, int stIdxIn , int endIdxIn, int[] postOrder, int stIdxPos, int endIdxPos){
	if (stIdxPos>endIdxPos || stIdxIn>endIdxIn){
		return null;
	}
	TreeNode root = new TreeNode(postOrder[endIdxPos]);
	int pos = inOrderMap.get(postOrder[endIdxPos]);
	int cntEle = pos-stIdxIn;
	root.left = buildTree(inOrderMap,inOrder,stIdxIn,pos-1,postOrder,stIdxPos,stIdxPos+cntEle-1);
	root.right = buildTree(inOrderMap,inOrder,pos+1,endIdxIn,postOrder,stIdxPos+cntEle,endIdxPos-1);
	return root;

}
}