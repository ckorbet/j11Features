package com.cartorgon.j11f;

import java.util.stream.Stream;

public class Java11Programmer {
	public static final void main(final String[] args) {		
		final Stream<Integer> numStream = Stream.of(10, 20, 30);
		numStream.map(n -> n + 10).peek(s -> System.out.print(s));
		numStream.forEach(s -> System.out.println(s));
	}
}