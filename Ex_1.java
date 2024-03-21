/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_1;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
public class Ex_1 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int x;
       int y;
       int resultado;
       
       System.out.print("Digite o dividendo: ");
       x = input.nextInt();
       
       System.out.print("Digite o divisor: ");
       y = input.nextInt();
       
       if ( y == 0 )
       {System.out.print("Essa divisão não é possível realizar."); }
        
       resultado = x / y;
       
       System.out.print("O valor da divisão é: " + resultado);
        
       input.close(); 
    }
}
