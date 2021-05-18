package base;

public class BSTNode {
// initialize variables
    int value;
    BSTNode left;
    BSTNode right;

    public BSTNode(int value){
        this.value = value;
        this.left = null;
        this.right =null;
    }

    public BSTNode root = null;

    public BSTNode add(int value){
        // new node
        BSTNode newNode = new BSTNode(value);
        if(root== null){
            root = newNode;
        }
        else{
            root.value = newNode;
        }
        return newNode;
    }
}




