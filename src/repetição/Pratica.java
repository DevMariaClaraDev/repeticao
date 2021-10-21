package repetição;

import java.util.Scanner;

public class Pratica {

	public static void main(String[] args) {
	
		Scanner numero = new Scanner (System.in);
		double raiz, r, z, g, resultadog, areat, areaf, resultadoa, litros, latas, preco;
		int valor;
		
		System.out.print("Informe o valor de r em metros: ");
		r = numero.nextDouble();
		
		System.out.print("Informe o valor de z em metros: ");
		z = numero.nextDouble();
		
		g = (r * r) + (z * z);
		
		resultadog = Math.sqrt(g);
		
		areat = 3.14f * r * (r + g);
		areat = areat * 2;
		
		areaf = 3.14f * (r * r);
		
		resultadoa = areat - areaf;
		
		litros = resultadoa * 3.45f;
		
		latas = litros/18;
		
		System.out.print("Informe o tipo da tinta que será utilizada. Escreva 1, 2 ou 3: ");
		valor = numero.nextInt();
		
		if (valor == 1) {
		
		preco = latas * 238.90f;	
			
		}
		
		else if (valor == 2) {
			
		preco = latas * 467.98f;
		
		}
		
		else {
			
		preco = latas * 758.34f;
			
		}
				
		System.out.println("A área que deve ser pintada é: " + resultadoa);
		
		System.out.println("O númerode litros é: " + litros);
		
		System.out.println("O número de latas é: " + latas);
		
		System.out.println("O valor cobrado é: " + preco);
		

	}

}
