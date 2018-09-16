package com.chinasoft.tree;

import org.junit.Before;
import org.junit.Test;

/**
 *                                              二叉树
 *                                                10
 *                            9                                         20
 *                      12          16                             15           35
 *                   1                                                       0       6
 */
public class TreeNodeTest
{
    private TreeNode treeNode1;
    private TreeNode treeNode2;
    private TreeNode treeNode3;
    private TreeNode treeNode4;
    private TreeNode treeNode5;
    private TreeNode treeNode6;
    private TreeNode treeNode7;
    private TreeNode treeNode8;
    private TreeNode treeNode9;
    private TreeNode treeNode10;

    @Before
    public void init()
    {
        treeNode1=new TreeNode(10);
        treeNode2=new TreeNode(9);
        treeNode3=new TreeNode(12);
        treeNode4=new TreeNode(1);
        treeNode5=new TreeNode(16);
        treeNode6=new TreeNode(20);
        treeNode7=new TreeNode(15);
        treeNode8=new TreeNode(35);
        treeNode9=new TreeNode(0);
        treeNode10=new TreeNode(6);

        treeNode1.setLeftTreeNode(treeNode2);
        treeNode1.setRightTreeNode(treeNode6);
        treeNode2.setLeftTreeNode(treeNode3);
        treeNode2.setRightTreeNode(treeNode5);
        treeNode3.setLeftTreeNode(treeNode4);
        treeNode6.setLeftTreeNode(treeNode7);
        treeNode6.setRightTreeNode(treeNode8);
        treeNode8.setLeftTreeNode(treeNode9);
        treeNode8.setRightTreeNode(treeNode10);
    }

    //先序
    @Test
    public void boforeVisit()
    {
        TreeNodeUtil.beforeVisit(treeNode1);
    }

    //中序
    @Test
    public void middleVisit()
    {
        TreeNodeUtil.middleVisit(treeNode1);
    }

    //后序
    @Test
    public void latterVisit()
    {
        TreeNodeUtil.latterVisit(treeNode1);
    }
}
