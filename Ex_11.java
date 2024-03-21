/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_11;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ex_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char opcao = ' ';
        double saldo = 0;
        double deposito = 0;
        double saque = 0;
        boolean validador = true;
        List<String> extrato = new ArrayList<String>(); 
        extrato.add(" Saldo inicial: R$ "+ saldo);       

        while(validador){
        System.out.println("\n\n\t\tCaixa eletrônico\n");
        System.out.println("Exibir saldo:\t\t(1)");
        System.out.println("Exibir extrato:\t\t(2)");
        System.out.println("Realizar depósito:\t(3)");
        System.out.println("Reazlizar saque:\t(4)");
        System.out.println("Sair:\t\t\t(5)");
        
        System.out.print("\nDigite sua opção: ");
        opcao = input.next().charAt(0);
                
        
        switch (opcao) {
            case '1' : 
                System.out.print("\nSeu saldo atual é de R$ " + saldo);
                break;
            case '2' : 
                   extrato.add(" Saldo atual: $"+ saldo);
                for(String string : extrato) {
                    System.out.println(string); } 
                break;
            case '3' :
                System.out.print("\nDigite o valor de depósito: ");
                deposito = input.nextDouble();
                saldo += deposito;
                break;
            case '4' :
                System.out.print("\nDigite o valor de saque: ");
                saque = input.nextDouble();
                saldo -= saque;
                break;
            case '5' :
                validador = false;
                break;
            default :
                System.out.print("\nOpção inválida.");
                validador = false;
                break;
        }
        
        }
    }
}
