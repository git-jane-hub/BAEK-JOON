package dktechin;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class testtest {
	public static void main(String[] args) {
		/*
		int[] inputStrArr = {1, 3, 3, 5, 7, 8, 8, 8};
		IntStream.of(inputStrArr)
        .boxed()
        .collect(Collectors.groupingBy(i -> i))
        .entrySet()
        .stream()
        .filter(e -> e.getValue().size() > 1)
        .forEach(e -> {
            System.out.println(e.getKey() + " -> " + e.getValue()
                                         .stream()
                                         .collect(Collectors.counting()));
        });
        */
		int[] inputStrArr = {1, 3, 3, 5, 7, 8, 8, 8};
		IntStream.of(inputStrArr)
		.boxed()
		.collect(Collectors.groupingBy(i -> i))
		.entrySet()
		.stream()
		.filter(e -> e.getValue().size() >= 1)
		.forEach(e -> {
			System.out.println(e.getKey() + " -> " + e.getValue()
			.stream()
			.collect(Collectors.counting()) + "\n");
		});
		
		System.out.println("-----");
		System.out.println();
		System.out.println("-----");
	}
}
