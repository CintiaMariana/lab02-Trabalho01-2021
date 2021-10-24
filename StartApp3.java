package br.edu.univas;
import java.util.Scanner;
import java.util.ArrayList;

public class StartApp3 {
	public static void main (String[]arg) {
		Scanner leitura = new Scanner (System.in);
		
		ArrayList<String> ingles = new ArrayList<String>(100);
		ArrayList<String> traducao = new ArrayList<String>(100);
		int opcao;
		
		do {
		System.out.println("-------- Menu Dicionário de Inglês --------");
		System.out.println("1 - Cadastrar Palavrar");
		System.out.println("2 - Procurar Palavra");
		System.out.println("3 - Excluir Palavra");
		System.out.println("4 - Editar Palavra");
		System.out.println("5 - Listar dicionário: ");
		System.out.println("6 - Sair");
		System.out.println("Por favor, digite o número da opção desejada: ");
		opcao = leitura.nextInt();
		leitura.nextLine();
		
		if(opcao == 1) {
		System.out.println("Por favor, digite a palavra em Inglês: ");
		String palavra = leitura.nextLine();
		if (ingles.contains(palavra)) {
			System.out.println("Palavra já está cadastrada.");
		}
		else {
			ingles.add(palavra);
			System.out.println("Por favor, digite a palavra em Português: ");
			palavra = leitura.nextLine();
			traducao.add(palavra);
		}
		}
		
		else if (opcao == 2) {
			System.out.println("Por favor digite a palavra que deseja saber a tradução: ");
			String palavra = leitura.nextLine();
			for (int i = 0; i < ingles.size(); i++) {
			if (ingles.get(i).equals(palavra)) {
				System.out.println(ingles.get(i) + "\n" + "Tradução: " + traducao.get(i));
		}
		}
		}
		
		else if (opcao == 3) {
			System.out.println("Por favor digite a palavra inglês que deseja excluir: ");
			String palavra = leitura.nextLine();
			for (int i = 0; i < ingles.size(); i++) {
			if (ingles.get(i).equals(palavra)) {
			ingles.remove(i);
			traducao.remove(i);
			}	
			}
			}		
		else if (opcao == 4) {
			System.out.println("Por favor digite a palavra inglês que deseja alterar: ");
			String palavra = leitura.nextLine();
			for (int i = 0; i < ingles.size(); i++) {
			if (ingles.get(i).equals(palavra)) {
			System.out.println("Digite a nova palavra em inglês:");
			palavra = leitura.nextLine();
			ingles.set(i, palavra);
			System.out.println("Digite a nova tradução: ");
			palavra = leitura.nextLine();
			traducao.set(i, palavra);
			}
			}
			}
		else if (opcao == 5) {
			for (int i = 0; i < ingles.size(); i++) {
				System.out.println("Inglês: " + ingles.get(i) + "\n" + "Traducao: " + traducao.get(i));
			}
		}
		else if (opcao == 6) {
			System.out.println("Ok, até mais :) ");
			}
		else {
			System.out.println("Por favor, digite uma opção válida");
		}
		
		} while (opcao != 6);
		leitura.close();
	}
	public static void Procurar (String palavra) {
		
		
	}
}
