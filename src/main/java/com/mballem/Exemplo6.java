package com.mballem;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class Exemplo6 {
    public static void main(String[] args) {
        SequencedSet<String> set = new LinkedHashSet<>();
        set.add("Ana Maria");
        set.add("Bianca Rios");
        set.add("Carlos Peres");
        set.add("Diana Marim");
        set.add("Everton Nunes");

        System.out.println(set);
        // [Ana Maria, Bianca Rios, Carlos Peres, Diana Marim, Everton Nunes]

        System.out.println(set.reversed());
        // [Everton Nunes, Diana Marim, Carlos Peres, Bianca Rios, Ana Maria]
    }
}
