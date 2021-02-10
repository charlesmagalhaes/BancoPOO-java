package Entities;

import java.util.ArrayList;
import java.util.List;

public class Banco implements Imprimivel {
	
	List<ContaBancaria> list = new ArrayList<>();
	
	
	public void inserir(ContaBancaria conta) {		
		list.add(conta);
		
	}
	
	public void remover(ContaBancaria conta) {		
		list.remove(conta);
		
	}
	
	public ContaBancaria procurarConta(Integer numConta) {		
		for (ContaBancaria i : list ) {
			if (i.getNumConta() == numConta) {
				return i;
				
			}
		}
		
		return null;
	}

	@Override
	public void mostrarDados() {
		
		//for (ContaBancaria i : list) {
			
			mostrarDados();
			//System.out.println("Numero da Conta: "+ i.getNumConta()+ " Saldo: "+i.getSaldo());
		//}
		//	
	}
	
}
