package OO.heranca.Desafio;

public class Ferrari extends Carro {
	
	Ferrari(int velocidade){
		super(velocidade);
	}
	@Override
	void Acelerar() {
		velocidade+= 15;
	}

}
