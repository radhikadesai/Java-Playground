
import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BTTest {
    @Test
    public void itConstructsBinaryTree() {
        //Given
        List<String> list= Arrays.asList("1","3","2","5","0","8");
        BinaryTree bTree=new BinaryTree();
        //When
        Node root=bTree.constructTreeFromList(list,0,list.size());
        //Then
        assert root.getData()== "5";
    }
    @Test
    public void itInsertsIntoBinaryTree() {
        //Given
        List<String> list= Arrays.asList("1","3","2","5","0","8");
        List<String> list2= Arrays.asList("4","10");
        BinaryTree bTree=new BinaryTree();
        //When
        Node root=bTree.constructTreeFromList(list,0,list.size());
        for (String el:list2){
            bTree.insertElement(root,el);
        }
        //Then

    }
    @Test
    public void itPrintsInorder() {
        //Given
        List<String> list= Arrays.asList("1","3","2","5","0","8");
        BinaryTree bTree=new BinaryTree();
        //When
        Node root=bTree.constructTreeFromList(list,0,list.size());
        bTree.inorderTraversal(root);
        //Then

    }
    @Test
    public void itPrintsPreorder() {
        //Given
        List<String> list= Arrays.asList("1","3","2","5","0","8");
        BinaryTree bTree=new BinaryTree();
        //When
        Node root=bTree.constructTreeFromList(list,0,list.size());
        bTree.preorderTraversal(root);
        //Then

    }
    @Test
    public void itPrintsPostorder() {
        //Given
        List<String> list= Arrays.asList("1","3","2","5","0","8");
        BinaryTree bTree=new BinaryTree();
        //When
        Node root=bTree.constructTreeFromList(list,0,list.size());
        bTree.postorderTraversal(root);
        //Then

    }
    @Test
    public void itPrintsAllPathsFromRoot(){
        //Given
        List<String> list= Arrays.asList("1","3","2","5","0","8");
        List<Node> list2=new ArrayList<Node>();
                BinaryTree bTree=new BinaryTree();
        //When
        Node root=bTree.constructTreeFromList(list,0,list.size());
        List<String> paths= bTree.printAllPathsFromRoot(root,new StringBuilder(""),new ArrayList<String>());
        //Then
        for(int i =0;i<paths.size();i++)
        System.out.println("Path"+(i+1)+" : "+paths.get(i));
    }
}
