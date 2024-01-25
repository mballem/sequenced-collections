package com.mballem;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class Exemplo5 {
    public static void main(String[] args) {
        SequencedCollection<String> sequence = new ArrayList<>();
        sequence.add("Ana Maria");
        sequence.add("Bianca Rios");
        sequence.add("Carlos Peres");
        sequence.add("Diana Marim");
        sequence.add("Everton Nunes");

        sequence.addFirst("Anita Silva");
        sequence.addLast("Fernando Ferreira");

        System.out.println(sequence);

        for (String nome : sequence) {
            if (nome.contains("Carlos")) {
                sequence.removeFirst();
            }
        }

        System.out.println(sequence);
    }
}
