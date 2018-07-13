/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver_finite_automata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author M.Ahsan
 */
public class Driver_finite_automata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //manual Solving
        char[] char_array = {'a', 'b'};
        int[] finalstate = {2, 4};
        FA f = new FA(5, char_array, 0, finalstate);
        f.validate("baaba!a");

        //auto solving
//        String in, states, initial_state =" ", finalstates,num_of_finalstates;
//        while (true) {
//            System.out.println("*********Dynamic Finite Automata*****************************");
//            System.out.println("Enter Number Of States");
//            states = getString();
//                System.out.println("Enter Initial State");
//                initial_state = getString();
//                System.out.println("Enter Number Of final States");
//                num_of_finalstates=getString();
//            System.out.println("Enter Final States");
//            
//            
//            finalstates=getString();
//            for (int i = 0; i < num_of_finalstates.length(); i++) {
//            int[] finalarray=new int[num_of_finalstates.length()-1];    
//                finalarray[i]=Integer.parseInt(finalstates);
//            }
//            
//
//
//            System.out.println("Do you Want To Contine (Y/N)");
//            in = getString();
//            if (in.equals("n")) {
//                break;
//            } else if (in.equals("N")) {
//                break;
//            }
//        }

    }

    ;
//    public static String getString() throws IOException {
//
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//        String s = br.readLine();
//        return s;
//    }

}
