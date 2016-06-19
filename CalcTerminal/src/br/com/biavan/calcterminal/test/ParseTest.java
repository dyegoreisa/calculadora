package br.com.biavan.calcterminal.test;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

import br.com.biavan.calcterminal.Num;
import br.com.biavan.calcterminal.utils.ParseExpression;

public class ParseTest {

	@Test
	public void testSoma() {
		String operacoes = "12+37*42-81/3*12+37*42-81/3=";
		
		Num result = ParseExpression.perform(operacoes);
		
		assertEquals(new Num(111203), result);
	}

}
