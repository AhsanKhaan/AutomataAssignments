/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver_regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

/**
 *
 * @author M.Ahsan
 */
public class Driver_regex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, PatternSyntaxException {
        // TODO code application logic here
        //email validation
        //[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]+@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}
        //I am sorry I have not accomplished character validation task because of exception
        String in;
        while(true){
            System.out.println("Enter The value of number you want to validate");
            System.out.println("1.Float validation");
            System.out.println("2.Integor validation");
            System.out.println("3.Character validation");
            System.out.println("4.String validation");
            System.out.println("5.Identifier validation");
            System.out.println("6.E-mail validation");
            System.out.println("7.All Except Character");
            
             in=getString();
            if (in.equals("")) {
                break;
            }
        Regex regex = new Regex();
        Pattern p;
        
        

        switch (in) {
            case "1":
                p = Pattern.compile(regex.floatex());
                break;
            case "2":
                p = Pattern.compile(regex.int_ex());
                break;
            case "3":
                p = Pattern.compile(regex.char_ex());
                break;
            case "4":
                p = Pattern.compile(regex.string_ex());
                break;
            case "5":
                p = Pattern.compile(regex.identifier_ex());
                break;
            case "6":
                p = Pattern.compile(regex.email_ex());
                break;
            case "7":
                p = Pattern.compile(regex.all_ex());
                break;
            default:
                System.out.println("Enter Given Numbers Correctly");
                throw new AssertionError();
        }
            System.out.println("Enter The Expression you want to validate:");
           String ex=getString();
           if(ex.equals("")){
               break;
           }
        Matcher m = p.matcher(ex);
            if (m.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("In-valid");
        }
            System.out.println("Do you Want To contine Validation(Y/N)");
            in=getString();
            if (in.equals("n")) {
                break;
            }else if(in.equals("N")){
            break;
            }
           
        }
        
    };

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
