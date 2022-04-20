package com.springcore.demospring;



import org.springframework.expression.*;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Assignment7 {

	public static void main(String[] args) {
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Anirudh'");
		String message =(String) ((Expression) exp).getValue();
		System.out.println(message);

	}

}