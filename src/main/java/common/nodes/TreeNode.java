package common.nodes;


import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    public int getVal() {
        return val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static List<TreeNode> getChildren(TreeNode node){
        ArrayList<TreeNode> children = new ArrayList<>();
        children.add(node.left);
        children.add(node.right);
        return children;
    }

    //        1
    //        / \
    //        2  3
    //       / \
    //     4   5
    //     /\
    //    6  7
    public static TreeNode getBasicTree(){
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);

        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        four.left = six;
        four.right = seven;

        return one;
    }


}
