/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver_nfa;
import java.util.ArrayList;
/**
 *
 * @author M.Ahsan
 */
public class node {

    private String validsstr;
    private int state;
    public node() {
        this.validsstr = "";
        this.state = 0;
    }

    public node(int transition, String value) {
        this.validsstr = value;
        this.state = transition;
    }

    public void setstate(int state) {
        this.state = state;
    }

    public int getstate() {
        return this.state;
    }

    public void setString(String str) {
        this.validsstr = str;
    }

    public String getString() {
        return this.validsstr;
    }
};
