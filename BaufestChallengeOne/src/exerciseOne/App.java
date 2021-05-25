package exerciseOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> secuence = new ArrayList();
		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una secuencia numeros");

		do {
			numero = sc.nextInt();
			secuence.add(numero);

		} while (numero != 0);

		int suma = 0;
		for (Integer i : secuence) {
			suma = suma + i;
		}

		Integer vMax = Collections.max(secuence);
		Integer vMin = Collections.min(secuence);
		float promedio = suma / secuence.size();

		System.out.println("El valor maximo es:" + vMax);
		System.out.println("el valor minimo es:" + vMin);
		System.out.println("El promedio es:" + promedio);

	}

}
