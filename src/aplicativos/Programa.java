package aplicativos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Contribuinte;
import entidades.Empresa;
import entidades.Individual;

public class Programa {

	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);
		
		List<Contribuinte> lista = new ArrayList<>();
		System.out.println("Entre com numero de contribuinte: ");
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			scan.nextLine();
			System.out.println("Dados do #" + (i+1) + " Contribuinte");
			System.out.print("Pessoa Fisica ou Pessoa Juridica: (F/J)");
			String seletor = scan.nextLine();
			if(seletor.equalsIgnoreCase("f")) {
				System.out.print("Nome: ");
				String nome = scan.nextLine();
				System.out.print("Rendimento anual: ");
				double rendimento = scan.nextDouble();
				System.out.print("Gastos com saude: ");
				double gastos = scan.nextDouble();
				
				Individual ind = new Individual(nome,rendimento, gastos);
				lista.add(ind);
			} else if(seletor.equalsIgnoreCase("j")) {
				System.out.print("Nome: ");
				String nome = scan.nextLine();
				System.out.print("Rendimento anual: ");
				double rendimento = scan.nextDouble();
				System.out.print("Número funcionários: ");
				Integer funcionario = scan.nextInt();
				
				Empresa e = new Empresa(nome, rendimento, funcionario);
			    lista.add(e);
			} else {
				System.out.println("Opção inexistente");
			}
		}
		
		System.out.println();
		System.out.println("Taxas Contribuintes: ");
		double somatorio = 0;
		for(Contribuinte c : lista) {
			somatorio += c.imposto();
			System.out.println(c);
		}
		
		System.out.println("Taxas Total: " + somatorio);
	scan.close();

	}

}
