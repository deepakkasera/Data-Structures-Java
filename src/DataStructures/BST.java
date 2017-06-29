package DataStructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by deepak on 29/6/17.
 */
class BSTNode{
    int data;
    BSTNode left,right;

    //Constructor
    public BSTNode(){
        data = 0;
        left = null;
        right = null;
    }

    public BSTNode(int d){
        data = d;
        left = null;
        right = null;
    }
}
class BinarySearchTree{
    private BSTNode root;

    // Constructor
    public BinarySearchTree(){
        root = null;
    }

    public boolean isEmptyBST(){
        return root == null;
    }

    public void insert(int data){
        root = insert(root,data);
    }

    private BSTNode insert(BSTNode node,int data){
        if(node == null){
            node = new BSTNode(data);
        }
        else{
            if(data <= node.data){
                node.left = insert(node.left,data);
            }
            else{
                node.right = insert(node.right,data);
            }
        }
        return node;
    }

    public boolean search(int key){
        return search(root,key);
    }

    private boolean search(BSTNode node,int key){
        if(node == null){
            return false;
        }
        if(node.data == key){
            return true;
        }
        if(key > node.data){
            return search(node.right,key);
        }
        return search(node.left,key);
    }

    public int countNodes(){
        return countNode(root);
    }

    private int countNode(BSTNode node){
        if(node == null){
            return 0;
        }
        return countNode(node.left) + countNode(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(BSTNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " " );
        inOrder(node.right);
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(BSTNode node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(BSTNode node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void levelOrderPrint(){
        levelOrderPrint(root);
    }
    private void levelOrderPrint(BSTNode node){
        if(node == null){
            return;
        }
        Queue<BSTNode> q = new LinkedList<>();
        q.add(node);
        q.add(null);
        while(!q.isEmpty()){
            BSTNode n = q.remove();
            boolean f = false;
            if(n == null){
                System.out.println();
            }
            else{
                if(n.left != null){
                    q.add(n.left);
                    f = true;
                }
                if(n.right != null){
                    q.add(n.right);
                    f = true;
                }
            }
            if(f){
                q.add(null);
            }
            if(n != null)
                System.out.print(n.data + " ");
        }
    }
}
public class BST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("Binary Search tree implementation");
        int n,x;
        System.out.println("Enter the number of nodes in BST");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            bst.insert(x);
        }
        System.out.println("Inorder traversal of BST is ");
        bst.inOrder();
        System.out.println("\nPreorder traversal of BST is ");
        bst.preOrder();
        System.out.println("\nPostOrder traversal of BST is ");
        bst.postOrder();
        System.out.println("\nLevel order print of tree is ");
        bst.levelOrderPrint();
        System.out.println("\nEnter the element to be searched ");
        int s;
        s = sc.nextInt();
        if(bst.search(s)){
            System.out.println("Element " + s + " is found in BST");
        }else{
            System.out.println("Element " + s + " is not found in BST");
        }
    }
}
