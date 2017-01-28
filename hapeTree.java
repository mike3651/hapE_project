/* This creates a hapeTree
 * 
 * ©Michael Wilson, 2017 */
 
import java.util.*;
import java.io.*;

public class hapeTree {
   // access to the root
   hapeNode overallRoot;  
   
   /* Constructs an empty hapeTree */
   public hapeTree() throws FileNotFoundException {
      this(null);
   }    
   
   /* Constructor that takes in a file to read 
    * FILE FORMAT:
    *    RANK | PHRASE 
    *
    * @param file The file to construct the tree out of */
   public hapeTree(File file) throws FileNotFoundException {      
      Scanner scan = new Scanner(file);
      String[] line;
      while(scan.hasNext()) {
         line = scan.nextLine().split("[|]");
         int rank = Integer.parseInt(line[0]);
         String phrase = (line[1]);
         addToTree(new hapeNode(phrase, rank));
      }
   }
   
   /* Method that prints out the contents of the tree
    * inorder */
   public void printTreeinOrder() {
      printTreeinOrder(overallRoot);  
   }
   
   /* private helper method that deals with printing 
    * out the contents of the tree 
    * 
    * @param root The starting position of the tree */
   private void printTreeinOrder(hapeNode root) {
      if(root != null) {
         printTreeinOrder(root.left);
         System.out.println(root.phrase + " ");
         printTreeinOrder(root.right);
      }
   }
   
   /* This method adds a new node to the tree
    * 
    * @param hapeNode The node to be added */
   public void addToTree(hapeNode node) {
      overallRoot = addToTree(node, overallRoot); 
   }
    
   /* Private helper method for addToTree 
    * works like a binary search tree
    * 
    * @param node The node to be added
    * @param root The spot that we are at in the tree 
    * @return The modified tree because the root may change */
   private hapeNode addToTree(hapeNode node, hapeNode root) {
      if(root == null)
         return node;
      else {
         // if node->value < root->value ? go left : go right;
         if(node.getRank() < root.getRank()) 
            root.left = addToTree(node, root.left);
         else
            root.right = addToTree(node, root.right);   
      }
     return root;
   }   
   
   /* Gets the highest priority node
    *
    * @return The node with the highest rank */
   public hapeNode getHigh() {
      return getHigh(overallRoot);
   }
    
   /* private helper method for getting the highest priority node
    * 
    * @param root The place to check */
   private hapeNode getHigh(hapeNode root) {
      return root.getLeft() == null ? root : getHigh(root.getLeft());
   }
    
   /* Gets the lowest prirotiy node
    *
    * @return The node with the lowest rank */ 
   public hapeNode getLow() {
      return getLow(overallRoot);
   }
   
   /* private helper method for getting the lowest priority node
    * 
    * @param root The place to check */
   private hapeNode getLow(hapeNode root) {
      return root.getRight() == null ? root : getLow(root.getRight());
   }

} 
