package com.chinasoft.tree;

public class TreeNodeUtil
{
    //先序   参数rootTreeNode:根节点
    public static void beforeVisit(TreeNode rootTreeNode){
        if(rootTreeNode!=null){
            //访问根节点
            System.out.println(rootTreeNode.getValue());
            //访问左节点
            TreeNode leftTreeNode=rootTreeNode.getLeftTreeNode();
            if(leftTreeNode!=null){
                beforeVisit(leftTreeNode);
            }
            //访问右节点
            TreeNode rightTreeNode=rootTreeNode.getRightTreeNode();
            if(rightTreeNode!=null){
                beforeVisit(rightTreeNode);
            }
        }
    }

    //中序 参数rootTreeNode:根节点
    public static void middleVisit(TreeNode rootTreeNode) {
        if (rootTreeNode != null) {
            //访问左节点
            TreeNode leftTreeNode = rootTreeNode.getLeftTreeNode();
            if(leftTreeNode!=null){
                middleVisit(leftTreeNode);
            }
            //访问根节点
            System.out.println(rootTreeNode.getValue());
            //访问右节点
            TreeNode rightTreeNode = rootTreeNode.getRightTreeNode();
            if(rightTreeNode!=null){
                middleVisit(rightTreeNode);
            }
        }
    }

    //后序 参数rootTreeNode:根节点
    public static void latterVisit(TreeNode rootTreeNode)
    {
        if(rootTreeNode!=null) {
            //访问左节点
            TreeNode leftTreeNode = rootTreeNode.getLeftTreeNode();
            if(leftTreeNode!=null){
                latterVisit(leftTreeNode);
            }
            //访问右节点
            TreeNode rightTreeNode = rootTreeNode.getRightTreeNode();
            if(rightTreeNode!=null){
                latterVisit(rightTreeNode);
            }
            //访问根节点
            System.out.println(rootTreeNode.getValue());
        }
    }
}
