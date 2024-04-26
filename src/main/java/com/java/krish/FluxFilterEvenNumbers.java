package com.java.krish.tesco;

import reactor.core.publisher.Flux;

public class FluxFilterEvenNumbers {

	public static void main(String[] args) {
		Flux<Integer> fluxNumbers = Flux.range(1, 10);
		Flux<Integer> fluxEvenNumbers = fluxNumbers.filter(number -> number % 2 == 0);
		fluxEvenNumbers.subscribe(System.out::println);
	}

}
