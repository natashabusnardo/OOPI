/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author natasha
 */
public class Exer1 {
    /**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;

		int vet[] = new int[TAM];
		
		for (int i = 0; i < vet.length; i++) 
			vet[i] = entrada.nextInt();
		
		
		for (int i = 0; i < vet.length; i++) 
			System.out.println(vet[i]);
		
		
	}
}
