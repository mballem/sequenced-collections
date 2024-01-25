

# Java 21 Sequenced Collections: Exemplos Práticos
___

**Projeto baseado no tutorial:** 

- <a href="https://www.mballem.com/post/java-21-sequenced-collections-exemplos-praticos/">Java 21 Sequenced Collections: Exemplos Práticos</a>.

O framework de coleções do Java é uma das partes mais importantes da linguagem. Ele fornece um conjunto de classes e interfaces para armazenar e manipular coleções de objetos. O Java 21 foi lançado e nos trouxe a Sequenced Collections (JEP 431) que fornece APIs uniformes para acessar o primeiro e o último elemento de uma coleção e para processar seus elementos na ordem inversa.

São três as novas interfaces que foram introduzidas pela JEP 431. Entre elas, temos a SequencedCollection, SequencedSet e SequencedMap. 

```java
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
```

### 🛑 Pré-requistos
* Java 21+

### 🤝 Contribuindo

Desenvolvido e publicado pelo blog **[MBallem - Programando com Java](https://www.mballem.com/)**

Este repositório foi criado para fins de estudo. 

Se te ajudei de alguma forma ⭐️ Star o projeto.



