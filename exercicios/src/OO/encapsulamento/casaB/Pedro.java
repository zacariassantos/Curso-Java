package OO.encapsulamento.casaB;

import OO.encapsulamento.casaA.Ana; // esta em outro pacote 

public class Pedro extends Ana {
	
	//Ana mae = new Ana(); não é necessario instanciar é herança, basta acessar diretamente

	void testeAcessos() {
		//System.out.println(mae.segredo);
		//System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(new Ana().todosSabem);
	}
}
