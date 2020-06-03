package june2020;

import com.sun.source.tree.Tree;
import common.nodes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InvertedBT1 {

    public static void main(String[] asdsddss){
        TreeNode head = TreeNode.getBasicTree();
        //head = new InvertedBT1().invertTree(head);
        List<TreeNode> children = TreeNode.getChildren(head);
        Stack<TreeNode> childrenStack = new Stack<>();
        childrenStack.addAll(children);
        children.clear();
        while(!childrenStack.isEmpty()){
            TreeNode popped = childrenStack.pop();
            System.out.print('\t' + popped.getVal());
            children.addAll(TreeNode.getChildren(popped));
            System.out.println();

        }
    }
//    public TreeNode invertTree(TreeNode root) {
//
//    }
//
}
