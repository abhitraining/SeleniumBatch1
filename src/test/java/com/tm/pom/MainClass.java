package com.tm.pom;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;


public class MainClass {
    public static void main(String[] args) throws IOException {
        List<Integer> number = Arrays.asList(2, 0, 4, 5,1);
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
        List<Integer> square=number.stream().map(y->y*y).collect(Collectors.toList());
        List<String> result=names.stream().filter(s->s.startsWith("C")).collect(Collectors.toList());
        System.out.println(square);
        System.out.println(result);
        number.stream().map(x->x*x).forEach(y->System.out.println(y));
        System.out.println(number.stream().sorted().collect(Collectors.toList()));
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> original = new LinkedList<Integer>();
        for (int i = 0; i <a.size(); i++) {
            if (i >= d) {
                original.add(a.get(i));
            }
        }
        for (int i = 0; i < d; i++) {
            original.add(a.get(i));
        }
        return original;
    }

}
