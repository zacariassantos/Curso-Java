package Agente;

import Ambiente.Labirinto;

public class AgenteLabirinto {

	//movimentar para 4 direções(cima,baixo,esquerda,direita)
	//referencia do labirinto
	private Labirinto labirinto;
	private MovimentosAgenteLabirinto movimento;
	public AgenteLabirinto(Labirinto labirinto) {
		this.labirinto = labirinto;
		
		this.movimento = MovimentosAgenteLabirinto.CIMA;
	}
}
