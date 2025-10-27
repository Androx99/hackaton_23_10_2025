import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //INICUAMOS VARIABLES
        Scanner sc = new Scanner(System.in);
        int cont_letras= 0;
        //PEDIMOS PALABRA AL USUARIO Y LA PASAMOS A ARRAY
        System.out.println("Introduce una palabra");
        String palabra_user =  sc.next();
        palabra_user.toCharArray();
        char[] palabra = palabra_user.toLowerCase().toCharArray();
        //BUCLE PARA CONTAR LAS LETRAS
        for (int i=0;i<palabra.length;i++){
            if (palabra[i]=='a' || palabra[i]=='e' || palabra[i]=='i' || palabra[i]=='o' || palabra[i]=='u'){
                cont_letras++;
            }
        }
        //MOSTRAMOS EL NUMERO DE LETRAS AL USUARIO
        System.out.println("La palabra tiene "+cont_letras+" vocales");
    }
}
