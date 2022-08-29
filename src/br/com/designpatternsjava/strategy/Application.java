package br.com.designpatternsjava.strategy;

import java.math.BigDecimal;

public class Application {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ISS()));
		System.out.println(calculadora.calcular(orcamento, new ICMS()));

	}
}
