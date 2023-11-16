package desafio_estagio;

import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPrimosRecursiva {

	private ArrayList<Integer> primosAte(int numero, ArrayList<Integer> primos) {
		
		boolean primo = true;
		for (int antecessor = numero - 1; antecessor > 1; antecessor--) {
			if (numero % antecessor == 0) {
				primo = false;
			}
		}

		if (primo) {
			primos.add(numero);
		}

		if (numero > 2) {
			return primosAte(numero - 1, primos);
		} else {
			return primos;
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;

		System.out.println("Informe um número: ");
		numero = teclado.nextInt();

		if (numero <= 1) {
			System.out.println("Número deve ser maior que 1");
		} else {
			NumerosPrimosRecursiva numerosPrimos = new NumerosPrimosRecursiva();
			ArrayList<Integer> primos = numerosPrimos.primosAte(numero, new ArrayList<>());

			System.out.println(primos);
		}

		teclado.close();
	}
}
