/* The idea of this to make an application that will bring up 
 * the spirits of those who are feeling down. To be honest
 * I'm mainly making this program to make myself feel better.
 * I've been down and out and have suffered from chronic depression
 * which has greatly hindered my life.
 *
 * ©Michael Wilson, 2017 */
 
import java.io.*;
public class HapE {
   public static void main(final String[] args) throws FileNotFoundException {
      File happyFile = new File("hapeFile.txt");
      hapeTree myTree = new hapeTree(happyFile);
      System.out.println("printing the contents of the tree inorder by rank:\n");
      myTree.printTreeinOrder();
      System.out.println("\nThe phrase with the lowest priority is:\n" + myTree.getLow().getPhrase() + "\n");
      System.out.println("The phrase with the highest priority is:\n" + myTree.getHigh().getPhrase());
   }  
}