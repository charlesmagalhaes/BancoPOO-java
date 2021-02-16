package Entities;

import java.util.ArrayList;
import java.util.List;

public class Banco implements Imprimivel {
	
	List<ContaBancaria> list = new ArrayList<>();
	
	
	public void inserir(ContaBancaria conta) {		
		list.add(conta);
		System.out.println("Conta adicionada com sucesso!");
	}
	
	public void remover(ContaBancaria conta) {		
		list.remove(conta);
		System.out.println("Conta removida com sucesso!");
	}
	
	public ContaBancaria procurarConta(Integer numConta) {		
		for (ContaBancaria i : list ) {
			if (i.getNumConta().equals(numConta)) {
				return i;
				
			}
		}
		
		return null;
	}

	@Override
	public void mostrarDados() {
		
		for (ContaBancaria i : list) {
			
			
			System.out.println("Numero da Conta: "+ i.getNumConta()+ " Saldo: "+i.getSaldo());
		}
			
	}
	
}
