package exercicios;

import java.util.Scanner;

public class Exercicio03_Matrizes {

	public static void main(String[] args) {
		// Algoritmo que pede ao usuário para criar uma matriz e retorna todos os elementos da diagonal principal e da diagonal secundária e suas respectivas somas.
				
		// Criação das variáveis
		int matriz[][] = new int[3][3];
		int diagPrinc[] = new int[3];
		int diagSec[] = new int [3];
		int i, j, somaDiagonalPrinc=0, somaDiagonalSec=0;
		Scanner input = new Scanner(System.in);
			
		// For Loop
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				
				// Leitura dos inputs
				System.out.print("Insira o valor da posição " + i + ", " + j + ": ");
				matriz[i][j] = input.nextInt();
				
				// Verifica se o elemento faz parte da diagonal principal
				if(i == j) {
					diagPrinc[i] = matriz[i][j];
					somaDiagonalPrinc += matriz[i][j];
				}
				
				// Verifica se o elemento faz parte da diagonal secundária
				if((i + j) == 2) {
					diagSec[i] = matriz[i][j];
					somaDiagonalSec += matriz[i][j];
				}
			}
		}
		
		// Outputs
		System.out.print("\nElementos da diagonal principal: ");
		
		for(i = 0; i < 3; i++) {
			System.out.print(diagPrinc[i] + " ");
		}
		System.out.print("\nElementos da diagonal secundária: ");
		
		for(i = 0; i < 3; i++) {
			System.out.print(diagSec[i] + " ");
		}
		System.out.print("\nSoma dos elementos da diagonal principal: " + somaDiagonalPrinc);
		System.out.print("\nSoma dos elementos da diagonal secundária: " + somaDiagonalSec);
	}

}
