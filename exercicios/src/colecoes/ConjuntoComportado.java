package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		SortedSet<String> listaAprovados = new TreeSet<>(); // Treeset garante a  ordem de inserção, sortedset é uma classe de conjuntos ordenados
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums= new HashSet<>(); // exibe sem ordenação
		nums.add(1);
		nums.add(2);
		nums.add(320);
		nums.add(6);
		
		// nums.get(1); Não é possivel acessar pelo índice
		for(int nome : nums) { // aqui pode ser int , só não precisa ser intereger
			System.out.println(nome);
		}
	}
}
