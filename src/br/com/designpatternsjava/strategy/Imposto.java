package br.com.designpatternsjava.strategy;

import java.math.BigDecimal;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);
}
