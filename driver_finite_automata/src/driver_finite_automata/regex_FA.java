/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver_finite_automata;

import java.util.regex.*;

/**
 *
 * @author M.Ahsan
 */
public class regex_FA {

    public int numberofstates;
    public int[] states;
    public int validinputs;
    public int[][] transitiontable;
    public int initialstate;
    public int[] finalstate;

    public regex_FA(int nofstates, int is, int[] fs, int[][] tt, int validinputs) {
        this.numberofstates = nofstates;
        this.states = new int[this.numberofstates];
        //number of states    
        for (int i = 0; i < nofstates - 1; i++) {
            this.states[i] = i;
        }
        //setting initial states
        this.initialstate = is;
        //setting final states
        this.finalstate = fs;

        this.validinputs = validinputs;
        for (int row = 0; row <= this.validinputs; row++) {
            for (int col = 0; col < this.numberofstates; col++) {
                this.transitiontable = new int[row][col];
            }
        }
        this.transitiontable = tt;

    }

    public void settt(int[][] transition) {
        this.transitiontable = transition;
    }

    public int[][] gettt() {
        return this.transitiontable;
    }

    public boolean valid_identifier(String value) {
        int current = this.initialstate;
        Pattern slash, alpha, numeric;
        Matcher slash_m, alphabet_m, numeric_m;
        //^[_]*[a-zA-Z$][a-zA-Z0-9_$]*$
        alpha = Pattern.compile("[a-zA-Z$]");
        numeric = Pattern.compile("[0-9]");
        slash = Pattern.compile("[_]");
        current = this.initialstate;
        for (int i = 0; i < value.length(); i++) {

//             Matcher m = p.matcher(value);
            alphabet_m = alpha.matcher(String.valueOf(value.charAt(i)));
            slash_m = slash.matcher(String.valueOf(value.charAt(i)));
            numeric_m = numeric.matcher(String.valueOf(value.charAt(i)));
            if (alphabet_m.matches()) {
                current = this.transitiontable[current][0];
            } else if (numeric_m.matches()) {
                current = this.transitiontable[current][1];
            } else if (slash_m.matches()) {
                current = this.transitiontable[current][2];
            } else {
                System.out.println("Invalid Input");
            }
        }
        for (int i = 0; i < finalstate.length; i++) {
            if (current == finalstate[i]) {
                System.out.println("valid ");
                return true;
            }
        }

//        Pattern p;
//        p = Pattern.compile("(^[_]*[a-zA-Z$][a-zA-Z0-9_$]*)$");
//        if (m.matches()) {
//            System.out.println("valid");
//        } else {
//            System.out.println("In-valid");
//        }
        return false;
    }

    public boolean valid_integer(String value) {

        int current = this.initialstate;
        Pattern sign, numeric;
        Matcher sign_m, numeric_m;
        //^[_]*[a-zA-Z$][a-zA-Z0-9_$]*$

        numeric = Pattern.compile("[0-9]");
        sign = Pattern.compile("[+-]");
        current = this.initialstate;
        for (int i = 0; i < value.length(); i++) {

//             Matcher m = p.matcher(value);
            sign_m = sign.matcher(String.valueOf(value.charAt(i)));
            numeric_m = numeric.matcher(String.valueOf(value.charAt(i)));
            if (numeric_m.matches()) {
                current = this.transitiontable[current][0];
            } else if (sign_m.matches()) {
                current = this.transitiontable[current][1];
            } else {
                System.out.println("Invalid Input");
            }
        }
        for (int i = 0; i < finalstate.length; i++) {
            if (current == finalstate[i]) {
                System.out.println("valid ");
                return true;
            }
        }

//        Pattern p;
//        p = Pattern.compile("(^[_]*[a-zA-Z$][a-zA-Z0-9_$]*)$");
//        if (m.matches()) {
//            System.out.println("valid");
//        } else {
//            System.out.println("In-valid");
//        }
        return false;
    }

    public boolean validate_float(String value) {
        int current = this.initialstate;
        Pattern sign, numeric, dot,exp;
        Matcher sign_m, numeric_m, dot_m,exp_m;
        //^[_]*[a-zA-Z$][a-zA-Z0-9_$]*$

        numeric = Pattern.compile("[0-9]");
        sign = Pattern.compile("[+-]");
        dot = Pattern.compile("[.]");
        exp=Pattern.compile("[eE]");
        current = this.initialstate;
        for (int i = 0; i < value.length(); i++) {

//             Matcher m = p.matcher(value);
            sign_m = sign.matcher(String.valueOf(value.charAt(i)));
            numeric_m = numeric.matcher(String.valueOf(value.charAt(i)));
            dot_m = dot.matcher(String.valueOf(value.charAt(i)));
            exp_m=exp.matcher(String.valueOf(value.charAt(i)));
           
            if (numeric_m.matches()) {
                current = this.transitiontable[current][0];
            } else if (sign_m.matches()) {
                current = this.transitiontable[current][1];
            } else if (dot_m.matches()) {
                current=this.transitiontable[current][2];
            } else if(exp_m.matches()){
                current=this.transitiontable[current][3];
            } 
            else{
                System.out.println("Invalid Input");
            }
        }
        for (int i = 0; i < finalstate.length; i++) {
            if (current == finalstate[i]) {
                System.out.println("valid ");
                return true;
            }
        }

//        Pattern p;
//        p = Pattern.compile("(^[_]*[a-zA-Z$][a-zA-Z0-9_$]*)$");
//        if (m.matches()) {
//            System.out.println("valid");
//        } else {
//            System.out.println("In-valid");
//        }
        return false;
    }

};
