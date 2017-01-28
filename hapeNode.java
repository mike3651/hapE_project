/* This class constructs a happy node
 * 
 * ©Michael Wilson, 2017 */
public class hapeNode {
   // FIELDS
   String phrase;
   int hapeRank;
   hapeNode left;
   hapeNode right;
   
   /* HapE node defualt constructor */
   public hapeNode() {
      this(null, 0);
   }
   
   /* HapE node with parameters
    * @param phrase The phrase of the node
    * @param rank The rank of the node */
   public hapeNode(String phrase, int rank) {
      this.phrase = phrase;
      hapeRank = rank;
      left = right = null;
   }
   
   
   /////////////
   // SETTERS //
   /////////////
   /* Sets the phrase 
    *
    * @param phrase Phrase to set to */
   void setPhrase(String phrase) {
      this.phrase = phrase;
   }
    
   /* Sets the rank
    * 
    * @param rank The rank to set to */
   void setRank(int rank) {
      hapeRank = rank;
   }
   
   /* Sets the left child
    * 
    * @param leftChild The hapeNode to point to */
   void setLeft(hapeNode leftChild) {
      left = leftChild;
   }
    
    /* Sets the right child
    * 
    * @param rightChild The hapeNode to point to */
   void setRight(hapeNode rightChild) {
      right = rightChild;
   }
    
   /////////////
   // GETTERS //
   /////////////
   /* Gets the phrase
    * 
    * @return The phrase of this node */
   String getPhrase() {
      return phrase;
   }
    
   /* Gets the rank
    * 
    * @return The rank of this node */
   int getRank() {
      return hapeRank;
   }
   
   /* Gets the left child
    * 
    * @return The left child of this hapeNode */
   hapeNode getLeft() {
      return left;
   }
    
   /* Gets the right child
    * 
    * @return The right child of this hapeNode */
   hapeNode getRight() {
      return right;
   }
}