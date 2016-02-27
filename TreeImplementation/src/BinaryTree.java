import java.util.ArrayList;
import java.util.List;

public class BinaryTree{

    public Node constructTreeFromList(List<String> list, int start,int end){
        if(start>end || (start+end)/2==list.size()){
            return null;
        }
        int mid=(start+end)/2;
        Node node = new Node(list.get(mid));
        node.left=constructTreeFromList(list,start,mid-1);
        node.right=constructTreeFromList(list,mid+1,end);
        return node;
    }

    public Node insertElement(Node node, String element){
        if (node == null)
            node = new Node(element);
        else {
            if (node.getLeft() == null){
                node.left = insertElement(node.left, element);
            }
            else{
                node.right = insertElement(node.right, element);
            }
        }
        return node;
    }
    public void inorderTraversal(Node node){
        if(node.getLeft()!=null) {
            inorderTraversal(node.getLeft());
        }
        System.out.println("Node --> " + node.getData());
        if(node.getRight()!=null) {
            inorderTraversal(node.getRight());
        }
    }
    public void preorderTraversal(Node node){
        System.out.println("Node --> " + node.getData());
        if(node.getLeft()!=null) {
            preorderTraversal(node.getLeft());
        }
        if(node.getRight()!=null) {
            preorderTraversal(node.getRight());
        }
    }
    public void postorderTraversal(Node node){
        if(node.getLeft()!=null) {
            preorderTraversal(node.getLeft());
        }
        if(node.getRight()!=null) {
            preorderTraversal(node.getRight());
        }
        System.out.println("Node --> " + node.getData());
    }
}
