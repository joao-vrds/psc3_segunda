/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_10;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex_10 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("#,##0.00");
       
       double valor = 0;
       double valorDeVenda = 0;
       int lucro = 0;
       
       System.out.println("Lojinnha do Sr. Aboo");
       System.out.println("Digite o valor do produto:");
       valor = input.nextDouble();
       
       if ( valor >= 50 )
       { valorDeVenda = (valor * 100) / 70;  lucro = 30 ; }
       else if ( valor >= 30 )
       { valorDeVenda = (valor * 100) / 60 ; lucro = 50 ;  }
       else if ( valor >= 10 )
       { valorDeVenda = (valor * 100) / 50 ; lucro = 40 ; }
       else 
       { valorDeVenda = (valor * 100) / 30 ; lucro = 30 ;}
       
       System.out.println("O valor de venda deve ser de: \tR$ " + df.format(valorDeVenda));
       System.out.println("E a porcetagem de lucro é de: \t" + lucro + "%");
       
       input.close();
    }
}
