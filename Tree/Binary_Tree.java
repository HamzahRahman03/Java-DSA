import java.util.*;
public class Binary_Tree{
    public class Node{
        int val;
        Node left;
        Node right;
    }
    
    private Node root;
    Scanner sc = new Scanner (System.in);

    public Binary_Tree(){
        root = CreateTree();
    }
    
    private Node CreateTree(){      //jaate hue value and wapas aate hue address
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;

        boolean hlc = sc.nextBoolean();    //has left child

        if(hlc){
            nn.left = CreateTree();     //RECURSION
        }

        boolean hrc =sc.nextBoolean();      //has right child
        if(hrc){
            nn.right = CreateTree();
        }


        return nn;      //returns address of 70 at first time
    }

    public void Display(){
        Display(root);
    }
    
    private void Display (Node nn){

        if(nn == null){
            return;
        }

        String s = "";
        s = "<--" + s+nn.val + "-->";

        if(nn.left != null){
            s = nn.left.val + s;
        }

        else{
            s = "." + s;
        }

        if(nn.right != null){
            s = s + nn.right.val;
        }

        else{
            s = s + ".";
        }

        System.out.println(s);
        Display(nn.left);       //recursion prints left subtree
        Display(nn.right);      //recursion prints right subtree
    }

    public int max(){
        return max(root);
    }

    private int max(Node nn){
        if(nn == null){
            return Integer.MIN_VALUE;
        }

        int left = max(nn.left);
        int right = max(nn.right);

        return Math.max(nn.val,  Math.max(left, right));
    }


    public int min(){
        return min(root);
    }

    private int min(Node nn){
        if(nn == null){
            return Integer.MAX_VALUE;
        }

        int left = min(nn.left);
        int right = min(nn.right);

        return Math.min(nn.val,  Math.min(left, right));
    }


    public boolean find(int item){
        return find(this.root, item);
    }

    private boolean find(Node nn, int item){
        if(nn == null){
            return false;
        }
        
        if(nn.val == item){
            return true;
        }

        boolean left = find(nn.left, item);
        boolean right = find(nn.right, item);
        return left || right;
    }

    public int ht(){
        return ht(this.root);
    }

    private int ht(Node node){
        if(node == null){
            return -1;
        }

        int lh = ht(node.left);
        int rh = ht(node.right);

        return Math.max(lh, rh) + 1;
    }

    public void PreOrder(){
        PreOrder(this.root);
        System.out.println();
    }
    
    private void PreOrder(Node node){
        if(node == null){
            return ;
        }

        System.out.print(node.val + " ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    public void InOrder(){
        InOrder(this.root);
        System.out.println();
    }
    
    private void InOrder(Node node){
        if(node == null){
            return ;
        }

        InOrder(node.left);
        System.out.print(node.val + " ");
        InOrder(node.right);
    }
}
