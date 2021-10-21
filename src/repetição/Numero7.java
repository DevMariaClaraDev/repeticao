package repetição;

import java.util.Scanner;

public class Numero7 {

	public static void main(String[] args) {
		
	Scanner numero = new Scanner (System.in);
	int valor1, valor2, x;
	
	System.out.print("Digite um número inteiro: ");
	valor1 = numero.nextInt();
	
	System.out.print("Digite outro número inteiro: ");
	valor2 = numero.nextInt();
	
	x = valor1;
	
	while (x <= valor2) {
		
	System.out.println(x);
	
	x = x + 1;
	
	}
	
	}

}
