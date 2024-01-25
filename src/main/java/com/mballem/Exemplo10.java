package com.mballem;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class Exemplo10 {
    public static void main(String[] args) {
        SequencedMap<String, Object> mapFrutas = new LinkedHashMap<>();
        mapFrutas.put("Laranja", 5);
        mapFrutas.put("Limão", 2);
        mapFrutas.put("Pera", 3);
        mapFrutas.put("Morango", 3);
        mapFrutas.put("Banana", 8);

        System.out.println(mapFrutas);
        // {Laranja=5, Limão=2, Pera=3, Morango=3, Banana=8}

        System.out.println(mapFrutas.reversed());
        // {Banana=8, Morango=3, Pera=3, Limão=2, Laranja=5}
    }
}
