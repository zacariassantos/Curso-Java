package OO.composicao.desafioeu;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final String nome;
	final List<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	// Adicionar Compras
	
	void AdicionarCompra( Compra compra) {
		this.compras.add(compra);
	}
	
	// Como obter Valor total
	double ObterValorTotal(){
		double total = 0;
		for(Compra compras: compras) {
			total += compras.ObterValorDaCompra();
		}
		return total;
	}
}
