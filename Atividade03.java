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
public class Atividade03 {
    public static void main(String[] args) {
        
        int[] alunos = new int[20];
        
        Random r = new Random();
            int soma = 0;
        for(int i = 0; i < 20; i++){
        
            alunos[i] = r.nextInt(100);
            soma += alunos[i];
            
        }

           int media = 0;
           int contadorMedia = 0;
           media = soma / 20;
        for(int i = 0; i < alunos.length; i++){
            
            
            
            if(alunos[i] > media){
            
            contadorMedia++;
            
            }
            
        }
       
        System.out.println("A media é de " + media);
        System.out.println( contadorMedia + " passaram acima da media");
        
    } 
}
