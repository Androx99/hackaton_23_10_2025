// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    //inicializamos el array
        int[] fibonacci = new int[15];
    //bucle for para calcular los numeros de el array
        for(int i= 0; i<fibonacci.length; i++){ //recorremos el array
            //teniendo en cuenta que el primer numero de la serie es 0
            if(i == 0){
                fibonacci[i]= 0; //rellenamos el primer espacio de la lista con 0
            } else if(i == 1){ //sabemos que el segundo numero de la serie es 1
                fibonacci[i]=1;//rellenamos el segundo espacio de la lista con 1
            }else{ //Calcularemos el resto de los numeros teniendo ya los dos primeros
                // El número en la posición "i" es la suma de los dos números anteriores
                fibonacci[i] = fibonacci[i-1]+ fibonacci[i-2];
            }
        }
        //Ahora mostraremos el array por pantalla

        System.out.println("Los primeros 15 numeros de la serie de Fibonacci son:");
        for (int i= 0;i <fibonacci.length; i++) {  // Usamos un bucle "for-each" para recorrer el array
            System.out.print(fibonacci[i] + " ");  // Imprimimos cada número seguido de un espacio en la misma línea
        }
    }
}