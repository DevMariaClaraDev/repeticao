package repeti��o;

import java.util.Scanner;

import java.lang.Math;

public class Numero9 {

	public static void main(String[] args) {
		
	Scanner numero = new Scanner (System.in);
	int x = 0, y = 0, resultado = 0;
	
	while (x <= 10 && y <= 10) {
	
	System.out.print("Digite o n�mero de qual t�buada voc� deseja obter: ");
	x = numero.nextInt();
	
	System.out.print("Digite o valor que ser� multiplicado pelo n�mero: ");
	y = numero.nextInt();
	
	resultado = x * y;
	
	System.out.print("O resultado �: " + x);
	System.out.print("X");
	System.out.print(y);
	System.out.print("=");
	System.out.println(resultado);
	
	}
	
	}

}
