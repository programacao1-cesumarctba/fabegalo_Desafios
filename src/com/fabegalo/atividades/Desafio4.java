/**
 * 
 */
package com.fabegalo.atividades;

import java.util.Scanner;

/**
 * @author fabegalo
 *
 */
public class Desafio4 {

	public String teste() {
		int x;
		System.out.print("Digite um numero inteiro: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		for(x = 1 ;x <= 10; x++) {
			System.out.println(num + "x" + x + " = "+ num * x);
		}
		
		return "Fim do programa :D";
	}
}
