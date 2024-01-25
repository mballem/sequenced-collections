package com.mballem;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class Exemplo1 {
    public static void main(String[] args) {
        SequencedCollection<String> sequence = new ArrayList<>();
        sequence.add("Ana Maria");
        sequence.add("Bianca Rios");
        sequence.add("Carlos Peres");
        sequence.add("Diana Marim");
        sequence.add("Everton Nunes");

        System.out.println(sequence.getFirst()); // 1
        System.out.println(sequence.getLast()); // 5
    }
}
