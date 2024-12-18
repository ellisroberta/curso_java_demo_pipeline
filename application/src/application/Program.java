package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        // Criação de uma lista de inteiros
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        // Criação de um stream a partir da lista e multiplicação de cada elemento por 10
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        // Impressão do resultado como um array
        System.out.println(Arrays.toString(st1.toArray()));
        // Resultado: [30, 40, 50, 100, 70]

        // Cálculo da soma dos elementos da lista usando reduce
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        // Impressão da soma
        System.out.println("Sum = " + sum);
        // Resultado: Sum = 29

        // Criação de uma nova lista filtrando os elementos pares, multiplicando por 10 e coletando em uma nova lista
        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0) // Filtra os números pares
                .map(x -> x * 10) // Multiplica os números filtrados por 10
                .collect(Collectors.toList()); // Coleta o resultado em uma nova lista
        // Impressão da nova lista
        System.out.println(Arrays.toString(newList.toArray()));
        // Resultado: [40, 100]
    }
}