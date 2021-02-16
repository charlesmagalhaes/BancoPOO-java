package Entities;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {
	
	private double taxaDeOperacao;

	public ContaPoupanca(Integer numConta, double saldo, double taxaDeOperacao) {
		super(numConta, saldo);
		this.taxaDeOperacao = taxaDeOperacao;
	}

	public double getTaxaDeOperacao() {
		return taxaDeOperacao;
	}

	public void setTaxaDeOperacao(double taxaDeOperacao) {
		this.taxaDeOperacao = taxaDeOperacao;
	}

	@Override
	public void mostrarDados() {
		
		System.out.println("Numero da Conta: "+getNumConta()+" Saldo: "+getSaldo()+" Taxa de Operação: "+taxaDeOperacao); 
	}

	@Override
	public void sacar(double valor) {
		
		if(getSaldo()> valor+taxaDeOperacao) {
			double mov = getSaldo()-valor+taxaDeOperacao;
			setSaldo(mov);
			System.out.println("Operação realizada com sucesso!!!"); 
			
		}else {
			
			System.out.println("O saldo é insuficiente para fazer essa operação");
		}
		
	}

	@Override
	public void depositar(double valor) {
		double mov = getSaldo() + valor-taxaDeOperacao;
		setSaldo(mov);
		System.out.println("Deposito realizado com sucesso!!!");
	}


}
