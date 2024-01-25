package com.mballem;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;

public class Exemplo8 {
    public static void main(String[] args) {
        SequencedMap<String, Object> mapFrutas = new LinkedHashMap<>();
        mapFrutas.put("Laranja", 5);
        mapFrutas.put("Limão", 2);
        mapFrutas.put("Pera", 3);
        mapFrutas.put("Morango", 3);
        mapFrutas.put("Banana", 8);

        Map.Entry<String, Object> first = mapFrutas.firstEntry();
        System.out.println(first); // Laranja=5


        Map.Entry<String, Object> last = mapFrutas.lastEntry();
        System.out.println(last); //Banana=8
    }
}
