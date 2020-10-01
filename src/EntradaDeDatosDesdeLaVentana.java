import javax.swing.*;

public class EntradaDeDatosDesdeLaVentana {
    public static void main(String[] args) {

        String NumeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero: ");
        /*Manejo de excepciones*/

        //try: Trata de ejecutar una pequeña parte de codigo, si sale bien, el programa sigue sin problemas.
        //dado el caso de que algo no funcione, le pasa el error al catch para que este se ejecute y interprese el error.
        //catch: Es un bloque de código alternativo para manejar el error.

        int NumeroDecimal = 0;
        try {
            //por si digito una cadena de strings, esto me lo convierte a enteros.
            //si toodo sale bien, no ejecutara el catch y seguira con el flujo del programa.
            NumeroDecimal = Integer.parseInt(NumeroStr);
            //En caso de que ocurra un error, el catch va a capturar este error
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Debe Ingresar un número entero!");
            //para no volver a llamar la variable, llamo directamente al método main con su parámetro.
            main(args);

            //Ahora me tengo que salir, por que no quiero un bucle infinito xD
            //Puedo utilizar return; para retornar al void, o utilizar el método system.
            System.exit(0); //con 0 para indicar que no tengo ningún problema.

        }

        System.out.println("NumeroDecimal = " + NumeroDecimal);

        String ResultoBinario = "Numero Binario de " + NumeroDecimal + " = " + Integer.toBinaryString(NumeroDecimal);
        System.out.println(ResultoBinario);

        int NumeroBinario = 0B11110;
        System.out.println("NumeroBinario = " + NumeroBinario);

        String ResultadoOctal = "Numero Octal de " + NumeroDecimal + " = " + Integer.toOctalString(NumeroDecimal);
        System.out.println(ResultadoOctal);

        int NumeroOctal = 036;
        System.out.println("NumeroOctal = " + NumeroOctal);

        String ResultadoHexadecimal = "Numero Hexadecimal de " + NumeroDecimal + " = " + Integer.toHexString(NumeroDecimal);
        System.out.println(ResultadoHexadecimal);

        int NumeroHexadecimal = 0X1E;
        System.out.println(NumeroHexadecimal);

        String Alerta = ResultoBinario;
        Alerta += "\n" + ResultadoOctal;
        Alerta += "\n" + ResultadoHexadecimal;

        //Mostrare una ventana emergente con los resultados.
        JOptionPane.showMessageDialog(null, Alerta);

    }
}
