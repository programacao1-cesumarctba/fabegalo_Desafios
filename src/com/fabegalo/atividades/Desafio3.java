/**
 * 
 */
package com.fabegalo.atividades;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author fabegalo
 *
 */
public class Desafio3 {
	public String teste() {
		
		System.out.print("Digite um numero inteiro: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		//scan.close();
		
		
		long resultado = num;
		int x = 0;
		
		System.out.println("Re" + num);
		
		for(x = 1; x < num; x++) {
			resultado = resultado * x;
			
			System.out.println("Re" + resultado);
			System.out.println("x" + x);
		}
		
				
		return "\n Fatorial de "+ num +", é "+ resultado +"";
	}
}
