import java.util.Arrays;
public class Main {
public static void main(String[] args) {

    //Inicializo Variables
    //Inicializo Array
    int Puntuaciones[] = {13,16,2,6,141,23};
    //Relleno el array de numeros aleatorios
    for (int i = 0; i < Puntuaciones.length; i++) {
        for (int j = 0; j < Puntuaciones.length - i - 1; j++) {
            if (Puntuaciones[j] < Puntuaciones[j + 1]) {
                int temp = Puntuaciones[j];
                Puntuaciones[j] = Puntuaciones[j + 1];
                Puntuaciones[j+1] = temp;
            }

        }
    }
    System.out.println("Puntuaciones Ordenadas de mayor a Menor: " + Arrays.toString(Puntuaciones));
   }
}