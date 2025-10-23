import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //INICIALIZAR VARIABLES
        Scanner sc = new Scanner(System.in);
        int filas = 5;
        int columnas = 5;
        char relleno = '*';
        String user_input;
        //INICIALIZAR TABLERO
        char [][] tablero = new char[filas][columnas];

        //INICIAMOS JUGADOR
        char jugador = 'P';
        int fila_jugador = 2;
        int columna_jugador = 2;


        //RELLENAR TABLERO
        for (int i=0;i< tablero.length;i++){
            for (int j=0;j< tablero[i].length;j++){
                tablero[i][j] = relleno;
            }
        }
        tablero[fila_jugador][columna_jugador]= jugador;

        //BUCLE PARA INPUTS JUGADOR
        do {
            //MOSTRAR TABLERO
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println("");
            }

            //PEDIR INPUT
            System.out.println("Muevete usando W A S D, pulsa (T) para salir");
            user_input = sc.next();


            //OPCIONES MOVIMIENTO
            if (user_input.equals("w")){
                tablero[fila_jugador][columna_jugador]= relleno;
                fila_jugador --;
                tablero[fila_jugador][columna_jugador]= jugador;
            }
            if (user_input.equals("s")){
                tablero[fila_jugador][columna_jugador]= relleno;
                fila_jugador ++;
                tablero[fila_jugador][columna_jugador]= jugador;
            }
            if (user_input.equals("a")){
                tablero[fila_jugador][columna_jugador]= relleno;
                columna_jugador--;
                tablero[fila_jugador][columna_jugador]= jugador;
            }
            if (user_input.equals("d")) {
                tablero[fila_jugador][columna_jugador] = relleno;
                columna_jugador++;
                tablero[fila_jugador][columna_jugador] = jugador;
            }
        }while (!user_input.equals("t"));
    }
}