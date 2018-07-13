/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver_nfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author M.Ahsan
 */
public final class NFA extends Node1 {

    private int initialstate;
    private int[] finalstate;
    private int[] states;
    private int validinputs;
    public S_Linklist[] entity;
    

    public NFA() {
       this.initialstate = 0;
       int[] array={2};
       
        this.finalstate = array;
       this.states =new int[5];
        for (int i = 0; i < 5; i++) {
        
        this.states[i]=i;
        }
        
        //this.states[0]=list;
        for (int i = 0; i < 6; i++) {
            this.entity = new S_Linklist[i];
        }
        this.entity[0]=new S_Linklist();
        this.entity[1]=new S_Linklist();
        this.entity[2]=new S_Linklist();
        this.entity[3]=new S_Linklist();
        this.entity[4]=new S_Linklist();
        
        this.validinputs = 2;
        this.setentity();
        
       
    }


    public NFA(int is, int[] fs, int nostate, int validlanguage) {
        this.initialstate = is;
        this.finalstate = fs;
        this.states = new int[nostate];
        this.validinputs = validlanguage;
        ArrayList list = new ArrayList();

        for (int i = 0; i < nostate; i++) {
            this.states[i] = i;
        }
        for (int i = 0; i < nostate; i++) {
            this.entity = new S_Linklist[i];
        }
        this.setentity();

    }

    ;
    public int getis() {
        return this.initialstate;
    }

    public int[] getfs() {
        return this.finalstate;
    }

    public int[] getstates() {
        return this.states;
    }

    public S_Linklist[] getentity() {
        return this.entity;
    }

    public int getvalidinput() {
        return this.validinputs;
    }

    public void setis(int is) {
        this.initialstate = is;
    }

    public void setfs(int[] fs) {
        this.finalstate = fs;
    }

    public void setstates(int[] st) {
        this.states = st;
    }

//    public void setentity(int maxitem) throws IOException {
//        Scanner input = new Scanner(System.in);
//        Scanner input2 = new Scanner(System.in);
//        for (int row = 0; row < this.states.length; row++) {
//            for (int j = 0; j < maxitem; j++) {
//                System.out.println("Enter Values in this Pattern(ie:{1,aa})");
////                String ip = getString();
////                if (getString().equals("")) {
////                    break;
////                }
//try{}
//catch(NullPointerException e){
//    System.out.println("null values entered");}
//                
//
//            }
//        }
//
//    }
    public void setentity(S_Linklist[] ent){
        this.entity=ent;
    }
public void setentity(){
    
    

        this.entity[0].add(0,"a");
        this.entity[0].add(1,"a");        
        this.entity[0].add(3,"a");
        this.entity[0].add(4,"b");
        
        this.entity[1].add(2,"a");
        
        this.entity[2].add(2,"a");
        this.entity[2].add(2,"b");
        this.entity[2].add(3,"b");
        
        this.entity[3].add(2,"b");
        this.entity[3].add(1,"b");
        
        this.entity[4].add(3,"a");
        this.entity[4].add(4,"b");
    
}
    public void setlanguages(int lang) {
        this.validinputs = lang;
    }

    public static String getString() throws IOException {
        String s;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        s = br.readLine();
        return s;
    }
};
