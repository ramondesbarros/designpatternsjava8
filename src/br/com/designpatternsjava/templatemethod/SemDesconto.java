package br.com.designpatternsjava.templatemethod;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return BigDecimal.ZERO;
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}

}
