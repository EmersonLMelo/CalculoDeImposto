/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principalimposto;

/**
 *
 * @author emers
 */
public class PrincipalImposto {

    public static void main(String[] args) {
        double taxaBaseINSS = ValidaImpostos.CalcularImpostos("IR");
        double valorImpostoINSS = ValidaImpostos.CalcularImpostos(2000,"IR");
        
        System.out.println("A taxa base para o INSS *" + taxaBaseINSS + "*");
         System.out.println("O INSS para o valor de 2000 é de: *" + valorImpostoINSS + "*");
    }
}
