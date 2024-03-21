/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_2;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
public class Ex_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double nota1;
        double nota2;
        double nota3;
        double media;
        
        System.out.print("Digite o a primeira nota: ");
        nota1 = input.nextDouble();
        
        System.out.print("Digite o a segunda nota: ");
        nota2 = input.nextDouble();
        
        System.out.print("Digite o a terceira nota: ");
        nota3 = input.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        if ( media >= 7 )
            System.out.print("Sua média foi " + media + ". Parabéns você foi aprovado!!!");
        else 
            System.out.print("Sua média foi " + media + ". Infelizmente você foi reprovado.");
        
        input.close();
    }
}
