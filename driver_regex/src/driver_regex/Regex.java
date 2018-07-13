/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver_regex;

import java.util.regex.*;

/**
 *
 * @author M.Ahsan
 */
public class Regex {

    String pattern;
    String expression;

    public void setpattern(String patt) {
        this.pattern = patt;
    }

    public void setexpression(String ex) {
        this.expression = ex;
    }

    public String getpattern() {
        return this.pattern;
    }

    public String getexpression() {
        return this.expression;
    }

    public String floatex() {
        String float_ex = "(([+-]?)([0-9]*)([.])([0-9]+)([Ee]?)([+-]?)([0-9]*)|(([0-9]+)([Ee]?)([+-]?)([0-9]*)))";
        return float_ex;
    }

    public String int_ex() {
        String int_ex = "(([+-]?)([0-9]*)([.]?))";
        return int_ex;
    }

    public String char_ex() {
        //mam I have got an exception it's not resolving
        String char_ex = "(\')((\\|\'|\"|\\n|\\b|\\o|\\r|\\f|\\t|([!@#$%^&*()_+=-{}[]|:;,.?])|[a-zA-Z0-9]))(\')";
        return char_ex;
    }

    public String identifier_ex() {
        String id_ex = "(^[_]*[a-zA-Z$][a-zA-Z0-9_$]*)$";
        return id_ex;
    }

    public String string_ex() {
        String str_ex = "^(([a-zA-Z0-9]+)(.{8,}))$";
        return str_ex;
    }

    public String email_ex() {
        String email = "([a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]+@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6})";
        return email;
    }

    public String all_ex() {
        String all_ex = "(([a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]+@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6})|(([a-zA-Z0-9]+)(.{8,}))|([_]*[a-zA-Z$][a-zA-Z0-9_$]*)|(([+-]?)([0-9]*)([.]?)))|((([+-]?)([0-9]*)([.])([0-9]+)([Ee]?)([+-]?)([0-9]*)|(([0-9]+)([Ee]?)([+-]?)([0-9]*))))";
        return all_ex;
    }
};
