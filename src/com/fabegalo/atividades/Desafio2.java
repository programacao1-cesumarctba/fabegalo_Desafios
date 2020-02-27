package com.fabegalo.atividades;

import java.util.Scanner;

public class Desafio2 {

	public String teste() {
		System.out.print("Digite um numero inteiro: ");
		Scanner scan = new Scanner(System.in);
		int num2 = scan.nextInt();
		//scan.close();
		
		String cond = "";
		
		if(num2 % 2 == 0 && num2 < 10) {
			cond = "Não é estranho";
		}else if(num2 % 2 == 0 && num2 < 20 && num2 > 10) {
			cond = "Estranho";
		}else if(num2 % 2 == 0 && num2 > 20) {
			cond = "Não é estranho";
		}else if(num2 % 2 == 1){
			cond = "Estranho";
		}
		
		
		return cond;
	}

}
