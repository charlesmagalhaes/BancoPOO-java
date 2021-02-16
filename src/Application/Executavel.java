package Application;

import java.util.Scanner;

import Entities.Banco;
import Entities.ContaBancaria;
import Entities.ContaCorrente;
import Entities.ContaPoupanca;

public class Executavel {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		Banco cliente = new Banco();
		char opMenu = 's';
		do{
		
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
					
					System.out.print("Digite a taxa de opera��o: ");
					int taxaOp = sc.nextInt();
					
					ContaPoupanca conta = new ContaPoupanca(numConta, saldo, taxaOp);
					cliente.inserir(conta);
					cliente.mostrarDados();
					
				}else {
					
					System.out.println("Digite o limite");
					double limite = sc.nextDouble();
					
					ContaCorrente conta = new ContaCorrente(numConta, saldo, limite);
					cliente.inserir(conta);
					
				}
				
				
				break;
			case 2: 
				
				System.out.print("Digite o numero da conta: ");
				Integer numProc = sc.nextInt();
							
			   ContaBancaria contaEncontrada = cliente.procurarConta(numProc);
			   
			   if (contaEncontrada == null) {
				   
				   System.out.println("Essa conta n�o existe no banco de dados");
				   
			   }else {
				   System.out.println("----------MENU---------------------------------------------");
				   System.out.println("	a: Depositar");
				   System.out.println("	b: Sacar");
				   System.out.println("	c: Transferir");
				   System.out.println("	d: Gerar Relat�rio");
				   System.out.println("	e: Gerar Relat�rio");
				   System.out.println("-------------------------------------------------------");
				   System.out.print("Informe a opera��o desejada conforme acima: a, b, c, d ou e: ");
				   char opcaoSubMenu = sc.next().charAt(0);
				   switch (opcaoSubMenu) {
				   
						case 'a': 
							System.out.print("Digite o valor a ser depositado: ");
							double valorParaDeposito = sc.nextDouble();
							
							
							break;
						case 'b': 
							break;
						case 'c': 
							break;
						case 'd': 
							break;
						case 'e': 
							break;
						default:
							System.out.println("Op��o digitada invalida!!!");
				   }	
			   }
							
				break;
			case 3: 
				
				System.out.print("Informe a conta que ser� removida: ");
				
				Integer contaR = sc.nextInt();
				
				cliente.remover(cliente.procurarConta(contaR));
				
				sc.next();
				break;
				
			case 4: 
				
				System.out.println();
				System.out.println("Contas cadastradas: ");
				cliente.mostrarDados();
				System.out.println();
				
				System.out.println("Clique enter para proseguir");
				sc.next();
				break;
			case 5: 
				
				opMenu = 'n';
				System.out.println("O Sistema foi fechado!! ");
				break;
	
			
			default:
				System.out.println("Op��o digitada � invalida!");
				
			}
			
			
		} while(opMenu == 's');
		
		sc.close();

	}
}
