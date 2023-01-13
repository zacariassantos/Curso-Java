package OO.composicao.desafioeu;

public class Sistema {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Jose Zacarias dos Santos Junior");
		
		Compra compra1 = new Compra();
		compra1.AdicionarItem(new Produto("iphone", 1200), 1);
		compra1.AdicionarItem("ipods",900, 1);
		
		Compra compra2 = new Compra();
		compra2.AdicionarItem(new Produto("Samsung", 1700), 1);
		compra2.AdicionarItem("gear",800, 1);
		
		cliente.AdicionarCompra(compra1);
		cliente.AdicionarCompra(compra2);
		
		System.out.println("O cliente "+cliente.nome+" gastou :"+cliente.ObterValorTotal());
		
	}
}
