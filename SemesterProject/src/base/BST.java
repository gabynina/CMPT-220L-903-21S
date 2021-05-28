package base;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

    public Node root = null;

   public Node newNode(int p){
       Node g = new Node();
       g.value = p;
       g.left = null;
       g.right = null;
       return g;
   }

   public Node insert(Node root, int value){
       if(root == null){
           return newNode(value);
       }
       if (value <root.value) {
           root.left = insert(root.left, value);
       } else if(value > root.value){
           root.right = insert(root.right, value);
       }
       return root;
   }



    /**
     * search for elements in the tree
     * @param root
     * @param value
     * @return
     */

    public boolean finder(Node root, int value){
        // if the there is no value being asked for then it will return false
        if (root== null){
            return false;
        }
        // if the temp value asked for it in the tree then it will return true
        if(value == root.value){
            return true;
        }
        return value < root.value
                ? finder(root.left, value)
                :finder(root.right, value);
    }

    /**
     * find smallest value
     * @param root
     * @return
     */
    public Node min(Node root){
        if (root.left != null)
            return min(root.left);
        else
            return root;
    }

    /**
     * find larger value
     * @param root
     * @return
     */
    public Node max(Node root){
        if (root.right != null)
            return max(root.right);
        else
            return  root;
    }

    /**
     * delete from tree
     * @param root
     * @param value
     * @return
     */
    public Node delete(Node root, int value) {
        if(root == null){
            return null;
        } else {
            // if the value is less than the root's value then begin search in the left subtree
            if (value < root.value) {
                root.left = delete(root.left, value);
                // if the value is greater than the root's value then begin search in the right subtree
            } else if (value > root.value){
                root.right = delete(root.right, value);
            }else{
                // If root to be deleted has no children...
                if(root.left == null && root.right == null) {
                    root = null;
                }
                // If root to be deleted has one child...
                else if (root.left == null || root.left == null){
                    Node temp = null;
                    // If the left root is empty then assign to the right.
                    // If the left root is not empty then assign to the left.
                    root = root.left == null ? root.right : root.left;
                }
                // If root has two children...
                else {
                    // find the min root from the right subtree
                    Node temp = min(root.right);
                    // then switch the root and temp value
                    root.value = temp.value;
                    // delete duplicate from the right subtree
                    root.right = delete(root.right, temp.value);
                }

            }
        } return root;
    }

    /**
     * height of tree
     * @param root
     * @return
     */
    public int height(Node root){
        if (root == null)
            return 0;
        else {
            int leftH = height(root.left);
            int rightH = height(root.right);
            if (leftH > rightH)
                return (leftH + 1);
            else
                return (rightH + 1);
        }
    }

    /**
     * order, orders the tree from left subtree to root to right subtree
     * @param root
     */
    public void order(Node root){
        if(root == null){
            return;
        }
        order(root.left);
        System.out.print(" " +root.value+" ");
        order(root.right);
    }

    /**
     * preorder orders the tree from root to left subtree to right subtree
     * @param root
     */
    public void preorder(Node root){
        if (root == null){
            return;
        }
        System.out.print(" " + root.value+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    /**
     * post order, orders the tree from the left subtree to the right subtree to the root
     * @param root
     */
    public void postorder(Node root){
        if (root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(" "+root.value+ " ");
    }


    /**
     * Nth largest integer
     * @param root
     * @param k
     * @return
     */
    static int count = 0;
    public Node nLargest(Node root, int k){
        if(root == null){
            return null;
        }
        Node rightsub = nLargest(root.right, k);

        if(rightsub != null) {
            return rightsub;
        }
        count++;
        if(count == k){
            return root;
        }

        return root;
    }

    public Node BFS(Node root){
        // Beadth First Search
        if (root ==null){
            return root;
        }
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while(!nodes.isEmpty()){
            Node node = nodes.remove();
            System.out.print(" "+ node.value);

            if (node.left != null){
                nodes.add(node.left);
            }
            if (node.right != null){
                nodes.add(node.right);
            }
        }
    return root;}



}