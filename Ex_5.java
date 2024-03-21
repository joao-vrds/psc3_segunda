/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_5;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex_5
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###0.00");
        
        double altura = 0;
        double peso = 0;
        double imc = 0;
        
        System.out.print("Digite o a altura em centímetros: ");
        altura = input.nextDouble();
        
        System.out.print("Digite o peso em quilogramas: ");
        peso = input.nextDouble();
        
        imc = peso / ((altura / 100 )  * ( altura / 100));
        
        if( imc <= 18.5 )
        { System.out.print("Você está baixo do peso ideal."); }
        else if ( imc <= 24.9 )
        { System.out.print("Você está no peso ideal. Parabéns!!!"); }
        else if ( imc <= 29.9 )
        { System.out.print("Você está levemente acima do peso."); }
        else if ( imc <= 34.9 )
        { System.out.print("Você está com obesidade grau 1"); }
        else if ( imc <= 39.9 )
        { System.out.print("Você está com obesidade grau 2"); }
        else 
        { System.out.print("Você está com obesidade grau 3"); }
        
        input.close();
    }
}

