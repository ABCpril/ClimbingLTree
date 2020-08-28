package binarytree;

public class IsSameTree {
    boolean same=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        traverse(p,q);
        return same;
    }

    public void traverse(TreeNode root1, TreeNode root2){
        if (root1==null){
            if (root2!=null){
                same=false;
            }
            return;
        }
        if (root2==null){
            same=false;
            return;
        }
        if (root1.val!=root2.val){
            same=false;
        }
        traverse(root1.left,root2.left);
        traverse(root1.right,root2.right);
    }
}



