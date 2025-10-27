import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        //INICIALIZAR VARIABLES
        int filas = 6;
        int columnas = 6;
        int filas_rnd;
        int columnas_rnd;
        char relleno = '*';
        char enemigo = 'E';
        int cont_enemigos=1;
        //INICIALIZAR TABLERO
        char [][] tablero = new char[filas][columnas];
        //RELLENAR TABLERO
        for (int i=0;i< tablero.length;i++){
            for (int j=0;j< tablero[i].length;j++){
                tablero[i][j] = relleno;
            }
        }
        do{
            filas_rnd = random.nextInt(6);
            columnas_rnd = random.nextInt(6);
            if (tablero[filas_rnd][columnas_rnd] != enemigo  ){
                    tablero[filas_rnd][columnas_rnd] = enemigo;
                    cont_enemigos++;
            }
        }while (cont_enemigos <6);
        //MOSTRAR TABLERO
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
    }
}