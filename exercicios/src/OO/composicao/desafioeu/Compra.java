package OO.composicao.desafioeu;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> itens = new ArrayList<Item>();

	void AdicionarItem(Produto produto, int quantidade) {
		this.itens.add(new Item(produto, quantidade));
	}

	void AdicionarItem(String nome, double preco, int quantidade) {

		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));

	}

	// obter valor da compra ?
	double ObterValorDaCompra() {
		double totalcompra = 0;
		for (Item Item : itens) {
			totalcompra += Item.quantidade * Item.produto.preco;
		}
		return totalcompra;
	}
}
