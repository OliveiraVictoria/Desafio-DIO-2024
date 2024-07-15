package Desafio1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



//Mostre a lista na ordem numérica:
//Crie um programa que utilize a Stream API para ordenar a lista de números em
//ordem crescente e a exiba no console.

public class OrdenarLista {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdenados = numeros.stream()
                .sorted()
                .collect(Collectors.toList());

        numerosOrdenados.forEach(System.out::println);
    }
}
