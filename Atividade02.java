/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author Lucas
 */
public class Atividade02 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Random r = new Random();
        
        
        
        String[] nomes = new String[100];
        double[] limiteCredito = new double[100];
        boolean[] clienteAtivo = new boolean[100];
       
        
        
        for(int i = 0; i<100; i++){
            
            nomes[i] = UUID.randomUUID().toString().substring(0, 8);
            limiteCredito[i] = r.nextDouble() * 100;
            clienteAtivo[i] = r.nextBoolean();
    }

            //System.out.println(clienteAtivo[i]);
            //System.out.println(limiteCredito[i]);
            //System.out.println(i + "-" + nomes[i]);

                
                
                int posicaoMaiorLimite = 0;
                double valorMaior = 0;
                
                int contadorTrue = 0;
                
                double totalCredito = 0;
                
            for(int i = 0; i < nomes.length; i++){
            
                if(limiteCredito[i]>valorMaior){
          
              valorMaior = limiteCredito[i];
              posicaoMaiorLimite= i;
          }
                
                if(clienteAtivo[i]){
                
                     contadorTrue++;
                          
                }
                
                totalCredito += limiteCredito[i];
            
            }
            
            System.out.println("Usuario:" + nomes[50]);
            System.out.println("");
            System.out.println("Seu Credito é de: " + limiteCredito[50]);
            System.out.println("");
            System.out.println("O seu cadastro esta: " + clienteAtivo[50]);
            System.out.println("");
            System.out.println("o Cliente na possicao : " + posicaoMaiorLimite + " tem um  tatal de : " + limiteCredito[posicaoMaiorLimite] + " de Credito");
            System.out.println("");
            System.out.println("Tem um tatal de " + contadorTrue + " clientes Ativos");
            System.out.println("");
            System.out.println("O total de todos os cliente e de: " + totalCredito);
        
   }
}
