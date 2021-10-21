package repetição;

import java.util.Scanner;

public class MaisNumero11 {

	public static void main(String[] args) {
	
		Scanner numero = new Scanner (System.in); 
		int y, a = 0, b = 0;
		
		for (int x = 1; x <= 10; x++) {
		
		System.out.println("Digite os valores: ");
		y = numero.nextInt();
		
		if (y == 1 || y % 3 == 0) {
			
			a = a + 1;
		}
		
		if (y % 2 == 0) { 
		
			b = b + 1;
		}
		}
		
		System.out.println("A quantidade de números ímpares é: " + b);
		System.out.println("A quantidade de números pares é: " + a);
	
	}

}
