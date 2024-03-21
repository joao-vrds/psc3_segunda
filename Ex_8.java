/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_8;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;

public class Ex_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double ladoA = 0, ladoB = 0, ladoC = 0;
        
        while(true){
        System.out.println("Digite o valor do lado A: ");
        ladoA = input.nextDouble();
        System.out.println("Digite o valor do lado B: ");
        ladoB = input.nextDouble();
        System.out.println("Digite o valor do lado C: ");
        ladoC = input.nextDouble(); 
        
        if ( ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoB + ladoA  )
        { break; }
        else{System.out.println("Valores inválidos para os lados.\n");}
        }
        
        if ( ladoA == ladoB && ladoA == ladoC && ladoB == ladoC )
        { System.out.print("Triângulo Equilátero");}
        if ( (ladoA == ladoB && ladoA != ladoC) || (ladoA == ladoC && ladoA != ladoB) || (ladoB == ladoC && ladoB != ladoA) )
        { System.out.print("Triângulo Isóceles");}
        if ( ladoA != ladoB && ladoA != ladoC && ladoB != ladoC )
        { System.out.print("Triângulo Escaleno");}
        
        input.close();
    }
}