// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5]; // Crea una matriz de 5x5, inicializada en ceros automáticamente
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " "); // Imprime cada elemento seguido de un espacio
            }
            System.out.println(); // Salta de línea al finalizar cada fila
        }
    }
}