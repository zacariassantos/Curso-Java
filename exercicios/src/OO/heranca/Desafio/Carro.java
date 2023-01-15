package OO.heranca.Desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	protected double velocidade = 0;
	protected int delta = 5;

	
	protected Carro(int velocidadeMaxima){  // não dara pra instanciar um carro diretamente
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	public void Acelerar() {
		
		if(velocidade + delta > VELOCIDADE_MAXIMA ) {
			velocidade = VELOCIDADE_MAXIMA;
		}else {
			velocidade += delta;
		}
		// resolver problema do civic e da ferrari que não tem mais construtor padrão
	}
	

	public void Frear() {

		if (velocidade >= 5) {
			velocidade -= 5;
		} else {
			velocidade = 0;
		}

	}
	
	public String toString() {
		return "Velociade atual é "+ velocidade + "Km/h";
	}
}
