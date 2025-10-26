import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int racha = 0; //Inicializamos  variables de racha y aleatorio y arrays
        Random aleatorio = new Random();
        int [] numeros = new int[15];
        //Ahora procedemos a rellenar el array de números aleatorios

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(15);
        }
        System.out.println(Arrays.toString(numeros));
        int maxRacha = 1;
        int actual = 1;
        for (int i = 0; i < numeros.length ; i++) {
            if (numeros[i] == numeros [i-1]){
                actual++;}
            else{
                    actual = 1;}
                if(actual > maxRacha) {
                maxRacha = actual;
            }

        }
        System.out.println("Racha máxima: " + maxRacha);


    }
}