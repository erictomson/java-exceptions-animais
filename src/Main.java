import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar um arrayList de Strings e inicializá-lo com uma nova lista vazia
        ArrayList<String> listaDeAnimais = null;
        listaDeAnimais = new ArrayList<>();
        // listaDeAnimais.add(null); //0

        // Inicializando com valores
        // List<String> listaDeAnimais = Arrays.asList("Pato","Cachorro","Gato");

        try {
        // Adicionar os seguintes valores: “Pato”, “Cachorro”, “Gato”
        listaDeAnimais.add("Pato"); // 1
        listaDeAnimais.add("Cachorro"); // 2
        listaDeAnimais.add("Gato");

        // Imprimir o conteúdo da posição 3
            System.out.println("Animal da posição 2: " + listaDeAnimais.get(0));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index of bounds | " + e.toString());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception | " + e.toString());
        //} catch (Exception e) {
        //    System.out.println(e.getMessage());
        }

        // Executar o programa. O que acontece?
        // Exceção: IndexOutOfBoundsException

        // Criar uma cláusula try-catch para controlar a exceção anterior.
    }
}
