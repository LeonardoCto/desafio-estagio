package desafio_estagio;

import java.util.Scanner;

public class Primos {

	 static boolean verificarNumeroPrimo(int numero) {
		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Informe um número: ");
		numero = teclado.nextInt();
		if (numero <= 1) {
			System.out.println("Número deve ser maior que 1");
		}
		for (int i = 2; i < numero; i++) {
			if (verificarNumeroPrimo(i)) {
				System.out.print(i + " ");
			}
			teclado.close();
		}
	}
}
