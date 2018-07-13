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
public class Node1 {

    private int idata;
    private String str_val;
    private Node1 nextnode;

    //null constructor
    public Node1() {

    }

    //parametrized constructor
    public Node1(int val, String str) {
        this.idata = val;
        this.str_val = str;
    }

    //parametrized constructor
    public Node1(int val,String str, Node1 next) {
        this.idata = val;
        this.str_val=str;
        this.nextnode = next;
        
    }

    //settter for attributes
    public void setdata(int idata) {
        this.idata = idata;
    }
    public void setstr(String str){
    this.str_val=str;
    }

    public void setnextnode(Node1 next) {
        this.nextnode = next;
    }

    //getter for attributes
    public int getdata() {
        return this.idata;
    }
    public String getstr(){
    return this.str_val;
    }

    public Node1 getnextnode() {
        return this.nextnode;
    }

    public String toString() {

        String node = "";
        if (node == null) {
            return node += "no value ";
        }
        node += ("Node consist of:(data:\t" + this.idata +","+this.str_val +" )");
        //node+=("nextnode:"+this.nextnode+")");
        return node;
    }

    
};
