package br.com.javaoito.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
		List<String> usuarios = Arrays.asList("Ramon", "Dave", "Hayley", "CJ Ramone", "Lisa", "Einstein");
		
		// Filter 
		/***
		 * uma operação intermediária que consiste em filtrar objetos com base em algum critério 
		 * fornecido por parâmetro, esse critério é representado por uma função lambda.
		 */
		
		List<String> collect = usuarios.stream()
			.filter(u -> u.length() > 5)
			.collect(Collectors.toList());
		
		collect.forEach(c -> System.out.println(c));
		
		// Return -> [Hayley, CJ Ramone, Einstein]

	}

}
