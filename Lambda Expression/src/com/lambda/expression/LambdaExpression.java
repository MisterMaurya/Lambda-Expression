package com.lambda.expression;

import com.lambda.expression.functionalInterface.DisplaySomething;
import com.lambda.expression.functionalInterface.Square;

public class LambdaExpression {

	public static void main(String[] args) {

		DisplaySomething displaySomething = () -> System.out.println("Hello");
		displaySomething.displaySomething();

		Square square = n -> n * n;
		System.out.println("Square : " + square.square(8));

	}

}
