package Application;

import Entities.ContaCorrente;
import Entities.ContaPoupanca;
import Entities.servicos.Relatorio;

public class Program {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1250, 1000, 500);
		
		ContaPoupanca cp = new ContaPoupanca(1355, 999, 5);
		
		cc.depositar(500);
		
		cc.sacar(1600);
		
		cp.depositar(200);
		
		cp.sacar(1500);
		
		Relatorio relatorio = new Relatorio();
		
		relatorio.gerarRelatorio(cp);
		
		relatorio.gerarRelatorio(cc);
		
		cc.transferir(500, cp);
		
		relatorio.gerarRelatorio(cp);
		relatorio.gerarRelatorio(cc);


	}

}
