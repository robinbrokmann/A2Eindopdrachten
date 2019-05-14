/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.drenthecollege.modules.a2.eindopdrachten;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erik Mast <e.mast@drenthecollege.nl>
 * @author Robin Brokmann 106778@student.drenthecollege.nl
 */
public class Opdracht1 {
    //Fibonacci reeks is 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static void main(String[] args) {

        final int nummer = 10;

        StringBuilder builder = new StringBuilder();
        builder.append("De fibonacci reeks is");

        List<String> elementlist = new ArrayList<>();


        for (int counter = 0; counter < nummer; counter++){
            builder.append(fibonacciBerekenen(counter));
            if (counter != nummer  - 1){
                builder.append(",");
            }
            elementlist.add("Element " + counter + " is: " + fibonacciBerekenen(counter));

        }
        System.out.println(builder.toString());

        for(String s : elementlist){
            System.out.println(s);
        }
    }

    private static int fibonacciBerekenen(int nummer){
        if(nummer < 2){
            return nummer;
        } else {
            return (fibonacciBerekenen(nummer - 1) + fibonacciBerekenen(nummer - 2));
        }
    }
}
