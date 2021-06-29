package com.javarush.task.task37.task3714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Древний Рим
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a roman number to be converted to decimal: ");
        String romanString = bufferedReader.readLine();
        System.out.println("Conversion result equals " + romanToInteger(romanString));
    }

    public static int romanToInteger(String s) {
        String[] strings = s.split("");
        List<Integer> digits = new ArrayList<>(strings.length);

        for (String symbol : strings) {
            switch (symbol) {
                case "I" -> digits.add(1);
                case "V" -> digits.add(5);
                case "X" -> digits.add(10);
                case "L" -> digits.add(50);
                case "C" -> digits.add(100);
                case "D" -> digits.add(500);
                case "M" -> digits.add(1000);
                default -> throw new IllegalArgumentException("unsupported argument " + symbol);
            }
        }

        int result = 0;
        int prev = 0;

        for (int i = digits.size() - 1; i >= 0 ; i--) {
            int temp = digits.get(i);
            if(temp < prev){
                result += temp;
            }else {
                result -= temp;
            }
            prev = temp;
        }
        return Math.abs(result);
    }
}
