package classe;

import java.util.Date;

public class Equals {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.siva@ezemail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.siva@ezemail.com.br";
		
		System.out.println(u1 == u2); /*have  different address in memory, thats why false*/
		System.out.println(u1.equals(u2)); /*false because equals will run same thing of ==*/
		System.out.println(u2.equals(u1));
		
		System.out.println(u2.equals(new Date())); /*Data não vai poder ser convertido para o tipo Usuario*/
	}
}