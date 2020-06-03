package april2020;

import java.util.ArrayList;
import java.util.List;

public class DiameterBinaryTree11 {

    /**
     * Definition for a binary tree node.
     * }
     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        List<TreeNode> getChildren(TreeNode node){
            ArrayList<TreeNode> children = new ArrayList<>();
            children.add(node.left);children.add(node.right);
            return children;
        }
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        return -1;
    }

    public static int sumOfHeights(TreeNode root) {
        TreeNode current = root;
        if(root == null){
            return -1;
        }
        int leftSum = 0, rightSum = 0;
        while(current.left != null){
            leftSum++;
            current = current.left;
        }
        current = root;
        while(current.right != null){
            rightSum++;
            current = current.right;
        }
        return leftSum + rightSum;

    }


    public static void main(String[] arsgs){
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);

        //        1
        //        / \
        //        2  3
        //       / \
        //     4   5
        //     /\
        //    6  7
        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        four.left = six;
        four.right = seven;

        //System.out.println(diameterOfBinaryTree(one));
        System.out.println(sumOfHeights(one));

    }
}
