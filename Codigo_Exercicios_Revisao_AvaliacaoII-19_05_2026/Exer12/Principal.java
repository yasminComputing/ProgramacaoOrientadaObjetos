package pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Livro> lista = new ArrayList<>();
		
		lista.add(new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997));
		lista.add(new Livro("Java: Como Programar", "Deitel", 2016));
		lista.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
		lista.add(new Livro("O Senhor dos Aneis", "J.R.R. Tolkien", 1954));
		lista.add(new Livro("Clean Code", "Robert C. Martin", 2008));
		
		System.out.println();
		System.out.println("-- Dados dos livro sem ordenação -- ");
		for(Livro l : lista) {
			System.out.println(l.dados());
			System.out.println("----------------------------");
		}
		
		
		Collections.sort(lista, (l1, l2) -> l1.getAnoLancamento() - l2.getAnoLancamento());		
		
		System.out.println("-- Dados dos livro com ordenação -- ");
		for(Livro l : lista) {
			System.out.println(l.dados());
			System.out.println("----------------------------");
		}
		
	}

}
