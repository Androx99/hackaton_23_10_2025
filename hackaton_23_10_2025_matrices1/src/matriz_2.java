public class matriz_2 {
    public static void main(String[] args) {
        char[][] mapa = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mapa[i][j] = 'o';
                mapa[2][2] = 'X';
            }
        }
// Mostrar
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }

    }
}
