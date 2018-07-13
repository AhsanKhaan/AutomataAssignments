/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver_nfa;

/**
 *
 * @author M.Ahsan
 */
public class S_Linklist {

    private Node1 root;
    private int size;
//null constructor

    public S_Linklist() {
        root = new Node1();
        size = 0;
    }
//setter and getter

    public int getsize() {
        return this.size;
    }

    public void setsize(int size) {
        this.size = size;
    }

    public Node1 getroot() {
        return this.root;
    }

    public void setroot(Node1 firstnode) {
        this.root = firstnode;
    }

    public Node1 add(int data,String str) {

        Node1 newnode = new Node1(data,str,root);
        this.root = newnode;
        this.size++;
        return newnode;
    }

    public boolean remove(int data,String str) {
        // node thisnode=new node();
        Node1 thisnode = this.root;
        Node1 prevnode = null;
        while (thisnode.getnextnode() != null) {
            if ((thisnode.getdata() == data)&&(thisnode.getstr().equals(str))) {
               try{ prevnode.setnextnode(thisnode.getnextnode());}
               catch(NullPointerException e){
                   System.out.println("Warning:'The value ccontains null pointer'");
               }
                this.setsize(getsize() - 1);
                return true;
            }
            prevnode = thisnode;
            thisnode = thisnode.getnextnode();
        }
        return false;
    }
    public Node1 find(int data,String str){
    Node1 thisnode=this.root;
    while(thisnode.getnextnode()!=null){
    if((thisnode.getdata()==data)&&thisnode.getstr().equals(str))
    return thisnode;
    thisnode=thisnode.getnextnode();//adding this for reading next node if we didn't do then infinite loop occur
    }
    
    return null;
    }
};
