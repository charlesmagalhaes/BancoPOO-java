package Application;

import java.util.Scanner;

import Entities.Banco;
import Entities.ContaCorrente;
import Entities.ContaPoupanca;

public class Executavel {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		Banco cliente = new Banco();
		
		System.out.println("----------------------Banco Jupiter SA----------------------------------------");
		System.out.println();
	
		System.out.println("1: Criar conta");
		System.out.println("2: Selecionar conta");
		System.out.println("	a: Depositar");
		System.out.println("	b: Sacar");
		System.out.println("	c: Transferir");
		System.out.println("	d: Gerar Relat�rio");
		System.out.println("	e: Gerar Relat�rio");
		System.out.println("3: Remover conta");
		System.out.println("4: Gerar Relat�rio geral das contas");
		System.out.println("5: Finalizar Aplica��o");
		System.out.println();
		System.out.println();
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		System.out.print("Digite a opera��o desejada conforme menu acima: 1/2/3/4/5 : ");
		int opcao = sc.nextInt();
		
		
		
		switch (opcao) {
		case 1: 
			
			System.out.print("Informe o tipo de conta: 1 para conta Poupan�a ou 2 para conta Corrente: ");
			int op = sc.nextInt();
			System.out.print("Digite o numero da conta: ");
			Integer numConta = sc.nextInt();
			System.out.print("Informe o saldo inicial: ");
			double saldo = sc.nextDouble();
			
			if(op == 1) {
				
				System.out.println("Digite a taxa de opera��o");
				int taxaOp = sc.nextInt();
				
				ContaPoupanca conta = new ContaPoupanca(numConta, saldo, taxaOp);
				cliente.inserir(conta);
				
				
			}else {
				
				System.out.println("Digite o limite");
				double limite = sc.nextDouble();
				
				ContaCorrente conta = new ContaCorrente(numConta, saldo, limite);
				cliente.inserir(conta);
				
			}
			
			
			break;
		case 2: 
			
			System.out.println("2");
			break;
		case 3: 
			
			System.out.println("3");
			break;
		case 4: 
			
			System.out.println("4");
			break;
		case 5: 
			
			System.out.println("5");
			break;

		
		default:
			
		}
		
		sc.close();

	}
}
