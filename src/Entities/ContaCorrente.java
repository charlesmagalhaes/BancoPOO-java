package Entities;

public class ContaCorrente extends ContaBancaria implements Imprimivel {
	
	private double limite;

	public ContaCorrente(Integer numConta, double saldo, double limite) {
		super(numConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void mostrarDados() {
		
		System.out.println("Numero da Conta: "+getNumConta()+" Saldo: "+getSaldo()+" limite: "+limite); 
	}

	@Override
	public void sacar(double valor) {
		
		if(getSaldo()>=valor) {
			double mov = getSaldo()-valor;
			setSaldo(mov);
			System.out.println( "Operação realizada com sucesso!!");
		
		}else if (getSaldo()+limite>=valor){
			double mov = getSaldo()-valor;
			limite -= valor - getSaldo();
			setSaldo(mov);
			System.out.println("Operação realizada com sucesso!!");
			
		}else {
			
			System.out.println("Saldo insuficiente. Operação não realizada!!");
		}
	}

	@Override
	public void depositar(double valor) {
		double aux = getSaldo()+valor;
		setSaldo(aux);
		System.out.println("Deposito realizado com sucesso!!!");
	}

}
