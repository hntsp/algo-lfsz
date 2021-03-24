package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {

        numbers.removeIf(number -> number % 2 == 0);

        return numbers.stream().mapToInt(Integer::intValue).sum();

    }
}