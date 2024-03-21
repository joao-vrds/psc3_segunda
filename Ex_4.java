/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_4;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;

public class Ex_4 
{
    public static void calculoSalario() {
        Scanner entrada = new Scanner(System.in);
        double salario;
        double taxaAumento1 = 1.1;
        double taxaAumento2 = 1.2;
        double taxaAumento3 = 1.3;

        System.out.println();
        System.out.print("Por favor, informe o valor do salário atual: ");
        salario = entrada.nextDouble();

        if(salario <= 1000) {
            salario *= taxaAumento3;
        }

        if(salario <= 2000) {
            salario *= taxaAumento2;
        }

        if(salario <= 3000) {
            salario *= taxaAumento1;
        }

        if (salario <= 4000) {
            salario = (salario * taxaAumento1) + 200;
        }

        System.out.println();
        System.out.printf("Novo Salário: R$ %.2f\n\n", salario);
        
        entrada.close();
    }
}
