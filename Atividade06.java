/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;

import java.util.Random;

/**
 *
 * @author Lucas
 */
public class Atividade06 {
 
    public static void main(String[] args) {
        
        int [] temperatura = new int[365];
        
        Random r = new Random();
        int menorTemperatura = 46;
        int maiorTemperatura = -1;
        int soma = 0;
        int valorInferior = 0;
        int media = 0;
        
        for (int i = 0; i < 365; i++) {
            temperatura[i] = r.nextInt(45);
            
            if(temperatura[i] < menorTemperatura) {
            
                menorTemperatura = temperatura[i];
                
            }
            
             if(temperatura[i] > maiorTemperatura){
            
                maiorTemperatura = temperatura[i];
            }
             
             soma += temperatura[i];
            
            System.out.println(temperatura[i]);
        }
        
        media = soma / 365;
        
        for (int i = 0; i < 365; i++) {
              
            if(temperatura[i] < media){
                
                valorInferior++;
            
            }
            
            
        }
           
            
        
        
        System.out.println("Menor temperatura: " + menorTemperatura);
         System.out.println("Maior temperatura: " + maiorTemperatura);
         System.out.println("Media anual é de : " + media);
         System.out.println("Total de dias que a temperatura foi inferior a media, total de : " + valorInferior);
    }  
    
}
