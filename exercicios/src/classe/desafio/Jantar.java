package classe.desafio;

public class Jantar {
	public static void main(String[] args) {

		Comida c1 = new Comida("macarrão", 0.450);
		Comida c2 = new Comida("Arroz", 1.450);
		Pessoa p1 = new Pessoa("zacarias", 60);

		System.out.println(p1.apresentar());
		p1.Comer(c2);
		System.out.println(p1.apresentar());
		p1.Comer(c1);
		System.out.println(p1.apresentar());
	}

}
