package com.lambda.expression;

import com.lambda.expression.functionalInterface.DisplaySomething;
import com.lambda.expression.functionalInterface.Square;
import com.lambda.expression.functionalInterface.Sum;

public class LambdaExpression extends Object {

	public static void main(String[] args) {

		DisplaySomething displaySomething = () -> System.out.println("Hello");
		displaySomething.displaySomething();

		Square square = n -> n * n;
		System.out.println("Square : " + square.square(8));

		Sum sum = (a, b) -> {
			return a + b;
		};
		System.out.println("Sum : " + sum.sum(20, 30));

	}

}
