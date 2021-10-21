package repetição;

import java.util.Scanner;

import java.lang.Math;

public class Numero9 {

	public static void main(String[] args) {
		
	Scanner numero = new Scanner (System.in);
	int x = 0, y = 0, resultado = 0;
	
	while (x <= 10 && y <= 10) {
	
	System.out.print("Digite o número de qual tábuada você deseja obter: ");
	x = numero.nextInt();
	
	System.out.print("Digite o valor que será multiplicado pelo número: ");
	y = numero.nextInt();
	
	resultado = x * y;
	
	System.out.print("O resultado é: " + x);
	System.out.print("X");
	System.out.print(y);
	System.out.print("=");
	System.out.println(resultado);
	
	}
	
	}

}
