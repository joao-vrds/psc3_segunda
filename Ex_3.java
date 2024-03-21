/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_3;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
public class Ex_3 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int totalDeEleitores = 0;
        int votosBrancos = 0;
        int votosNulos = 0;
        int votosValidos = 0;
        int totalDeVotos = 0;
        double porcentagemBrancos = 0;
        double porcentagemNulos = 0;
        double porcentagemValidos = 0;
        double porcentagemNaoVotos = 0;
        double naoVotos = 0;
        
        System.out.print("Digite o número total de eleitores: ");
        totalDeEleitores = input.nextInt();
        System.out.print("Digite o número de votos em branco: ");
        votosBrancos = input.nextInt();
        System.out.print("Digite o número de votos em nulos: ");
        votosNulos = input.nextInt();
        System.out.print("Digite o número de votos em válidos: ");
        votosValidos = input.nextInt();
        
        totalDeVotos = votosBrancos + votosNulos + votosValidos;
        naoVotos = totalDeEleitores - totalDeVotos;
        
        porcentagemBrancos = ( votosBrancos * 100 ) / totalDeEleitores; 
        porcentagemNulos = ( votosNulos * 100 ) / totalDeEleitores; 
        porcentagemValidos = ( votosValidos * 100 ) / totalDeEleitores; 
        porcentagemNaoVotos = ( naoVotos * 100 ) / totalDeEleitores; 
        
       if ( totalDeVotos > totalDeEleitores )
       {System.out.print("\n\nO valor de votos não pode ser maior que o número de eleitores.");}
       else {
        if ( porcentagemNaoVotos > 0 )
        {System.out.print("Do total de eleitores " + porcentagemValidos + "% foram votos valídos, " + porcentagemNulos + "% votaram nulo, " + porcentagemBrancos + "% votaram em branco e " + porcentagemNaoVotos + "% não votaram." );}
        else
        { System.out.print("Do total de eleitores " + porcentagemValidos + "% foram votos valídos, " + porcentagemNulos + "% votaram nulo e " + porcentagemBrancos + "% votaram em branco." );
       }
       }
    }
}
