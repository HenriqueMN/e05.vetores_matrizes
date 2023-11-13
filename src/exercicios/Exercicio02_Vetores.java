package exercicios;

import java.util.Scanner;

public class Exercicio02_Vetores {

	public static void main(String[] args) {
		// Algoritmo que lê um vetor com 10 números inteiros e exibe na tela todos os númeiros ímpares, pares, a soma de todos os números e a média de todos eles
		
		// Criação das variáveis e do Scanner
		int vetor[] = new int[10];
		int vetorPar[] = new int[10], iPar=0;
		int somaVetor=0, i;
		float mediaVetor;
		Scanner input = new Scanner(System.in);
			
		// Leitura dos inputs
		for(i = 0; i < 10; i++) {
			System.out.print("Insira o " + (i+1) + "º número: ");
			vetor[i] = input.nextInt();
			
			// Acréscimo do número à somatória
			somaVetor += vetor[i];
			
			if(vetor[i]%2 == 0) { //Checa se o número é par ou ímpar
				vetorPar[iPar] = vetor[i];
				iPar++; //Atualizar a variávei iPar para agir como índice do vetorPar e saber quantos elementos ele tem
			}
		}
		
		// Cálculo da média
		mediaVetor = somaVetor/10f;
		
		// Outputs
		System.out.print("\nElementos nos índices ímpares: ");
		for(i = 0; i < 10; i = i+2) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.print("\nElementos pares: ");
		for(i = 0; i < iPar; i++) {
			System.out.print(vetorPar[i] + " ");
		}
		
		System.out.print("\nSoma: " + somaVetor);
		System.out.printf("\nMédia: %.2f", mediaVetor);
		

	}

}
