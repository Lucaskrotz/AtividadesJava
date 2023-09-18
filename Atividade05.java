/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Atividade05 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Random r = new Random();
        
        int[] a = new int[10];
        int[] m = new int[10];
        
        System.out.println("Escreva 1 valor: ");
        int x = entrada.nextInt();
        
        
        int multi = 0;
        for(int i = 0; i < 10; i++){
        
        a[i] = r.nextInt(100);
        
        multi = a[i] * x;
        
        m[i] = multi;

        }
        
        
        for(int i = 0; i < 10; i++){
        
            System.out.println(m[i]);
        
        }
        
    }
    
}
