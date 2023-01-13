package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
boolean TrabalhoQuinta = false;
boolean TrabalhoTerca = false;

boolean tv52 = (TrabalhoQuinta && TrabalhoTerca);
boolean tv32 = (TrabalhoQuinta ^ TrabalhoTerca);
boolean comprouSorvete = TrabalhoQuinta || TrabalhoTerca;

System.out.println("Comprou TV 50\"?" + tv52);
System.out.println("Comprou TV 32\"?" + tv32);
System.out.println("Comprou Sorvete\"?" + comprouSorvete);
System.out.println("Mais Saudavel\"?" + !comprouSorvete);


 



	}
}
