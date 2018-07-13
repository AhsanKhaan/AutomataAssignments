/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver_finite_automata;

/**
 *
 * @author M.Ahsan
 */
public class FA {

    public int numberofstates;
    public int[] states;
    public char[] inputchar;
    public int[][] transitiontable;
    public int initialstate;
    public int[] finalstate;

    public FA(int numofstate, char[] input, int is, int[] fs) {
        this.numberofstates=numofstate;
        this.states = new int[numofstate];
        for (int i = 0; i < numofstate; i++) {
            this.states[i] = i;
        }
        this.inputchar = input;
        this.initialstate = is;
        this.finalstate = fs;
        for (int row = 0; row <=5; row++) {
            for (int col = 0; col <=2; col++) {
                this.transitiontable = new int[row][col];
            }
        }
        this.transitiontable[0][0] = 1;
        this.transitiontable[0][1] = 3;
        this.transitiontable[1][0] = 2;
        this.transitiontable[1][1] = 3;
        this.transitiontable[2][0] = 2;
        this.transitiontable[2][1] = 3;
        this.transitiontable[3][0] = 1;
        this.transitiontable[3][1] = 4;
        this.transitiontable[4][0] = 1;
        this.transitiontable[4][1] = 4;
        //initialstate

    }
    public boolean validate(String input){
        int current=this.initialstate;
        for (int i = 0; i < input.length(); i++) {
            
            switch (input.charAt(i)) {
                case 'a':
                    current=this.transitiontable[current][0];
                    break;
                case 'b':
                    current=this.transitiontable[current][1];
                    break;
                default:
                    current=0;
                    System.out.println("invalid input");
                    break;
            }
           }
        for (int j = 0; j < this.finalstate.length; j++) {
                if(current==this.finalstate[j]){
                    System.out.println("VALID");
                    return true;
                      }
                    }
        System.out.println("INVALID");
        
        return false;
    }

    


};
