/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author charlie
 */
public class Node <E extends Comparable <E>> implements Comparable<Node<E>>{
    Node root;
    E value; 
     Node<E> leftChild;
     Node<E> rightChild;
     Node(E value)
     {
         value=this.value;
     }

     public int compareTo(Node<E> newNode)
     {
         return this.value.compareTo(newNode.value); // if this return zero, the node equal to itself
         // if this return greater than zero, newNode is the leftChild
         //if this return less than zero, newNode is the rightChild         
     }
     public E getValue()
     {
         return this.value;
     }
     public void setValue(E newValue)
     {
         this.value=newValue;
     }
     public void setLeftchild(Node<E> newLeftchild)
     {
         this.leftChild=newLeftchild;
     }
     public Node<E> getLeftchild()
     {
         return leftChild;
     }
      public void setRightchild(Node<E> newRightchild)
     {
         this.rightChild=newRightchild;
     }
     public Node<E> getRightchild()
     {
         return rightChild;
     }
     public boolean haveLeftchild()
     {
         if(leftChild==null)
         {
             return false;  // if there is no left child false, return , otherwise, return true.
         }
         else
         {
             return true;
         }
     }
      public boolean haveRightchild()
     {
         if(rightChild==null)
         {
             return false;  // if there is no left child , return false , otherwise, return true.
         }
         else
         {
             return true;
         }
     }
     public boolean sameValue(Node<E> testNode)
     {
         return this.value==testNode.value;
     }
     public E min() // get smallest value
     {
         if(haveLeftchild()==true)
         {
             return this.leftChild.min();
         }
         else
         {
             return value;
         }
     }
     public E max() // get greatest value
     {
         if(haveRightchild()==true)
         {
             return this.rightChild.min();
         }
         else
         {
             return value;
         }
     }
     public void insertNewValue(E value)
     {
         if(value.compareTo(this.value)<0)  //if the value is smaller than current value, insert a value into left tree
         {
             if(leftChild== null)               // if nothing in the left tree, then insert the value
             {
                 leftChild=new Node<>(value);
             }
             else                           // if something in the left tree, keep going down , untill the end.
             {
                 leftChild.insertNewValue(value);
             }            
         }
         else if(value.compareTo(this.value)>0)  //if the value is greater than current value, insert a value into right tree
         {
             if(rightChild== null)               // if nothing in the right tree, then insert the value
             {
                 rightChild=new Node<>(value);
             }
             else                           // if something in the right tree, keep going down , untill the end.
             {
                 rightChild.insertNewValue(value);
             }            
         } 
     }
    
}
