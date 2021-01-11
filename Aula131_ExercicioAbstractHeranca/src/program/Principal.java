package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<Pessoa>();
		
		System.out.print("Quantas taxas serão adicionadas? ");
		int qnt = sc.nextInt();
		
		for(int i = 1; i<=qnt; i++) {
			System.out.println("Dados #" + i);
			
			System.out.print("Pessoa Fisica ou Juridica? (f/j)");
			char c = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Renda Anual: R$");
			double rendaAnual = sc.nextDouble();
			
			if(c=='f' ||c=='F') {
				System.out.print("Dinheiro gasto com saude: R$");
				double gastoSaude = sc.nextDouble();
				Pessoa p = new PessoaFisica(nome, rendaAnual, gastoSaude);
				list.add(p);
			}else if(c=='j' || c=='J') {
				System.out.print("Numero de Funcionarios: ");
				Integer nFuncionarios = sc.nextInt();
				Pessoa p = new PessoaJuridica(nome, rendaAnual, nFuncionarios);
				list.add(p);
			  }
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("Dados dos que sofreram taxas de impostos: ");
		
		for(Pessoa p : list) {
			System.out.println(p.getNome() + " - R$" + String.format("%.2f",p.calcularImposto()));
		}
		
		Double soma = 0.0;
		for(Pessoa p : list) {
			soma += p.calcularImposto();
		}
		System.out.println("Total de Impostos: R$" + String.format("%.2f",soma));
		
		sc.close();
	}

}
