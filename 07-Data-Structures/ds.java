
//arraylist 
    //non continuous form of data can be stored
    //here the array size is variable
    //objects can only be stored in arraylist not primitive data because primitive are already declared
    //stored in heap
    //add, get, modify , delete

// import java.util.ArrayList;
// import java.util.Collections;

// public class ds {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         //add elements in the list
//         list.add(0);
//         list.add(1);
//         list.add(2);
//         System.out.println(list);
//         //op [0,1,2]

//         //get elements
//         int element=list.get(0);
//         System.out.println(element); 
//         //op 0

//         //add element in between
//         list.add(1,5);
//         System.out.println(list);
//         //op [0,5,1,2]

//         //set element
//         list.set(1,8);
//         System.out.println(list);
//         //op [0,8,1,2]

//         //delete/remove element
//         list.remove(1);
//         System.out.println(list);
//         //op [0,1,2]

//         //size
//         int size=list.size();
//         System.out.println(size);
//         //op 3

//         //loops
//         for(int i=0;i<list.size();i++){
//             System.out.print(list.get(i));
//         }
//         System.out.println();
//         //op 012

//         //sorting
//         Collections.sort(list);
//         System.out.println(list);
//         //op [0,1,2]
//     }
// }


//linkedlist
// public class ds {
//     Node head;
//     private int size;
//     ds(){
//         this.size=0;
//     }
//     class Node{
//         String data;
//         Node next;

//         //node constructor
//         Node(String data){
//             this.data=data;
//             this.next=null;
//             size++;
//         }
//     }
    
//     //add first
//     public void addFirst(String data){
//         Node newnode= new Node(data);
//         if(head ==null){
//             head =newnode;
//             return;
//         }
//         newnode.next=head;
//         head=newnode;
//     }
    
//     //add last
//     public void addLast(String data){
//         Node newnode= new Node(data);
//         if(head ==null){
//             head =newnode;
//             return;
//         }
//         Node currNode=head;
//         while (currNode.next!=null){
//             currNode=currNode.next;
//         }
//         currNode.next=newnode;
//     }

//     //print the list
//     public void printList(){
//         if(head ==null){
//             System.out.println("list is empty");
//         }
//         Node currNode=head;
//         while (currNode!=null){
//             System.out.print(currNode.data+"->");
//             currNode=currNode.next;
//         }
//         System.out.println("null");
//     }

//     //delete first
//     public void deleteFirst(){
//         if(head ==null){
//             System.out.println("list is empty");
//             return;
//         }
//         size--;
//         head= head.next;
//     }

//     //delete last
//     public void deleteLast(){
//         if(head ==null){
//             System.out.println("list is empty");
//             return;
//         }
//         size--;
//         if(head.next==null){
//             head=null;
//             return;
//         }
//         Node secondlast=head;
//         Node last=head.next;
//         while(last.next!=null){
//             last=last.next;
//             secondlast=secondlast.next;
//         }
//         secondlast.next=null;
//     }

//     public int getSize(){
//         return size;
//     }

//     //reverse
//     public void reverseIterate(){
//     if(head==null||head.next==null){
//         return;
//     }
//     Node previousnode=head;
//     Node currentnode=head.next;
//     while(currentnode!=null){
//         Node nextnode= currentnode.next;
//         currentnode.next=previousnode;
//         //update
//         previousnode=currentnode;
//         currentnode=nextnode;
//     }
//     head.next=null;
//     head=previousnode;
// }
//         public static void main(String[] args) {
//             ds list= new ds();
//             list.addFirst("a");
//             list.addFirst("is");
//             list.printList();
//             list.addLast("list");
//             list.printList();
//             list.addFirst("this");
//             list.printList();
//             list.deleteFirst();
//             list.printList();
//             list.deleteLast();
//             list.printList();
//             System.out.println(list.getSize());

//             list.addFirst("this");
//             System.out.println(list.getSize());
//         }
//     }



//reverse the linked list 
// public class ds {
//     Node head;
//     class Node{
//         int data;
//         Node next;

//         //node constructor
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
    
//     //add last
//     public void addLast(int data){
//         Node newnode= new Node(data);
//         if(head ==null){
//             head =newnode;
//             return;
//         }
//         Node currNode=head;
//         while (currNode.next!=null){
//             currNode=currNode.next;
//         }
//         currNode.next=newnode;
//     }

