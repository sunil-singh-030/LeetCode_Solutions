// Last updated: 10/19/2025, 2:03:12 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> distanceK(TreeNode root, TreeNode tar, int k) {
        NodesAtDisk(root,tar,k);
	    return ans;

    }
    public void NodesAtDisk(TreeNode root, TreeNode tar, int k){
	if (root==null){
		return;
	}
	if (root.val==tar.val){
		addNodes(root,k);
		return ;
	}
	int leftTreeDis = disFromTar(root.left,tar);
    //System.out.println(leftTreeDis);
	if (leftTreeDis!=-1){
		if (leftTreeDis+1==k){
			ans.add(root.val);
		}
		else{
			addNodes(root.right,k-leftTreeDis-2);
		}
		NodesAtDisk(root.left,tar,k);
	}
	else{
		int rightTreeDis = disFromTar(root.right,tar);
		if (rightTreeDis+1==k){
			ans.add(root.val);
		}
		else{
			addNodes(root.left,k-rightTreeDis-2);
		}
		NodesAtDisk(root.right,tar,k);

	}

}

    public int disFromTar(TreeNode curr, TreeNode tar){
	if (curr==null){
		return -1;
	}
	if (curr.val==tar.val){
		return 0;
	}
	int leftDis = disFromTar(curr.left,tar);
	int rightDis = disFromTar(curr.right,tar);
	if (leftDis!=-1){
		return leftDis + 1;
	}
	if (rightDis!=-1){
		return rightDis + 1;
	}
	return -1;
}

public void addNodes(TreeNode curr, int dis){
	if (curr==null){
		return;
	}
	if (dis==0){
		ans.add(curr.val);
		return;
	}
	addNodes(curr.left,dis-1);
	addNodes(curr.right,dis-1);
}
}
