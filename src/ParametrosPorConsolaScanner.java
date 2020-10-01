import java.util.Scanner;
import java.util.InputMismatchException;

public class ParametrosPorConsolaScanner {
    public static void main(String[] args) {
        //En este programa le pediré los datos al usuario, pero por medio de la consola.

        /*Utilizare la clase Scanner, Escanea la terminal para poder obtener
        parámetros del usuario*/

        //System.in significa que estoy recibiendo datos desde la consola.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");

        //scanner.nextLine();Este método es para lograr obtener
        // la linea en la terminal que el usuario ingreso.
        /*
        * El NextLine lo que hace es dejar esperando la consola hasta que el
        * usuario ingresa el numero, una vez que se ingresa el numero
        * se le asigna a la variable NumeroStr.
        * */
        //String NumeroStr = scanner.nextLine();

        int NumeroDecimal = 0;
        try {
            NumeroDecimal = scanner.nextInt(); //para convetir a enteros directamente.
            //catch (Exception e) seria la excepcion padre, y las demas las hijas.
        }catch (InputMismatchException e){ //aqui pongo las excepciones o errores que quiero que evite.
            System.out.println("Debe Ingresar un número entero!");
            main(args);
            System.exit(0);
        }
        System.out.println("NumeroDecimal = " + NumeroDecimal);

        String ResultoBinario = "Numero Binario de " + NumeroDecimal + " = " + Integer.toBinaryString(NumeroDecimal);

        String ResultadoOctal = "Numero Octal de " + NumeroDecimal + " = " + Integer.toOctalString(NumeroDecimal);

        String ResultadoHexadecimal = "Numero Hexadecimal de " + NumeroDecimal + " = " + Integer.toHexString(NumeroDecimal);


        String Alerta = ResultoBinario;
        Alerta += "\n" + ResultadoOctal;
        Alerta += "\n" + ResultadoHexadecimal;

        System.out.println(Alerta);
    }
}
