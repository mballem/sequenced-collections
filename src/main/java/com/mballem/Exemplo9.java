package com.mballem;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;

public class Exemplo9 {
    public static void main(String[] args) {
        SequencedMap<String, Object> mapFrutas = new LinkedHashMap<>();
        mapFrutas.put("Laranja", 5);
        mapFrutas.put("Limão", 2);
        mapFrutas.put("Pera", 3);
        mapFrutas.put("Morango", 3);
        mapFrutas.put("Banana", 8);

        Map.Entry<String, Object> first = mapFrutas.pollFirstEntry();
        System.out.println(first);
        System.out.println(mapFrutas);
        // Laranja=5
        // {Limão=2, Pera=3, Morango=3, Banana=8}

        Map.Entry<String, Object> last = mapFrutas.pollLastEntry();
        System.out.println(last);
        System.out.println(mapFrutas);
        // Banana=8
        // {Limão=2, Pera=3, Morango=3}
    }
}
