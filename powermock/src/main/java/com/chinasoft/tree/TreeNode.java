package com.chinasoft.tree;

import lombok.Getter;
import lombok.Setter;

/**
 * 树
 * 二叉树
 * 树的节点
 */
@Getter
@Setter
public class TreeNode
{
    /**
     *               这是一棵树（二叉树）
     *                     10
     *         9                       20
     *                           15           35
     *
     */
    //左节点（儿子）
    private TreeNode leftTreeNode;

    //右节点（儿子）
    private TreeNode rightTreeNode;

    //数据
    private int value;

    public TreeNode(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        //创建节点
        TreeNode treeNode1=new TreeNode(10);    //根节点10

        TreeNode treeNode2=new TreeNode(9);    //左儿子 子节点9
        TreeNode treeNode3=new TreeNode(20);  //右儿子 子节点20

        TreeNode treeNode4=new TreeNode(15);  //左孙子 孙子节点15
        TreeNode treeNode5=new TreeNode(35);  //右孙子 孙子节点35

        /**
         * 节点虽然已经创建完了
         * 但他们现在是没有任何关系的，也就是还没有连起来
         * 下面我们把他们连起来
         */

        //根节点10的左节点是9，右节点是20
        treeNode1.setLeftTreeNode(treeNode2);
        treeNode1.setRightTreeNode(treeNode3);

        //子节点20的左节点是15，右节点是35
        treeNode3.setLeftTreeNode(treeNode4);
        treeNode3.setRightTreeNode(treeNode5);

        //走到这里，这棵树就已经创建完成啦!!!
        /**
         *下面我们来遍历这棵树
         */
        /**先序遍历，先访问根节点，然后访问左节点，最后访问右节点(根->左->右)
         * 结果就是：10 9 20 15 35
         *
         * 中序：先访问左节点，然后访问根节点，最后访问有节点（左->根->右）
         * 结果就是：9 10 15 20 35
         *
         * 后序：先访问左节点，然后访问右节点，最后访问根节点(左->右->根)
         * 结果就是：9 15 35 20 10
         */
        System.out.println("先序......................");
        beforeVisit(treeNode1);
        System.out.println("中序......................");
        MiddleVisit(treeNode1);
        System.out.println("后序......................");
        latterVisit(treeNode1);
    }

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
    public static void MiddleVisit(TreeNode rootTreeNode) {
        if (rootTreeNode != null) {
            //访问左节点
            TreeNode leftTreeNode = rootTreeNode.getLeftTreeNode();
            if(leftTreeNode!=null){
                MiddleVisit(leftTreeNode);
            }
            //访问根节点
            System.out.println(rootTreeNode.getValue());
            //访问右节点
            TreeNode rightTreeNode = rootTreeNode.getRightTreeNode();
            if(rightTreeNode!=null){
                MiddleVisit(rightTreeNode);
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
