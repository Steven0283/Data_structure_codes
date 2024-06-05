/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorial;

/**
 *
 * @author LABORATORIO 04
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println("Recursive Factorial Calculator");
        if (args.length < 1) {
            System.err.println("Error: Arguments Required");
            return;
        }
        
        int number;
        try {
            number = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Invalid arguments: " + args[0]);
            return;
        }
    }
    
    //n! is factorial when n is number
    //n! = n x (n - 1)...
    //4! = 4 x 3 x 2 x 1 = 24
    public static int calculateFactorial(int num){
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}
