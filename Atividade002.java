/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;

import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author Lucas
 */
public class Atividade002 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String[] nomes = new String[10];
        
        
        boolean flag = false;
        
        for(int i = 0; i<10; i++){
        
            nomes[i] = UUID.randomUUID().toString().substring(0, 8);
     
        }
            System.out.println(nomes[0]);
            System.out.println("Escreva 1 nome para procurar");
            String nome = entrada.next();
        for(int i = 0; i < nomes.length; i++){
            
            if(nomes[i].equals(nome)){
            
                flag = true;
         
            }
           
        } 
        if(flag){
        
            System.out.println("Achei");
        } else {
        
            System.out.println("Nao achei");
        }
        
    }
    
}
