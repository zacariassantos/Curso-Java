package OO.heranca.Desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	double velocidade = 0;
	int delta = 5;

	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	void Acelerar() {
		
		if(velocidade + delta > VELOCIDADE_MAXIMA ) {
			velocidade = VELOCIDADE_MAXIMA;
		}else {
			velocidade += delta;
		}
		// resolver problema do civic e da ferrari que não tem mais construtor padrão
	}
	

	void Frear() {

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
