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
public class Atividade04 {
    
    public static void main(String[] args) {
        
        int[] q = new int[20];
        
        Random r = new Random();
        
        for(int i = 0; i < 20 ; i++){
        
            q[i]= r.nextInt(100);
            
            System.out.println(q[i]);
        }
         int valorMaior = 0;
         int valorMenor = 100;
         int contador1 = 0;
         int contador2 = 0;
        for(int i = 0; i < 20; i++){
                
            if(q[i] > valorMaior){
            
                valorMaior = q[i];
                
                contador1 = i;
            }
            
            if(q[i] < valorMenor){
            
                valorMenor = q[i];
                
                contador2 = i;
            }
           
            
        }
        
        System.out.println("A nota maior é : "+ contador1 + " - " + valorMaior);
        System.out.println("A nota menor é :" + contador2 + " - "+ valorMenor);
        
        
    }
    
}
