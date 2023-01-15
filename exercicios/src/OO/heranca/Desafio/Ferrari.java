package OO.heranca.Desafio;

public class Ferrari extends Carro {
	
	
	 public Ferrari() {
		this(315);
	}
	
	public Ferrari(int velocidade){
		super(velocidade);
		delta = 350;
	}
	//@Override
	//void Acelerar() {
		//super.Acelerar();
	//}

}
