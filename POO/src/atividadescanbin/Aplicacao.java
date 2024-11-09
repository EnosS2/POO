package atividadescanbin;

import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {
		int numero1, numero2;

		Scanner leitura = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		numero1 = leitura.nextInt();
		System.out.println("Informe o segundo número: ");
		numero2 = leitura.nextInt();

		leitura.close();

		System.out.println("Número 1 convertido: " + Integer.toBinaryString(numero1));
		System.out.println("Número 2 convertido: " + Integer.toBinaryString(numero2));
	}
}
