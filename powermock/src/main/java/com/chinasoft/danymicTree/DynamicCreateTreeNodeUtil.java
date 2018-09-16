package com.chinasoft.danymicTree;

import com.chinasoft.tree.TreeNode;

/**
 * 动态创建二叉树
 * 根据给定的数组，
 * 如果比当前根节点要小，那么放到当前根节点左边，如果比当前根节点要大，那么放到当前根节点右边
 * <p>
 * 因为是动态创建的，因此我们得用一个类来表示根节点  TreeRoot类表示根
 * https://blog.csdn.net/java_3y/article/details/79674656
 */
public class DynamicCreateTreeNodeUtil {

    public static void createTree(TreeRoot treeRoot,int value)
    {
        /**
         * 如果树根为空(第一次访问)，将第一个值作为根节点
         */
       if(treeRoot.getRootTreeNode()==null){
           TreeNode treeNode=new TreeNode(value);
           treeRoot.setRootTreeNode(treeNode);
       }else{
           //当前树根
           TreeNode tempNode=treeRoot.getRootTreeNode();

       }


    }
}
