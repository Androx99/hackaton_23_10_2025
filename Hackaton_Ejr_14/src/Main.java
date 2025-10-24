import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont_letras= 0;
        char letra_user;
        boolean acierto = false;
        String palabra_adivinar =  "supercalifrajilisticoespialidoso";
        char[] palabra = palabra_adivinar.toLowerCase().toCharArray();
        for (int i=0;i<palabra.length;i++){
            if (Character.isLetter(palabra[i])){
                cont_letras++;
            }
        }
        char[] palabra_usuario = new char [cont_letras];
        char relleno = '_';
        for (int i=0;i<palabra_usuario.length;i++){
            palabra_usuario[i]=relleno;
        }
        do {
            System.out.print("Introduce una letra: ");
            letra_user = sc.next().charAt(0);
            for(int i=0;i<palabra.length;i++){
                if pablero[i]
            }
        }while (acierto == false);

    }
}