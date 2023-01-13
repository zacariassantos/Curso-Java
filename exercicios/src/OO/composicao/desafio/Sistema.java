package OO.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100); // construindo diretamente com os dados para criar o objeto e o item
		compra1.adicionarItem(new Produto("Notebook", 1897.8), 2); // construtor passando um objeto e a quantidade
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10); 
		compra2.adicionarItem(new Produto("impressora", 998.90), 1); 
		
		Cliente  cliente = new Cliente("Maria Julia");
		
		cliente.adicionarCompras(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
		
	}

}
