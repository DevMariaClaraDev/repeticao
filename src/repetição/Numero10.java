package repetição;

import java.util.Scanner;

public class Numero10 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner (System.in); 
	int contagem, x = 1, y, resultado;
	
	System.out.print("Digite o valor da base: ");
	y = numero.nextInt();
	
	System.out.print("Digite o valor do expoente: ");
	contagem = numero.nextInt();
	
	resultado = y;
	
	while (x < contagem){
	
	resultado = resultado * y;	
		
	x = x + 1;
		
	}

	System.out.print("O resultado é: " + resultado);
	
	}

}
