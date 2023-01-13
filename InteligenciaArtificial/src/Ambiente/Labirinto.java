package Ambiente;

public class Labirinto {
	
		private int tamanhoLabirinto;
		private String[][]labirinto;

		/*
		 * valores S - Sujo L - limpo *A*- Agente
		 */
		// instanciando/construindo labirinto
		
		public Labirinto(int tamanhoLabirinto) {
			this.tamanhoLabirinto = tamanhoLabirinto;
			this.construirNovoLabirinto();
		}
		
		private void construirNovoLabirinto(){
			labirinto = new String[this.tamanhoLabirinto][this.tamanhoLabirinto];
			for (int i = 0; i < this.tamanhoLabirinto; i++) {
				for (int j = 0; j < this.tamanhoLabirinto; j++) {
					this.labirinto[i][j] = "S";
				}
			}
		}
		
		public void exibirLabirinto() {
			for (int i = 0; i < tamanhoLabirinto; i++) {
				for (int j = 0; j < tamanhoLabirinto; j++) {
					System.out.print("| "+labirinto[i][j]+" |");
				}
				System.out.println("");
			}	
		}
}
