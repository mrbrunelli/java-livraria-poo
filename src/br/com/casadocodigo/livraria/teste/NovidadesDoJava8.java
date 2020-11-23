package br.com.casadocodigo.livraria.teste;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.ComparadorPorNome;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class NovidadesDoJava8 {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Matheus R. Brunelli");

		Livro javaoo = new LivroFisico(autor);
		javaoo.setNome("Java O.O.");

		Livro java8 = new LivroFisico(autor);
		java8.setNome("Java 8 Prático");

		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Livro de Ruby");

		List<Livro> livros = Arrays.asList(javaoo, java8, ruby);
		livros.sort((l1, l2) -> l1.getNome().compareTo(l2.getNome()));
		livros.stream()
			.filter(l -> l.getNome().contains("Java"))
			.forEach(l -> System.out.println(l.getNome()));
	}
}
