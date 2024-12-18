# Demo - pipeline
Introdução à Programação Orientada a Objetos (Pipeline)

## Objetivo
Este código demonstra o uso de pipelines na API de Streams do Java. Um "pipeline" é uma sequência de operações que podem
ser aplicadas a uma coleção de dados, permitindo transformações e agregações de forma funcional e concisa.

## Estrutura do Código
O código é escrito em Java e está contido na classe Program, dentro do pacote application.

### Detalhes do Código

1. **Imports Necessários**:
- `java.util.Arrays`: Usado para manipulação de arrays.
- `java.util.List`: Interface que representa uma lista.
- `java.util.stream.Collectors`: Usado para coletar os resultados de uma operação de stream em uma coleção.
- `java.util.stream.Stream`: Classe que representa uma sequência de elementos.

2. **Criação da Lista**:

- `List<Integer> list = Arrays.asList(3, 4, 5, 10, 7)`;
- Uma lista de inteiros é criada usando o método `asList()` da classe `Arrays`.

3. **Pipeline de Multiplicação**:

- `Stream<Integer> st1 = list.stream().map(x -> x * 10)`;
- Um stream é criado a partir da lista, e cada elemento é multiplicado por 10 usando o método `map()`.
- O resultado é impresso como um array.

4. **Cálculo da Soma**:

- `int sum = list.stream().reduce(0, (x, y) -> x + y)`;
- O método `reduce()` é utilizado para calcular a soma dos elementos da lista. O primeiro argumento é o valor inicial (0),
e o segundo argumento é uma expressão lambda que define como os elementos devem ser combinados.
- A soma é impressa no console.

5. **Pipeline de Filtragem e Mapeamento**:

- `List<Integer> newList = list.stream()` *Criação de um novo stream a partir da lista*.
- `.filter(x -> x % 2 == 0)` *Filtra os elementos, mantendo apenas os números pares*.
- `.map(x -> x * 10)` *Multiplica os números filtrados por 10*.
- `.collect(Collectors.toList())` *Coleta o resultado em uma nova lista*.
- O resultado é impresso como um array.

#### Coleta de Resultados

A partir do Java 16, você pode usar `.toList()` em vez de `.collect(Collectors.toList())` para coletar os resultados do
stream em uma lista. Isso resulta em um código mais limpo:

```java
List<Integer> newList = list.stream()
        .filter(x -> x % 2 == 0) // Filtra os números pares
        .map(x -> x * 10) // Multiplica os números filtrados por 10
        .toList(); // Coleta o resultado em uma nova lista
```

## Resultados Esperados
Ao executar o código, você verá as seguintes saídas no console:

```
[30, 40, 50, 100, 70]
Sum = 29
[40, 100]
```

## Conclusão
Este exemplo ilustra como usar a API de Streams do Java para criar pipelines de operações funcionais em coleções de dados.
As operações de `map()`, `filter()` e `reduce()` permitem trabalhar de forma fluida e eficiente, facilitando a manipulação e a
análise de dados em aplicações Java. Com essa abordagem, você pode escrever código mais legível e conciso, aproveitando ao
máximo os recursos da programação funcional.