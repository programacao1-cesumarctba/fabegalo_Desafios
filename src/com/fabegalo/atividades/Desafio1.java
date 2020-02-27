/**
 * 
 */
package com.fabegalo.atividades;

import java.util.Scanner;

/**
 * @author fabegalo
 *
 */
public class Desafio1 {

	public String teste() {
		System.out.print("Digite um numero inteiro: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		//scan.close();
		
		String cond;
		
		if(num % 2 == 0) {
			cond = "Numero é par";
		}else {
			cond = "Numero é Impar";
		}
		
		return cond;
	}
}
