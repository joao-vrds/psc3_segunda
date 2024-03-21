/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_7;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex_7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
                
        String nome = null;
        int quantidadeAdquirida = 0;
        double preco = 0;
        double total = 0;
        double i = 0;
        
        System.out.print("Digite o nome do produto: ");
        nome = input.next();
        System.out.print("Digite a quantidade adquirida: ");
        quantidadeAdquirida = input.nextInt();
        System.out.print("Digite o preço: ");
        preco = input.nextDouble();
        
        
        if(quantidadeAdquirida <= 5)
        { i = 0.02; }
        else if( quantidadeAdquirida <= 10)
        { i = 0.03; }
        else if( quantidadeAdquirida < 30)
        { i = 0.05; }
        else
        { i = 0.1; }
        
        total = (quantidadeAdquirida * preco) * ( 1 - i );
        
        System.out.printf("Foi adquirido " + quantidadeAdquirida + " " + nome + " e o valor total é de R$ " + df.format(total));
        
        input.close();
    }
}
