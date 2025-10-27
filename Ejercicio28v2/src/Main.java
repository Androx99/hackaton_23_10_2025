import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Genera una matriz 6x6 con números del 1 al 9
        int[][] matriz = new int[6][6];
        Random aleatorio = new Random();

        // Rellenar con 1..9
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                matriz[fila][columna] = aleatorio.nextInt(9) + 1; // 1..9
            }
        }

        // Mostrar solo el triángulo superior derecho
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                if (columna >= fila) {
                    System.out.print(matriz[fila][columna] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
