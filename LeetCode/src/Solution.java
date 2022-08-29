import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public boolean isValidBST(TreeNode root) {
        return inOrderCheck(root);
    }

    private boolean inOrderCheck(TreeNode root) {
        Deque<TreeNode> s = new LinkedList<>();
        while(root != null || !s.isEmpty()) {
            if(root == null) {
                root = s.peekLast();
                root = root.right;
            }else {
                s.addLast(root);
                root = root.left;
            }
        }
    }
}