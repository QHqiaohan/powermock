package com.chinasoft.tree;

import org.junit.Test;

public class TreeNodeTest2 {
    /**
     *                                 二叉树
     *                                   10
     *              9                                            20
     *      8               0                              15            35
     *   7              1         2
     *               5
     */
    @Test
    public void testMiddleVisit()
    {
        TreeNode t10=new TreeNode(10);
        TreeNode t9=new TreeNode(9);
        TreeNode t8=new TreeNode(8);
        TreeNode t7=new TreeNode(7);
        TreeNode t0=new TreeNode(0);
        TreeNode t1=new TreeNode(1);
        TreeNode t5=new TreeNode(5);
        TreeNode t2=new TreeNode(2);
        TreeNode t20=new TreeNode(20);
        TreeNode t15=new TreeNode(15);
        TreeNode t35=new TreeNode(35);

        t10.setLeftTreeNode(t9);
        t10.setRightTreeNode(t20);
        t9.setLeftTreeNode(t8);
        t9.setRightTreeNode(t0);
        t8.setLeftTreeNode(t7);
        t0.setLeftTreeNode(t1);
        t0.setRightTreeNode(t2);
        t1.setLeftTreeNode(t5);
        t20.setLeftTreeNode(t15);
        t20.setRightTreeNode(t35);

        System.out.println("中序................");
        TreeNodeUtil.middleVisit(t10);
        System.out.println("后序................");
        TreeNodeUtil.latterVisit(t10);
    }
}
