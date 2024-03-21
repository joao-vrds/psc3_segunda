/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_9;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
public class Ex_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int idade = 0;
        
        System.out.print("Digite sua idade: ");
        idade = input.nextInt(); 
        
        if ( idade < 16 )
        { System.out.print("\nNão eleitor");}
        else if ( (idade == 16) || (idade == 17) )
        { System.out.print("\nEleitor facultativo");}
        else if ( (idade >= 18) && ( idade <= 65) )
        { System.out.print("\nEleitor obrigatório");}
        else
        { System.out.print("\nEleitor facultativo");}
        
        input.close();
    }
}
