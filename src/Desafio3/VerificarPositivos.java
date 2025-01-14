package Desafio3;
import java.util.Arrays;
import java.util.List;

//Verifique se todos os números da lista são positivos:
//Com a ajuda da Stream API, verifique se todos os números da lista são
//positivos e exiba o resultado no console.

public class VerificarPositivos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosPositivos = numeros.stream()
                .allMatch(n -> n > 0);

        System.out.println("Todos os números são positivos: " + todosPositivos);
    }
}

//o método allMatch() verifica se todos os elementos de uma stream
//atendem a um critério passado como parâmetro,através de um Predicate,
//e retorna um valor booleano.