//     //print the list
//     public void printList(){
//         if(head ==null){
//             System.out.println("list is empty");
//         }
//         Node currNode=head;
//         while (currNode!=null){
//             System.out.print(currNode.data+"->");
//             currNode=currNode.next;
//         }
//         System.out.println("null");
//     }

// //reverse iteretive way
//     public void reverseIterate(){
//     if(head==null||head.next==null){
//         return;
//     }
//     Node previousnode=head;
//     Node currentnode=head.next;
//     while(currentnode!=null){
//         Node nextnode= currentnode.next;
//         currentnode.next=previousnode;
//         //update
//         previousnode=currentnode;
//         currentnode=nextnode;
//     }
//     head.next=null;
//     head=previousnode;
// }

// //reverse recursive way
// public Node reverseRecursive(Node head){
//     if(head==null|| head.next==null){
//         return head;
//     }
//     Node newhead= reverseRecursive(head.next);
//     head.next.next=head;
//     head.next=null;
//     return newhead;
// }
//         public static void main(String[] args) {
//             ds list=new ds();
//             list.addLast(1);
//             list.addLast(2);
//             list.addLast(3);
//             list.addLast(4);
//             list.printList();
//             list.reverseIterate();
//             list.printList();

//             list.head=list.reverseRecursive(list.head);
//             list.printList();
//         }
//     }


//delete the nth node from the end of the linked list
// import java.util.*;
// public class ds {
// ListNode head;
//     class ListNode{
//         int data;
//         ListNode next;
//         //node constructor
//         ListNode(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }

// //addlast
//         public void addLast(int data){
//         ListNode newnode= new ListNode(data);
//         if(head ==null){
//             head =newnode;
//             return;
//         }
//         ListNode curr=head;
//         while (curr.next!=null){
//             curr=curr.next;
//         }
//         curr.next=newnode;
//     }

// //printlist
//         public void printList(){
//         if(head ==null){
//             System.out.println("list is empty");
//         }
//         ListNode curr=head;
//         while (curr!=null){
//             System.out.print(curr.data+"->");
//             curr=curr.next;
//         }
//         System.out.println("null");
//     }

//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         if(head.next==null){
//             return null;
//         }
//         int size=0;
//         ListNode curr=head;
//         while(curr!=null){
//             curr=curr.next;
//             size++;
//         }
//         int indexofprev=size-n;
//         curr=head;
//         int i=0;
//         while(i<=indexofprev){
//             curr=curr.next;
//         }
//         curr.next=curr.next.next;
//         return head;
        
//     }
//     public static void main(String args[]){
//         ds list =new ds();
//         list.addLast(1);
//         list.addLast(2);
//         list.addLast(3);
//         list.addLast(4);
//         list.addLast(5);
//         list.printList();
//         list.removeNthFromEnd(head,2);
//         list.printList();
//     }
// }



//STACK 
// stacks in form of linked list
// public class ds{
//     static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             next=null;
//         }
//     }
//     static class Stack{
//         public static Node head;
//         public static boolean isEmpty(){
//             return head ==null ;
//         }
//         public static void push(int data){
//             Node newNode =new Node(data);
//             if(isEmpty()){
//                 head=newNode;
//                 return;
//             }
//             newNode.next=head;
//             head=newNode;
//         }
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top=head.data;
//             head=head.next;
//             return top;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String[] args) {
//         Stack s=new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// stacks in form of arraylist
// import java.util.ArrayList;
// public class ds{
//     static class Stack{
//         static ArrayList<Integer> list=new ArrayList<>();
//         public static boolean isEmpty(){
//             return list.size()==0;
//         } 
//         public static void push(int data) {
//             list.add(data);
//         }
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top=list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return list.get(list.size()-1);
//         }
//     }
//     public static void main(String[] args) {
//         Stack s= new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


//using java collection frameworks to implement stacks
//push at bottom 
// import java.util.*;
// public class ds{
//     public static void pushatBottom(int data, Stack<Integer> s){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top=s.pop();
//         pushatBottom(data, s);
//         s.push(top);
//     }
//     public static void main(String[] args) {
//         Stack<Integer> s=new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         pushatBottom(4, s);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

//reverse the stack
import java.util.*;
public class ds{
    public static void pushatBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushatBottom(data, s);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return ;
        }
        int top=s.pop(); //3 2 1
        reverse(s);
        pushatBottom(top, s); 
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}