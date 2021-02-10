package Entities;

public abstract class ContaBancaria {
	private Integer numConta;
	private double saldo;
	
	public ContaBancaria() {
		super();
	}

	public ContaBancaria(Integer numConta, double saldo) {
		
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void transferir(double valor, ContaBancaria conta) {
		sacar(valor);
		
		if(getSaldo()>=valor || getSaldo()+500>=valor) {
			conta.depositar(valor);
		}else {
			System.out.println("Transferencia n�o realizada");
		}
	}
	
	public abstract void sacar(double valor);
	
	public abstract void depositar(double valor);

}
