import java.util.ArrayList;

public class Frutas {
    public static void main(String[] args) {
        // Criando ArrayList com 5 frutas
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.add("Laranja");
        frutas.add("Manga");

        // Adicionando mais 3 frutas
        frutas.add("Abacaxi");
        frutas.add("Pêssego");
        frutas.add("Melancia");

        // Removendo a segunda fruta (índice 1, pois começa em 0)
        frutas.remove(1);

        // Imprimindo a lista atualizada
        System.out.println("Lista de frutas atualizada: " + frutas);
    }
}