/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalimposto;

/**
 *
 * @author emers
 */
public class ValidaImpostos {
    public static double CalcularImpostos(double valor, String nomeImposto){
        double taxaBase = CalcularImpostos(nomeImposto);
        double valorImposto = (valor*taxaBase/100);
        
        return valorImposto;
    }
    
    public static double CalcularImpostos(String nomeImposto){
        double impostoRetorno = 0;
        switch (nomeImposto.toUpperCase()){
            case "INSS":
                impostoRetorno = 8;
                break;
            case "IR":
                impostoRetorno = 20;
                break;
        }
        return impostoRetorno;
    }
}
