/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_6;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
public class Ex_6 {

    public static void main(String[] args) 
    
    {
       Scanner input = new Scanner(System.in);
      
       int numero;
       
       System.out.println("Digite o um número de 1 a 4: ");
       numero = input.nextInt();
       
       switch(numero){
           case 1: 
               System.out.print("Bem-vindo(a) à estação das flores e renascimento, onde cada pétala é um convite para novos começos e cores vibrantes enchem nossos dias de alegria! 🌸✨");
               break;
           case 2: 
               System.out.print("Bem-vindo(a) ao verão, a época do sol radiante, das águas refrescantes e das memórias que aquecem o coração! ☀️🌊✨");
               break;
           case 3: 
               System.out.print("Bem-vindo(a) ao outono, a estação das folhas douradas que dançam ao vento, onde o aconchego das tardes frescas nos convida a saborear cada momento com serenidade e gratidão! 🍂🍁✨");
               break;
           case 4: 
               System.out.print("Bem-vindo(a) ao inverno, a estação da magia branca que transforma paisagens em obras de arte congeladas, onde o aconchego dos abraços aquece nossos corações e histórias ao redor do fogo nos unem em laços de carinho e união! ❄️🔥✨");
               break;
           default: 
               System.out.print("Número inválido.");
               
               input.close();
       }
       
    }
}
