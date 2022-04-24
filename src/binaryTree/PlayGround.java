package binaryTree;

public class PlayGround {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left1 = new TreeNode(9);
        TreeNode right1 = new TreeNode(20);
        TreeNode left2 = new TreeNode(15);
        TreeNode right2 = new TreeNode(7);

        root.left = left1;
        root.right = right1;

        right1.left = left2;
        right1.right = right2;

        DephtLevelTree maxDepthOfBinaryTree = new DephtLevelTree();
        maxDepthOfBinaryTree.maxDepth(root);


    }
}
