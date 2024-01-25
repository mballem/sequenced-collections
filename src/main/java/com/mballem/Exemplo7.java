package com.mballem;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class Exemplo7 {
    public static void main(String[] args) {
        SequencedMap<String, Object> mapFrutas = new LinkedHashMap<>();
        mapFrutas.put("Laranja", 5);
        mapFrutas.put("Limão", 2);
        mapFrutas.put("Pera", 3);
        mapFrutas.put("Morango", 3);
        mapFrutas.put("Banana", 8);

        System.out.println(mapFrutas);
        // {Laranja=5, Limão=2, Pera=3, Morango=3, Banana=8}

        mapFrutas.putFirst("Goiaba", 4);
        mapFrutas.putLast("Mamão", 2);

        System.out.println(mapFrutas);
        // {Goiaba=4, Laranja=5, Limão=2, Pera=3, Morango=3, Banana=8, Mamão=2}
    }
}
